package com.example.serializableparcelable.bean;

import android.os.Parcelable;

import java.io.Serializable;

/**
 * author：Admin
 * date：2017/11/2213:03
 * 编程使我快乐
 */

public class Teacher implements Serializable{

    private static final long serialVersionUID = 4638527951253447135L;
    private String name;
    private int age;

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
