/**
 * Created by molu_ on 2017/6/22.
 */
public class Demo1 {



    public static void main(String[] args) {

        Student student1=new Student("张三");

        Student student2=new Student("李四");

        student1.country="小日本";


        System.out.println(student1.toString());
        System.out.println(student2.toString());






    }


}

class Student{

    String name;

    static String country="中国";

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                "country='" + country + '\'' +
                '}';
    }
}
