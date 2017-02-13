package ru.ks_on_v.service;

import ru.ks_on_v.model.User;

public interface UserService {
    public void save(User user);

    public User findById(int id);
}
