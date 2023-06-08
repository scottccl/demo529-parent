package com.wlwq.service.impl;

//import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wlwq.mapper.UserMapper;
import com.wlwq.pojo.User;
import com.wlwq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@DS("master")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
     UserMapper userMapper;

    public List<User> getUserList(){
        return userMapper.selectList(null);
    };

    public User getUserById(long id){
        return userMapper.selectMapById(id);
    }

}
