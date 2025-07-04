package org.example.service.impl;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.pojo.User;
import org.example.service.UserService;

//@Service // 将该类的对象创建出来，放入Spring的IOC容器中  bean定义
@DubboService // 将这个类提供的方法（服务）对外发布，将访问的地址 IP、端口、路径注册到注册中心中
        (timeout = 3000, retries = 2)
public class UserServiceImpl implements UserService {
    @Override
    public String sayHello() {
        return "hello dubbo!";
    }

    @Override
    public User findUserById(int id) {
        // 查询user对象
        return new User(1,"张三","123");
    }
}
