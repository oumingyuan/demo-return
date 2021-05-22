package com.example.demoreturn.controller;

import com.example.demoreturn.model.CommonResponse;
import com.example.demoreturn.model.CommonReturnType;
import com.example.demoreturn.model.ResultMapUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("hello")
    public CommonResponse<Users> hello() {
        return new CommonResponse<>();
    }

    @GetMapping("/get")
    public CommonReturnType getUser() {
        // 返回通用对象
        return CommonReturnType.create("userVO");
    }

    @GetMapping(value = "/getUser")
    public Map<String, Object> getAllUsers() {
        Map<String, Object> mapResult = new HashMap<>();
        List<Users> users = new ArrayList<>();
        Users user1 = new Users();
        user1.setAge(12);
        user1.setName("hello");
        Users user2 = new Users();
        user2.setName("world");
        user2.setAge(18);
        users.add(user1);
        users.add(user2);
        ResultMapUtils.makeResultMap(mapResult, ResultMapUtils.SUCCESS, "获取所有用户信息成功", "data", users);
        return mapResult;
    }


}
