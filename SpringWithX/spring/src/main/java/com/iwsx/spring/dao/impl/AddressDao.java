package com.iwsx.spring.dao.impl;

import com.iwsx.spring.dao.IAddressDao;
import com.iwsx.spring.entity.Address;
import org.springframework.stereotype.Component;

@Component
public class AddressDao implements IAddressDao {

  public void addAddress(Address address) {
    System.out.println("成功插入地址信息");
  }

  public void removeAddress(Address address) {
    System.out.println("删除地址信息");
  }
}
