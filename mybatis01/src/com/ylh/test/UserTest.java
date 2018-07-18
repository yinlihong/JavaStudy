package com.ylh.test;

import com.ylh.mapper.UserMapper;
import com.ylh.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * Created By yinlihong on 2018/7/17 14:41.
 */
public class UserTest {
    private static SqlSessionFactory sqlSessionFactory;
    static{
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
    }
    @Test
    public void selectLikeName(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.selectLikeName("张");
        System.out.println(userList);
    }
    @Test
    public void selectByNameAndSex(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("张");
        user.setSex("1");
        List<User> userList = userMapper.selectByNameAndSex(user);
        System.out.println(userList);
    }
    @Test
    public void selectByIdAndName(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("王");
        user.setId(1);
        List<User> userList = userMapper.selectByIdAndName(user);
        System.out.println(userList);
    }
}
