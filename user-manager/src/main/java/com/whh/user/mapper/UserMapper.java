package com.whh.user.mapper;

import com.whh.service.user.vo.UserInfo;

import java.util.List;

/**
 * UserMapper
 * Created by xuzhuo on 2018/3/1.
 */
public interface UserMapper {
    List<UserInfo> queryUserList();
}
