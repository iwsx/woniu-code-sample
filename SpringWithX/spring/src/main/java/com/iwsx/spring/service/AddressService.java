package com.iwsx.spring.service;

import com.iwsx.spring.dao.impl.AddressDao;
import com.iwsx.spring.entity.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AddressService {

  @Autowired
  private AddressDao dao;

  public void addAddress(Address address){
    dao.addAddress(address);
  }

  public void removeAddress(Address address){
    dao.removeAddress(address);
  }
}
