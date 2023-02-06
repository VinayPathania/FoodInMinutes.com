package com.foodinminutes.Service;

import com.foodinminutes.Model.LoginDto;

public interface LoginService {
    public String login(LoginDto dto);
    public String logout(String key);
}
