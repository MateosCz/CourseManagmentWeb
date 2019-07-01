package com.test.demo.Controller;

import com.test.demo.Bean.UserBean;
import com.test.demo.Service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.jws.WebParam;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {


    @Resource
    private UserService userService;

    @RequestMapping("/")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("login");
        return modelAndView;
    }


    @PostMapping("/login")
    public ModelAndView login(@RequestParam("userID")String userID,@RequestParam("password") String password){
        ModelAndView success = new ModelAndView();

        UserBean userBean = userService.getUserByID(userID,password);

        if(userID.equals(userBean.getUserID())&&password.equals(userBean.getPassword())){
            success.setViewName("success");
            success.addObject("userID",userID);
            success.addObject("password",password);
        }
        else success.setViewName("404");

        return success;
    }

}
