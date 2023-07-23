package ru.kata.spring.boot_security.demo.service;

import java.util.List;

public interface UserService {
    List<User> showAllUser();

    void add(User user);

    User findUser(long id);

    void update(User user, long id);

    void delete(long id);
}
