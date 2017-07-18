package cn.summerwaves.domain;

/**
 * Created by summerwaves on 2017/7/18.
 */
public class User {
    private String user_name;
    private String password;
    private int sex;

    public User(String user_name, String password, int sex) {
        this.user_name = user_name;
        this.password = password;
        this.sex = sex;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_name='" + user_name + '\'' +
                ", password='" + password + '\'' +
                ", sex=" + sex +
                '}';
    }
}
