package com.ylh.dao;

import com.ylh.po.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created By yinlihong on 2018/7/18 11:12.
 */
public class UserDaoImplTest {
    @Test
    public void deleteByIdList() throws Exception {
        UserDao dao = new UserDaoImpl();
        List<Integer> list = new ArrayList<>();
        list.add(32);
        list.add(28);
        list.add(29);
        dao.deleteByIdList(list);
    }

    @Test
    public void selectByLikeName() throws Exception {
        
    }

    @Test
    public void updateUser() throws Exception {
        UserDao dao = new UserDaoImpl();
        User user = new User();
        user.setId(31);
        user.setUsername("小小");
        user.setSex("女");
        user.setBirthday(new Date());
        user.setAddress("保定");
        dao.updateUser(user);
    }

    @Test
    public void deleteUser() throws Exception {
        UserDao dao = new UserDaoImpl();
        dao.deleteUser(30);
    }

}