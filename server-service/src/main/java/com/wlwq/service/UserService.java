package com.wlwq.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wlwq.pojo.User;

import java.util.List;

public interface UserService extends IService<User> {

    List<User> getUserList();

    User getUserById(long id);
}
