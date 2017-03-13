package com.luculent.service;

import com.luculent.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yue on  2017/3/5 0005.
 */

public interface  UserServer {
    /**
     * 添加一个用户
     * @param user 用户对象
     * @since 2016年9月21日20:58:17
     * @return 是否添加成功
     */
    public boolean add(User user);
    public List<User> findAll();
}
