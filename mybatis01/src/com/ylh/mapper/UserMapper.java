package com.ylh.mapper;

import com.ylh.po.User;

import java.util.List;

/**
 * Created By yinlihong on 2018/7/18 14:13.
 */
public interface UserMapper {
    //根据名字模糊查询
    public List<User> selectLikeName(String name);
    //根据姓名和性别查询，参数为User类下的一个对象
    //多个查询条件
    public List<User> selectByNameAndSex(User user);
    //使用动态sql 多条件查询
    public List<User> selectByIdAndName(User user);
}
