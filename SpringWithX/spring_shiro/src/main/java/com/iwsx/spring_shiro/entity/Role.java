package com.iwsx.spring_shiro.entity;

/**
 * 角色
 */
public class Role {
    private String id;
    private String rolename;
    /**
     * 资源
     */
    public class Resource {
        private String id;
        private String resname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }
}
