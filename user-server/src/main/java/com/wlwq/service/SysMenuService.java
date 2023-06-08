package com.wlwq.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wlwq.entity.SysMenu;

import java.util.List;

/**
* 针对表【sys_menu】的数据库操作Service
*/
public interface SysMenuService extends IService<SysMenu> {

    List<SysMenu> buildTreeMenu(List<SysMenu> sysMenuList);
}
