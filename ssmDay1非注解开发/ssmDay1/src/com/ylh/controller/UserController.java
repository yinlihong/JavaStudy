package com.ylh.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created By yinlihong on 2018/7/16 10:53.
 */
public class UserController implements Controller{
    //在springmvc中加入"/user.do"
    @Override//Alt+Enter
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        //加载前端jsp页面
        //jsp页面的创建:右击->new->JSP/JSPX
        ModelAndView modelAndView = new ModelAndView();
        //传递一个变量name值到jsp页面
        modelAndView.addObject("name","张");
        //渲染前端jsp页面
        modelAndView.setViewName("list");
        return modelAndView;
    }
}
