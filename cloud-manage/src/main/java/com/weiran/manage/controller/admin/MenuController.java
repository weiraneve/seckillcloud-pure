package com.weiran.manage.controller.admin;

import com.weiran.common.obj.Result;
import com.weiran.manage.dto.PermissionMenuDTO;
import com.weiran.manage.service.AdminUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@Api("管理员菜单")
@RequiredArgsConstructor
@RequestMapping("/menu")
public class MenuController {

    private final AdminUserService adminUserService;

    @GetMapping
    @ApiOperation("获取管理员权限菜单(pure版 默认返回")
    public Result<List<PermissionMenuDTO>> findByMenus() {
        String defaultRoleName = "super_admin";
        List<PermissionMenuDTO> menus = adminUserService.findByMenus(defaultRoleName);
        return Result.success(menus);
    }
}
