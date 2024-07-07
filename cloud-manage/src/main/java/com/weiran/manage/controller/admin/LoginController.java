package com.weiran.manage.controller.admin;

import com.weiran.common.obj.Result;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api("登录相关")
@RequiredArgsConstructor
@RequestMapping("/login")
public class LoginController {

    @PostMapping()
    public Result<Object> login() {
        String token = "login_token";
        return Result.success(token);
    }
}
