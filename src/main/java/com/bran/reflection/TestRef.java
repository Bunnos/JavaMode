package com.bran.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * @author antiumbo
 * @date on 2018/6/1
 **/
public class TestRef {
    public static void main(String[] args) {
        try {
            Class stuClass = Class.forName("com.bran.reflection.Student");
//            new TestRef().getFields(stuClass);
            new TestRef().dealMethod(stuClass);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void dealMethod(Class stuClass) throws Exception {
        System.out.println("---获取所有公共方法---");
        Method[] methods = stuClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("---获取所有方法,可包括私有的---");
        methods = stuClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("---获取公有的show1()方法---");
        Method method = stuClass.getMethod("show1", String.class);
        System.out.println(method);
        Object object = stuClass.getConstructor().newInstance();
        method.invoke(object, "刘德华");
        Parameter[] parameters = method.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println("方法参数：" + parameter.getName());
        }
        System.out.println("---获取私有方法---");
        method = stuClass.getDeclaredMethod("show4", int.class);
        method.setAccessible(true);
        Object result = method.invoke(object, 5);
        System.out.println("返回值：" + result);
    }

    private void getFields(Class stuClass) throws Exception {
        // 获取公有字段
        System.out.println("---获取公有字段---");
        Field[] fields = stuClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        // 获取所有字段（私有，受保护，默认的）
        System.out.println("---获取所有字段（私有，受保护，默认的）---");
        fields = stuClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        // 获取公有字段并调用
        System.out.println("---获取公有字段并调用---");
        Field field = stuClass.getField("age");
        System.out.println(field);
        Object o = stuClass.getConstructor().newInstance();
        field.set(o, 2);
        Student student = (Student) o;
        System.out.println("验证age：" + student.age);

        // 获取私有字段并调用
        System.out.println("---获取私有字段并调用---");
        Field privateField = stuClass.getDeclaredField("firstName");
        System.out.println(privateField);
        privateField.setAccessible(true);
        privateField.set(o, "bran");
        System.out.println(student.getFirstName());
    }

    public void className() throws Exception {
        //第一种方式获取Class对象
        //这一new 产生一个Student对象，一个Class对象。
        Student stu1 = new Student();
        //获取Class对象
        Class stuClass = stu1.getClass();
        System.out.println(stuClass.getName());

        //第二种方式获取Class对象
        Class stuClass2 = Student.class;
        //判断第一种方式获取的Class对象和第二种方式获取的是否是同一个
        System.out.println(stuClass == stuClass2);

        //第三种方式获取Class对象
        //注意此字符串必须是真实路径，就是带包名的类路径，包名.类名
        Class stuClass3 = Class.forName("com.bran.reflection.Student");
        //判断三种方式是否获取的是同一个Class对象
        System.out.println(stuClass3 == stuClass2);
    }
}
