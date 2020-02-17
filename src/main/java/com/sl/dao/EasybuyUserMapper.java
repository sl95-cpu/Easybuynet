package com.sl.dao;

import com.sl.pojo.EasybuyUser;
import org.apache.ibatis.annotations.Param;

public interface EasybuyUserMapper {

    int addUser(EasybuyUser user);

    EasybuyUser queryUser(@Param("loginName") String loginName);

}
