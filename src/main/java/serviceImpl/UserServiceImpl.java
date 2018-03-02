package serviceImpl;

import pojo.User;
import service.UserService;

import java.util.List;

/**
 * @Author：dongtailei
 * @Description：
 * @Date：2018/3/2 14:35
 */
public class UserServiceImpl implements UserService{
    public boolean checkEmail(String email) {
        return false;
    }

    public User checkUser(User user) {
        return null;
    }

    public int getPageCount(int pageSize) {
        return 0;
    }

    public List showUser(int pageSize, int pageNow) {
        return null;
    }
}
