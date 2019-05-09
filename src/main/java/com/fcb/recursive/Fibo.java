package com.fcb.recursive;

/**
 * @Author: Fcb
 * @Date: 2019/5/9
 * @Description:
 */
public class Fibo {

    public static final int ONE = 1;

    public static final int TWO = 2;


    public int fibo(int n){
        if(n == ONE || n == TWO){
            return 1;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}
