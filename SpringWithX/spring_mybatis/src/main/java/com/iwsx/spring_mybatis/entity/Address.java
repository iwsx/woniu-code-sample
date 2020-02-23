package com.iwsx.spring_mybatis.entity;

/**
 * Created by iwsx on 2019/12/30
 */
public class Address {

    private int id;

    private String home;

    private String company;

    private PostCode pc;

    public Address() {
    }

    public Address(int id, String home, String company) {
        this.id = id;
        this.home = home;
        this.company = company;
    }

    public Address(int id, String home, String company, PostCode pc) {
        this.id = id;
        this.home = home;
        this.company = company;
        this.pc = pc;
    }

    public PostCode getPc() {
        return pc;
    }

    public void setPc(PostCode pc) {
        this.pc = pc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", home='" + home + '\'' +
                ", company='" + company + '\'' +
                ", postCode=" + pc +
                '}';
    }
}
