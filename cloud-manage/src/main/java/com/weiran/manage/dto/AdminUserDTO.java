package com.weiran.manage.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Data
public class AdminUserDTO {

    private Integer id;
    private String username;
    @JsonIgnore
    private String password;
    private Boolean isBan;
    private String phone;
    private String name;
    private String avatar;
    private String role;
    private List<RoleDTO> roles;
    public List<PermissionDTO> permissions = new ArrayList<>();

}
