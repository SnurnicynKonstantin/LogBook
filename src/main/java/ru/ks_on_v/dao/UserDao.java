package ru.ks_on_v.dao;


import ru.ks_on_v.model.User;

public interface UserDao extends JpaRepository<User, Long>{
    User findByUsername(String name);

    User findById(int id);
}
