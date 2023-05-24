package com.lhg.web.controller.sys;

import com.alibaba.fastjson2.JSONObject;
import com.lhg.overseacommon.core.page.TableDataInfo;
import com.lhg.overseacommon.utils.HttpUtils;
import com.lhg.overseasystem.user.domain.User;
import com.lhg.overseasystem.user.service.IUserService;
import lombok.extern.slf4j.Slf4j;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
//@RequestMapping("/system/user")
public class SysUserController extends BaseController {

    @Autowired
    private IUserService userService;

    @GetMapping("/listUser")
    public TableDataInfo listUser(User user){
        startPage();
        return getDataTable(userService.selectUserList(user));
    }

    @PostMapping("/send")
    public String send() {
        JSONObject params = new JSONObject();
        params.put("id" ,"1234");
        params.put("name","zhang");
        String str = params.toJSONString();
        HttpUtils.sendPost("http://127.0.0.1:80/test",str);
        return "1";
    }

    @PostMapping("/test")
    @ResponseBody
    public String test(@RequestParam("param.id") String id, @RequestParam("param.name") String name){
        System.err.println("id:" + id);
        System.err.println("name:" + name);
        return "1";
    }


}
