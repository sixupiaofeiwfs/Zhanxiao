package com.wfs.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wfs.base.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends BaseMapper<User> {
}
