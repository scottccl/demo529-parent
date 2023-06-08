package com.wlwq.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wlwq.entity.SysMenu;
import com.wlwq.mapper.SysMenuMapper;
import com.wlwq.service.SysMenuService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
*  针对表【sys_menu】的数据库操作Service实现
*/
@Transactional
@Service
public class SysMenuServiceImpl extends ServiceImpl<SysMenuMapper, SysMenu>
    implements SysMenuService{

    @Override
    public List<SysMenu> buildTreeMenu(List<SysMenu> sysMenuList) {
        List<SysMenu> resultMenuList=new ArrayList<>();

        for(SysMenu sysMenu:sysMenuList){

            // 寻找子节点
            for(SysMenu e:sysMenuList){
                if(e.getParentId()==sysMenu.getId()){
                    sysMenu.getChildren().add(e);
                }
            }

            if(sysMenu.getParentId()==0L){
                resultMenuList.add(sysMenu);
            }
        }

        return resultMenuList;
    }
}




