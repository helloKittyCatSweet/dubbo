package org.example.service;

import org.example.pojo.User;

public interface UserService {
    public String sayHello();

    // 查询用户
    public User findUserById(int id);
}
