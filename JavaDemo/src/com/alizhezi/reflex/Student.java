package com.alizhezi.reflex;

/**
 * Created by gavin on 2018/1/9.
 */
public class Student extends Persion implements IWorker{

    public int num;

    private int socre;

    public Student(String name, int age, int height, int num, int socre) {
        super(name, age, height);
        this.num = num;
        this.socre = socre;
    }

    private Student(String name, int age, int num, int socre) {
        super(name, age);
        this.num = num;
        this.socre = socre;
    }

    public Student(String name, int age) {
        super(name, age);
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getSocre() {
        return socre;
    }

    private void setSocre(int socre) {
        this.socre = socre;
    }

    public String toString() {
        return "Student{" +
                "num=" + num +
                ", socre=" + socre +
                ",  name="+name+
                ",  age= "+age+
                '}';
    }

    @Override
    public void work() {

    }
}
