package service;

import pojo.User;

import java.util.List;

/**
 * @Author：dongtailei
 * @Description：
 * @Date：2018/3/2 14:35
 */
public interface UserService {

    //注册验证邮箱
    public boolean checkEmail(String email);

    //登陆验证用户
    public User checkUser(User user);

    public int getPageCount(int pageSize);

    public List showUser(int pageSize, int pageNow);
}
