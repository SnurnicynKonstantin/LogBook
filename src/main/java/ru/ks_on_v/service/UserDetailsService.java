package ru.ks_on_v.service;

import org.springframework.security.core.userdetails.UserDetails;
import ru.ks_on_v.model.User;

public interface UserDetailsService {
    public UserDetails loadUserById(int id);
}
