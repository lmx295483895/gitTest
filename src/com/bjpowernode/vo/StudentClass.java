package com.bjpowernode.vo;

public class StudentClass {
    private String sId;
    private String sName;
    private Integer sAge;
    private String sClass;
    private String cId;
    private String cClass;

    public StudentClass() {
    }

    public StudentClass(String sId, String sName, Integer sAge, String sClass, String cId, String cClass) {
        this.sId = sId;
        this.sName = sName;
        this.sAge = sAge;
        this.sClass = sClass;
        this.cId = cId;
        this.cClass = cClass;
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public Integer getsAge() {
        return sAge;
    }

    public void setsAge(Integer sAge) {
        this.sAge = sAge;
    }

    public String getsClass() {
        return sClass;
    }

    public void setsClass(String sClass) {
        this.sClass = sClass;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getcClass() {
        return cClass;
    }

    public void setcClass(String cClass) {
        this.cClass = cClass;
    }

    @Override
    public String toString() {
        return "StudentClass{" +
                "sId='" + sId + '\'' +
                ", sName='" + sName + '\'' +
                ", sAge=" + sAge +
                ", sClass='" + sClass + '\'' +
                ", cId='" + cId + '\'' +
                ", cClass='" + cClass + '\'' +
                '}';
    }
}
