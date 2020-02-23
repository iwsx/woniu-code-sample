package com.iwsx.spring.dao;

import com.iwsx.spring.entity.Address;

public interface IAddressDao {

  void addAddress(Address address);

  void removeAddress(Address address);
}
