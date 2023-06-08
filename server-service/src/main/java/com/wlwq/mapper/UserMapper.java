package com.wlwq.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wlwq.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface UserMapper extends BaseMapper<User>{

    User selectMapById(Long id);

    Page<User> selectPageVo(@Param("page") Page<User> page, @Param("age")Integer age);

}
