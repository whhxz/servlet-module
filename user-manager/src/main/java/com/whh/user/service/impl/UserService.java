package com.whh.user.service.impl;

import com.whh.service.user.IUserService;
import com.whh.service.user.vo.UserInfo;
import com.whh.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * UserServiceImpl
 * Created by xuzhuo on 2018/3/1.
 */
@Service
public class UserService implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<UserInfo> userList() {
        return userMapper.queryUserList();
    }
}
