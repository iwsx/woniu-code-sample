package com.iwsx.spring.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DbUtils {

  @Value("com.jdbc.driver.Oracle")
  private String driver;
  @Value("${jdbc.URL}")
  private String location;
  @Value("${jdbc.userName}")
  private String uid;
  @Value("${jdbc.password}")
  private String pwd;

  @Override
  public String toString() {
    return "DbUtils{" +
            "driver='" + driver + '\'' +
            ", location='" + location + '\'' +
            ", uid='" + uid + '\'' +
            ", pwd='" + pwd + '\'' +
            '}';
  }
/*
  public String getDriver() {
    return driver;
  }

  public void setDriver(String driver) {
    this.driver = driver;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public String getPwd() {
    return pwd;
  }

  public void setPwd(String pwd) {
    this.pwd = pwd;
  }
  */
}
