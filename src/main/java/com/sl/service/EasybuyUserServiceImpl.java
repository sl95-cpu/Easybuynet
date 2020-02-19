package com.sl.service;

import com.sl.dao.EasybuyUserMapper;
import com.sl.pojo.EasybuyUser;
import org.springframework.stereotype.Service;

@Service
public class EasybuyUserServiceImpl implements EasybuyUserService {

    private EasybuyUserMapper userMapper;

    public void setUserMapper(EasybuyUserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public int addUser(EasybuyUser user) {
        return userMapper.addUser(user);
    }

    public EasybuyUser queryUser(String loginName) {
        return userMapper.queryUser(loginName);
    }
}
