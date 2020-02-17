package com.sl.service;

import com.sl.dao.EasybuyUserMapper;
import com.sl.pojo.EasybuyUser;
import org.apache.ibatis.annotations.Param;

public interface EasybuyService {

    int addUser(EasybuyUser user);

    EasybuyUser queryUser(String loginName);
}
