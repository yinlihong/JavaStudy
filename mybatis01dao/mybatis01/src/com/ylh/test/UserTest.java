package com.ylh.test;

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
   static SqlSession sqlSession=null;
   @BeforeClass//比较适合加载配置文件
   public static void before() throws IOException {
       //先加载mybatis配置文件
       String path = "SqlMapConfig.xml";
       InputStream inputStream = Resources.getResourceAsStream(path);
       //生成sql会话工厂类对象
       SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
       //获取sqlSession对象也就是一次sql会话对象
        sqlSession = sqlSessionFactory.openSession();
   }
    //定义一个查询数据库并获取数据库数据的方法
    @Test
    public void selectAllUser() throws IOException {
        //System.out.println("测试成功");
        //使用sqlSession进行sql操作
        //selectList
        List<User> userList = sqlSession.selectList("user.selectAllUser");
        System.out.println(userList);
    }
    @Test
    public void selectExactId() throws IOException {
        User user = sqlSession.selectOne("selectExactId",1);
        System.out.println(user);
    }
    @Test
    public void selectExactUserName() throws IOException {
        User user = sqlSession.selectOne("selectExactUserName","张三");
        System.out.println(user);
    }
    @Test
    public void findUserLikeName(){
        List<User> userList = sqlSession.selectList("user.findUserLikeName","张");
        System.out.println(userList);
    }
    @Test
    public void insertUser(){
        User user = new User();
        user.setUsername("明明");
        user.setSex("男");
        user.setBirthday(new Date());
        user.setAddress("大连");
       sqlSession.insert("user.insertUser",user);
       //提交
       sqlSession.commit();
        System.out.println("插入的id为"+user.getId());
    }
    @Test
    public void updateUser(){
        User user = new User();
        user.setId(31);
        user.setUsername("小丽");
        user.setSex("女");
        user.setBirthday(new Date());
        user.setAddress("天津");
        sqlSession.update("user.updateUser",user);
        //提交
        sqlSession.commit();
        System.out.println("更新的id为"+user.getId());
    }
    @After
    public void after(){
        //关闭会话操作
        sqlSession.close();
    }
}
