package demo;

/**
 * Created by gavin on 2017/9/15.
 */
public class Person {

    private String name="裴银辉";

    protected int age;

    public  int weight;

    public Person() {
        System.out.println("无参构造函数");
    }

    public Person(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;

        System.out.println("Person 有参构造函数");
    }

    private String getName(){

        return name;
    }

    protected int getAge(){

        return age;
    }

    public  int getWeight(){
        return weight;
    }
}
