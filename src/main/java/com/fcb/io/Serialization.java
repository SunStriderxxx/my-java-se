package com.fcb.io;

import java.io.Serializable;

/**
 * @Author: Fcb
 * @Date: 2019/5/9
 * @Description: 序列化
 */
public class Serialization implements Serializable {

    private int num;

    private String name;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
