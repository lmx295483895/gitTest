package com.bjpowernode.domain;

public class Student {
    private String id;
    private String name;
    private Integer age;
    private String classroom;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", classroom='" + classroom + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public Student(String id, String name, Integer age, String classroom) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.classroom = classroom;
    }
}
