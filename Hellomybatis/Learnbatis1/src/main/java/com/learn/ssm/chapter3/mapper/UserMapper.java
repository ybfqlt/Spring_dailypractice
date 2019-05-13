package com.learn.ssm.chapter3.mapper;

import com.learn.ssm.chapter3.pojo.User;

/**
 * @Author: ltt
 * @Date: 19-5-12 上午1:33
 * @since: JDK 1.8
 */
public interface UserMapper {
    public User getUser(Long id);
}
