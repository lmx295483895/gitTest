package com.bjpowernode.util;



import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import java.io.IOException;
import java.io.InputStream;

public class SqlSessionUtil {
    private SqlSessionUtil(){}

    private static SqlSessionFactory sqlSessionFactory;

    static{
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    private static ThreadLocal<SqlSession> threadLocal = new ThreadLocal<>();

    public static SqlSession getSession(){
        SqlSession session = threadLocal.get();
        if(session == null){
            session = sqlSessionFactory.openSession();
            threadLocal.set(session);
        }
        return session;
    }

    public static void close(SqlSession session){
        if(session != null){
            session.close();
            threadLocal.remove();
        }
    }
}
