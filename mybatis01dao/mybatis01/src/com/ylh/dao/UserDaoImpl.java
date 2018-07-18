package com.ylh.dao;

import com.ylh.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created By yinlihong on 2018/7/18 11:00.
 */
public class UserDaoImpl implements UserDao {
    //实现类
    private static SqlSessionFactory sqlSessionFactory;

    //静态块
    static {
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //生成sql会话工厂类对象
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }
    //下面这些方法通过Alt+Enter->Implement methods生成
//根据id删除
    @Override
    public void deleteUser(int id) {
        //获取会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.delete("user.deleteById",id);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void updateUser(User user) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.update("user.updateUser",user);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public List<User> selectByLikeName(String userName) {
        return null;
    }

    @Override
    public void insertUser(User user) {

    }

    @Override
    public void selectById(Integer id) {

    }

    @Override
    public void deleteByIdList(List idList) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.delete("user.deleteByIdList",idList);
        sqlSession.commit();
        sqlSession.close();
    }
}
