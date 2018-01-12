package com.alizhezi.reflex;

/**
 * Created by gavin on 2018/1/9.
 */
public class Persion {

    public String name;

    public int age;

    protected int height;

    public Persion(String name) {
        this.name = name;
    }

    public Persion(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public Persion(String name, int age) {
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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
