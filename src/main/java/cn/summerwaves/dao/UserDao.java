package cn.summerwaves.dao;

import org.apache.ibatis.annotations.Insert;

/**
 * Created by summerwaves on 2017/7/18.
 */
public interface UserDao {
    void insertUser();

    @Insert("INSERT INTO user(user_name,password,sex)VALUE (#{userName},#{password},#{sex});")
    void insertUserByAnnotation(String userName,String password,int sex);
}
