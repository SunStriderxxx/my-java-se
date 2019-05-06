package com.fcb.reflection;

import com.fcb.bean.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Author: Fcb
 * @Date: 2019/5/6
 * @Description: 反射,在运行中调用类的文件
 */
public class MyReflection {

    public static void main(String[] args) throws Exception {
//        Class clazz1 = Test.class;
        Class clazz2 = null;
        try {
            clazz2 = Class.forName("com.fcb.bean.Test");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
//        Test test = new Test();
//        Class clazz3 = test.getClass();
//        System.out.println(clazz1);
        System.out.println(clazz2);
//        System.out.println(clazz3);
        Object o = clazz2.newInstance();
        Constructor constructor1 = clazz2.getConstructor();
        Constructor constructor2 = clazz2.getConstructor(String.class);
        Constructor[] constructors = clazz2.getConstructors();
        Object o1 = constructor1.newInstance();
        Object o2 = constructor2.newInstance("fcb");
//        Test test = (Test)o;
//        String name = test.getName();
        Test test1 = (Test)o1;
        String name1 = test1.getName();
        Test test2 = (Test)o2;
        String name2 = test2.getName();
        System.out.println(name1);
        System.out.println(name2);

        Method[] methods = clazz2.getMethods();
        Method study = clazz2.getMethod("study");
        study.invoke(o2);
        Method sleep = clazz2.getDeclaredMethod("sleep", int.class);
        sleep.setAccessible(true);
        sleep.invoke(o2, 10);

        Field[] fields = clazz2.getFields();
//        Field name = clazz2.getField("name");
//        name.set(o2, "haha");
//        System.out.println(name.get(o2));
        Field age = clazz2.getDeclaredField("age");
        age.setAccessible(true);
        age.set(o2, 15);
        System.out.println(age.get(o2));

    }

}
