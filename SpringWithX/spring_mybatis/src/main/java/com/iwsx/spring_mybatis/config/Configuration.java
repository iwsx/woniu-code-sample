package com.iwsx.spring_mybatis.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by iwsx on 2019/12/30
 */
@Component
public class Configuration {
    @Value("${jdbc.driverClassName}")
    private String dbDriver;
    @Value("${jdbc.url}")
    //@Value("#{configProperties['jdbc.url']}")
    private String dbUrl;
    @Value("${jdbc.username}")
    private String dbUsername;
    @Value("${jdbc.password}")
    private String dbPasswd;
    public String getDbDriver() {
        return dbDriver;
    }
    public String getDbUrl() {
        return dbUrl;
    }
    public String getDbUsername() {
        return dbUsername;
    }
    public String getDbPasswd() {
        return dbPasswd;
    }
}
