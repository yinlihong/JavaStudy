package com.ylh.po;

/**
 * Created By yinlihong on 2018/7/16 15:26.
 */
public class User {
    private Integer id;
    private String name;
    private String sex;
    private Integer age;

    @Override
    public String toString() {
        return "学号为" + id + "姓名为" + name + "性别为" + sex + "年龄为" + age ;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
