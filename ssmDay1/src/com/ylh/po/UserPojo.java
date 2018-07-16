package com.ylh.po;

import java.util.List;

/**
 * Created By yinlihong on 2018/7/16 15:45.
 */
public class UserPojo {
    //UserPojo是包装类，包装user和其他类
    private List<User> userList;

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
