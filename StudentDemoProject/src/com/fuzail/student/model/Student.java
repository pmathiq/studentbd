package com.fuzail.student.model;

public class Student {

    // TODO: Always keep fields private and provide getter/setter method - This is Encapsulation concept.
    //
    private int regNumber;
    private String name;
    private String section;
    private String dept;

    public Student(){

    }

    public Student(int regNumber, String name, String section, String dept) {
        this.regNumber = regNumber;
        this.name = name;
        this.section = section;
        this.dept = dept;
    }

    public int getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(int regNumber) {
        this.regNumber = regNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Student{" +
                "regNumber=" + regNumber +
                ", name='" + name + '\'' +
                ", section='" + section + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}
