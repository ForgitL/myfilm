package serviceImpl;

import dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.User;
import service.UserService;

import java.util.List;

/**
 * @Author：dongtailei
 * @Description：
 * @Date：2018/3/2 14:35
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    public boolean checkEmail(String email) {
        return false;
    }

    public User checkUser(User user) {
        return userMapper.getUser(user.getUEmail(),user.getUPassword());
    }

    public int getPageCount(int pageSize) {
        return 0;
    }

    public List showUser(int pageSize, int pageNow) {
        return null;
    }

    public List<User> showUser() {
        return userMapper.selectAll();
    }
}
