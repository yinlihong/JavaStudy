package com.ylh.dao;

import com.ylh.po.User;

import java.util.List;

/**
 * Created By yinlihong on 2018/7/18 10:55.
 */
public interface UserDao {
    //根据id删除
    public void deleteUser(int id);
    //更新
    public void updateUser(User user);
    //模糊查询
    public List<User> selectByLikeName(String userName);
    //插入
    public void insertUser(User user);
    //根据id查询
    public void selectById(Integer id);
    //批量删除
    public void deleteByIdList(List idList);

}
