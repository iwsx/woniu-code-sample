package com.iwsx.spring_ssm.factory;

import java.util.LinkedHashMap;

public class FilterChainDefinitionMapBuilder {

  public LinkedHashMap<String, String> filterChainDefinitionMap(){
    LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();

    map.put("/login.jsp", "anon");
    map.put("/**", "authc");
    return map;
  }
}
