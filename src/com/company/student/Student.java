package com.company.student;

public class Student {
    private String name;
    private String surName;
    private int studenNumber;

    public Student(String name, String surName, int studenNumber) {
        this.name = name;
        this.surName = surName;
        this.studenNumber = studenNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getStudenNumber() {
        return studenNumber;
    }

    public void setStudenNumber(int studenNumber) {
        this.studenNumber = studenNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", studenNumber=" + studenNumber +
                '}';
    }
}
