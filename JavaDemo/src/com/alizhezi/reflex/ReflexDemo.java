package com.alizhezi.reflex;

import java.lang.reflect.*;

/**
 * Created by gavin on 2018/1/8.
 */
public class ReflexDemo {


    public static void main(String[] args) {


        Class<?> clz = null;
        try {
            clz = Class.forName("com.alizhezi.reflex.Student");



            if (clz!=null){

                //testSuperclass(clz);

                //测试构造方法
                //testConstructors(clz);

                //测试方法
              //testMethod(clz);

                //测试成员变量
                //testField(clz);

              //  String name, int age, int height, int num, int socre
                try {
                    Constructor<?> declaredConstructor = clz.
                            getDeclaredConstructor(String.class, int.class, int.class, int.class, int.class);

                    Student student = (Student) declaredConstructor.newInstance("lvpeng", 23, 172, 1001, 99);


                    System.out.println(student.toString());


                    Method setName = clz.getMethod("setName", String.class);

                    //setName.setAccessible(true);

                    setName.invoke(student,"huihui");

                    System.out.println(student.toString());


                    Field name = clz.getField("name");

                    name.setAccessible(true);
                    name.set(student,"pei huihui");

                    System.out.println(student.toString());

                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                } catch (NoSuchFieldException e) {
                    e.printStackTrace();
                }


            }






        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    private static void testField(Class<?> clz) {
        System.out.println("获取类的所有  public属性的成员变量（包括继承类） getFields");

        Field[] fields = clz.getFields();

        for(Field field : fields) {
            System.out.println(Modifier.toString(field.getModifiers()) + " " + field.getName());
        }

        System.out.println("获取类的所有成员变量(仅限本类) getDeclaredFields");

        Field[] declaredFields = clz.getDeclaredFields();

        for (Field declaredField : declaredFields) {

            System.out.println(Modifier.toString(declaredField.getModifiers()) + " " + declaredField.getName());

        }
    }


    /***
     * 获取父类和接口
     * @param clz
     */
    private static void  testSuperclass(Class<?> clz){

        if(clz != null) {
            Class superClass = clz.getSuperclass();
            System.out.println("该类的父类：");
            System.out.println(superClass.getName());

            System.out.println("该类实现的接口：");
            Class[] interfaces = clz.getInterfaces();
            for (Class clazz : interfaces) {
                System.out.println(clazz.getName());
            }
        }
    }

    /****
     * 反射  method
     * @param clz
     */
    private static void testMethod(Class<?> clz) {
        System.out.println("======="+"获取该类 public 的getMethods()");
        Method[] methods = clz.getMethods();



        for (Method method : methods) {
            System.out.println(Modifier.toString(method.getModifiers()) + " " +
                    method.getReturnType() + " " +
                    method.getName());
        }


        System.out.println("======="+"获取该类 所有的 getDeclaredMethods()");


        Method[] declaredMethods = clz.getDeclaredMethods();

        for (Method declaredMethod : declaredMethods) {

            System.out.println(Modifier.toString(declaredMethod.getModifiers()) + " " +
                    declaredMethod.getReturnType() + " " +
                    declaredMethod.getName());
        }
    }


    /*****
     * 测试构造方法
     * @param clz
     * @throws NoSuchMethodException
     */
    private static void testConstructors(Class<?> clz)  {

        int modify;

        //public 构造方法
        Constructor<?>[] constructors = clz.getConstructors();

        for (Constructor<?> constructor : constructors) {


            modify=constructor.getModifiers();

            System.out.println(Modifier.toString(modify)+"构造方法的名字："+constructor.getName());
        }


        System.out.println("====获取所有的构造方法======");

        //获取所有的构造方法
        Constructor<?>[] declaredConstructors = clz.getDeclaredConstructors();

        for (Constructor<?> declaredConstructor : declaredConstructors) {

            modify=declaredConstructor.getModifiers();

            System.out.println(Modifier.toString(modify)+"构造方法的名字："+declaredConstructor.getName());

        }

        System.out.println("====根据参数获public构造函数======");



        /*try {
            Constructor<?>  constructor = clz.getConstructor(int.class,String.class);

            if (constructor!=null){

                modify=constructor.getModifiers();

                System.out.println(Modifier.toString(modify)+"构造方法的名字："+constructor.getName());
            }
            System.out.println("====根据参数获取所有构造函数======");

            Constructor<?> declaredConstructor = clz.getDeclaredConstructor(int.class);

            if (declaredConstructor!=null){

                modify=declaredConstructor.getModifiers();

                System.out.println(Modifier.toString(modify)+"构造方法的名字："+declaredConstructor.getName());

            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }*/


    }
}
