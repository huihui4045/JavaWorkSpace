package com.alizhezi.reflex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/**
 * Created by gavin on 2018/1/8.
 */
public class ReflexDemo {


    public static void main(String[] args) {


        Class<?> clz = null;
        try {
            clz = Class.forName("com.alizhezi.reflex.Human");

            //测试构造方法
            //testConstructors(clz);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }





    }





    /*****
     * 测试构造方法
     * @param clz
     * @throws NoSuchMethodException
     */
    private static void testConstructors(Class<?> clz) throws NoSuchMethodException {
        Class<?> superclass = clz.getSuperclass();

        System.out.println("父类： = [" + superclass.getName() + "]");


        Class<?>[] interfaces = clz.getInterfaces();

        for (Class<?> anInterface : interfaces) {

            System.out.println("实现的接口： = [" + anInterface.getName() + "]");
        }


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

        Constructor<?> constructor = clz.getConstructor(int.class,String.class);

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
    }
}
