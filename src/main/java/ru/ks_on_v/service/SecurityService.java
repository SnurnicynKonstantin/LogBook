package ru.ks_on_v.service;

public interface SecurityService {
    public String findLoggedInUsername();

    public void autologin(int id, String password);
}
