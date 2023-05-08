package com.lhg.web.controller.sys;

import com.lhg.overseacommon.core.page.TableDataInfo;
import com.lhg.overseasystem.user.domain.User;
import com.lhg.overseasystem.user.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/system/user")
public class SysUserController extends BaseController{

    @Autowired
    private IUserService userService;

    @GetMapping("/listUser")
    public TableDataInfo listUser(User user){
        startPage();
        return getDataTable(userService.selectUserList(user));
    }




}
