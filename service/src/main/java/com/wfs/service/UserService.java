package com.wfs.service;


import com.wfs.base.User;
import com.wfs.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public List<User> findAllUser(){
        return  userDao.selectList(null);
    }
}
