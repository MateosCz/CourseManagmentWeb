package com.test.demo.Service;


import com.test.demo.Bean.UserBean;

public interface UserService {

    UserBean getUserByID(String userID, String password);

}
