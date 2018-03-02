package dao;

import pojo.User;

import java.util.List;

/**
 * @Author：dongtailei
 * @Description：
 * @Date：2018/3/2 14:34
 */
public interface UserMapper {

    public User getUser(String email,String password);
    public List<User> selectAll();
}
