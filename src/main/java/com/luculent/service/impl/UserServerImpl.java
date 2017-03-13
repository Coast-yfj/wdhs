package com.luculent.service.impl;

import com.luculent.domain.User;
import com.luculent.domain.mappers.UserMapper;
import com.luculent.service.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yue on  2017/3/5 0005.
 */
@Repository
public class UserServerImpl implements UserServer {
    @Autowired
    private UserMapper mapper;
    @Override
    public boolean add(User user) {
        return mapper.insert(user)>0;
    }
    public List<User> findAll() {
        return mapper.selectByExample(null);
    }
}
