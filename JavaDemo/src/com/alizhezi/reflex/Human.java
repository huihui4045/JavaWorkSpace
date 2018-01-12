package com.alizhezi.reflex;

/**
 * Created by gavin on 2018/1/8.
 */
public class Human implements IHumanAction {

    private int age;
    public String name;

    public Human() {
    }



    protected Human(int age) {
        this.age = age;
    }

    private Human(String name) {
        this.name = name;
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public void eat() {

    }

    private String getNum(){

        return null;
    }

    protected int  getNum(int a){

        return 1;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
