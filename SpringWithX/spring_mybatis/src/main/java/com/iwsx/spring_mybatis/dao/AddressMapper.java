package com.iwsx.spring_mybatis.dao;

import com.iwsx.spring_mybatis.entity.Address;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface AddressMapper {

/*  @Insert("insert address(home, company) values(#{home}, #{company})")
  void addAddress();

  @Select("select * from address where id=#{id}")
  Address queryAddress(int id);*/

  void addAddress(Address address);

  void addAddress2(String home, String company);

  void addAddress3(@Param("home") String home, @Param("company") String company);

  void addAddress4(@Param("home") String home, String company);

  void addAddress5(@Param("home") String home, @Param("address") Address address);

  void addAddress6(@Param("addresses") List<Address> addresses);

  void updateAddress(Address address);

  void deleteAddress(int id);

  Address queryAddress(int id);

  Map<String, Object> queryAddressReturnMap(int id);

  @MapKey("home")
  Map<String, Address> queryAddressReturnMap2(int id);

  Address queryAddressReturnMap3(int id);

}
