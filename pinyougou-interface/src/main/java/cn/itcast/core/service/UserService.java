package cn.itcast.core.service;

import cn.itcast.core.pojo.user.User;

public interface UserService {


    void add(User user, String smscode);

    void sendCode(String phone);
}
