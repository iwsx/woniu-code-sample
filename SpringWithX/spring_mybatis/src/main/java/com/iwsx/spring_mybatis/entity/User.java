package com.iwsx.spring_mybatis.entity;

/**
 * Created by iwsx on 2019/12/30
 */

import org.springframework.beans.factory.annotation.Required;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Date;

/**
 * Created by iwsx on 2019/12/20
 * @Required 受影响的 bean 属性在配置时必须放在 XML 配置文件中，否则容器就会抛出一个 BeanInitializationException 异常
 * @Autowired 执行 byType 自动连接
 * @Resource 遵循 by-name 自动连接语义
 * @Qualifier 当有多个相同类型的bean时，@Qualifier用来区分到底要用哪个bean
 */
public class User {
    private String id;
    private String userName;
    private String password;
    private String name;
    private Integer age;
    private Integer sex;
    private Date birthday;
    private String created;
    private String updated;

    //当有多个相同类型的bean时，@Qualifier用来区分到底要用哪个bean
//    @Autowired
//    @Qualifier("address1")
//    private Address address;

    //@Resource(name = "address")
    private Address address;

    public User() {

    }

    public User(String userName, Integer age, Address address) {
        this.userName = userName;
        this.age = age;
        this.address = address;
    }

    public User(String userName, Integer age) {
        this.userName = userName;
        this.age = age;
    }


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    @Required
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    @Required
    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", created='" + created + '\'' +
                ", updated='" + updated + '\'' +
                ", address=" + address +
                '}';
    }

    @PostConstruct
    public void initUser(){
        System.out.println("初始化用户。。");
    }

    @PreDestroy
    public void destoryUser(){
        System.out.println("销毁用户。。");
    }

    public void sayHello(){
        System.out.println("hello world!");
    }
}
