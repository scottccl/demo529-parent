package com.wlwq.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wlwq.entity.SysUser;

/**
* 针对表【sys_user】的数据库操作Service
*/

public interface SysUserService extends IService<SysUser> {

    SysUser getByUsername(String username);

    String getUserAuthorityInfo(Long userId);
}
