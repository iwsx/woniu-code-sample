package com.iwsx.security.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

@Data
@AllArgsConstructor
public class User {
  private String userName;
  private String password;
  private Set<String> authorities;
}
