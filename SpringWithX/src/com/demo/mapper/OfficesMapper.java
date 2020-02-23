package com.demo.mapper;

import com.demo.pojo.Offices;
import com.demo.pojo.OfficesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OfficesMapper {
    long countByExample(OfficesExample example);

    int deleteByExample(OfficesExample example);

    int deleteByPrimaryKey(String officecode);

    int insert(Offices record);

    int insertSelective(Offices record);

    List<Offices> selectByExample(OfficesExample example);

    Offices selectByPrimaryKey(String officecode);

    int updateByExampleSelective(@Param("record") Offices record, @Param("example") OfficesExample example);

    int updateByExample(@Param("record") Offices record, @Param("example") OfficesExample example);

    int updateByPrimaryKeySelective(Offices record);

    int updateByPrimaryKey(Offices record);
}