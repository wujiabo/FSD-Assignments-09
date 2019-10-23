package com.wujiabo.fsd.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DBMapper {

    @Select("select version()")
    String dbVersion();

}
