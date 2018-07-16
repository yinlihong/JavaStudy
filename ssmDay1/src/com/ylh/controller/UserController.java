package com.ylh.controller;

import com.ylh.po.User;
import com.ylh.po.UserPojo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created By yinlihong on 2018/7/16 10:53.
 */
//通过注解来注明当前类为控制器类 @Controller
@Controller
@RequestMapping("user")
public class UserController {
    //访问前端list.jsp页面
    @RequestMapping("user.do")
    public String toList(){
        //list代表list.jsp页面的名字
        return "list";
    }
    //toAdd方法只负责回显add.asp页面
    @RequestMapping("toAdd.do")
    public String toAdd(){
        return "add";
    }
    //用户提交id时访问的方法
    //方法参数的id要与form表单中name="id"一致
    @RequestMapping("addUserId")
    public String addUserId(Integer id){
        System.out.println("用户提交的id值为"+id);
        //回显成功页面
        return "success";
    }
    @RequestMapping("addUserName")
    public String addUserName(String name){
        System.out.println("用户提交的姓名为"+name);
        return "success";
    }
    @RequestMapping("addUser.do")
    public String addUser(User user){
        System.out.println(user);
        return "success";
    }
    @RequestMapping("addUserList.do")
    public String addUserList(UserPojo userPojo){
        System.out.println(userPojo.getUserList());
        return "success";
    }
}
