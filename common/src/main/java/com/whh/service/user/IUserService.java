package com.whh.service.user;

import com.whh.service.user.vo.UserInfo;

import java.util.List;

/**
 * IUserService
 * Created by xuzhuo on 2018/3/1.
 */
public interface IUserService {
    List<UserInfo> userList();
}
