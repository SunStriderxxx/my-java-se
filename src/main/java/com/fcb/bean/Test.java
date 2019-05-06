package com.fcb.bean;

/**
 * @Author: Fcb
 * @Date: 2019/5/6
 * @Description:
 */
public class Test {

    private Integer age;

    private String name;

    private String are;

    private Double money;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAre() {
        return are;
    }

    public void setAre(String are) {
        this.are = are;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public void  study(){
        System.out.println(getName() + "正在学习!");
    }

    private void sleep(int age){
        System.out.println(age + getName() + "正在休息!");
    }

    public Test() {
    }

    public Test(String name) {
        this.name = name;
    }
}
