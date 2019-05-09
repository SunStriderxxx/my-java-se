package com.fcb.others;

import com.fcb.bean.Test;

/**
 * @Author: Fcb
 * @Date: 2019/5/6
 * @Description:
 */
public class VariableParameter {

    public static void main(String[] args) {
        VariableParameter vp = new VariableParameter();
        vp.test(10);
        vp.test("fcb","tyt");
        vp.test("fcb");
        vp.test();
        vp.test("aa", "bb", "cc", "dd");
    }

    public void test(int i){
        System.out.println(i);
    }
//输入参数为数量固定相同类型，使用数组
    public void test(int[] arr){
        for(int i : arr){
            System.out.println(i);
        }
    }
//输入参数为类型不同，用类包装
    public void test(Test test){
        System.out.println(test.getAge());
        System.out.println(test.getName());
        System.out.println(test.getAre());
        System.out.println(test.getMoney());
    }
//输入变量为数量变化的参数，用可变参数
    public void test(String... strs){
        for (String str: strs){
            System.out.println(str);
        }
    }
}
