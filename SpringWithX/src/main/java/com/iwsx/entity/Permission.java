package com.iwsx.entity;

/**
 * Created by iwsx on 2019/12/25
 */
public class Permission {
    private int id;
    private String desc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "id=" + id +
                ", desc='" + desc + '\'' +
                '}';
    }
}
