package com.whh.user.controller;

import com.whh.service.user.IUserService;
import com.whh.service.user.vo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * UseController
 * Created by xuzhuo on 2018/3/1.
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping("index")
    public String userIndex(){
        return "user/index";
    }

    @RequestMapping("userList")
    @ResponseBody
    public List<UserInfo> userList(){
        return userService.userList();
    }
}
