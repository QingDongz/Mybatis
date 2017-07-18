package cn.summerwaves.dao;

import cn.summerwaves.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;




/**
 * Created by summerwaves on 2017/7/18.
 */
public class UserDaoTest {
    private SqlSessionFactory factory;


    @Before
    public void setUp() throws Exception {
        String resource = "mybatis-config.xml";
        factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream(resource));
    }



    @Test
    public void insertUser() throws Exception {
        SqlSession session = factory.openSession();
        User user = new User();
        user.setUserName("username");
        user.setPassword("password");
        user.setSex(1);
        session.insert("cn.summerwaves.mapper.UserDao.insertUser", user);
        session.commit();
        session.close();
        System.out.println("add user");

    }

}