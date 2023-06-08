package com.wlwq.controller;

import com.wlwq.entity.R;
import com.wlwq.entity.SysUser;
import com.wlwq.service.SysUserService;
import com.wlwq.util.JwtUtils;
import com.wlwq.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @auther: Scott C C Liu
 * @create: 2023-05-31 17:57
 * @Description
 */

@RestController
@RequestMapping("/user-service")
public class Controller {

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/user/list")
    //@PreAuthorize("hasRole('ROLE_admin2')")
    //@PreAuthorize("hasAuthority('system:user2:list')")
    public R userList(@RequestHeader(required = false)String jwtToken){
        //if(StringUtil.isNotEmpty(jwtToken)){
            Map<String,Object> resutlMap=new HashMap<>();
            List<SysUser> userList = sysUserService.list();
            resutlMap.put("userList",userList);

        for (SysUser suser : userList) {
            System.out.println("###### SysUser="+suser.toString());
        }
            return R.ok(resutlMap);
        //}else{
        //    return R.error(401,"没有权限访问");
        //}

    }

    @RequestMapping("/login")
    public R login(){
        String jwtToken = JwtUtils.genJwtToken("admin");
        return R.ok().put("jwtToken",jwtToken);
    }

}
