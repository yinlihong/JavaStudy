package com.ylh.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created By yinlihong on 2018/7/16 13:19.
 */
@Controller
//product/user.do避免了文件名相同导致的访问混乱
@RequestMapping("product")
public class ProductController{
   @RequestMapping("user.do")
    public String toList(){
       return "product";
   }
}
