package cn.summerwaves.dao;

import cn.summerwaves.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;




/**
 * Created by summerwaves on 2017/7/18.
 */
public class UserDaoTest {
    private SqlSessionFactory factory;
    private SqlSession session;


    @Before
    public void setUp() throws Exception {
        String resource = "mybatis-config.xml";
        factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream(resource));
        session = factory.openSession();
    }



    @Test
    public void insertUserByXML() throws Exception {
        User user = new User();
        user.setUserName("username");
        user.setPassword("password");
        user.setSex(1);
        session.insert("cn.summerwaves.dao.UserDao.insertUser", user);
        System.out.println("add user by XML");
    }

    @Test
    public void insertUserByAnnotation() throws Exception {
        User user = new User();
        user.setUserName("username");
        user.setPassword("password");
        user.setSex(1);
        session.insert("cn.summerwaves.dao.UserDao.insertUserByAnnotation", user);
        System.out.println("add user by annotation");
    }

    @After
    public void teardown() throws Exception {
        session.commit();
        session.close();

    }


}