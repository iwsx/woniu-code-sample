package com.iwsx.entity;

import java.util.List;

/**
 * Created by iwsx on 2019/12/25
 */
public class Role {
    private int id;
    private String roleName;
    private List<Permission> permissions;

    public Role(String roleName, List<Permission> permissions){
        this.roleName = roleName;
        this.permissions = permissions;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        roleName = roleName;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", RoleName='" + roleName + '\'' +
                ", permissions=" + permissions +
                '}';
    }
}
