package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.User;
import service.UserService;

import java.util.List;

/**
 * @Author：dongtailei
 * @Description：
 * @Date：2018/3/2 14:33
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    public UserService userService;

    @RequestMapping("/showUser")
    public String toIndex(Model model){
        List<User> list = this.userService.showUser();
        model.addAttribute("list",list);
        return "showUser";
    }
}
