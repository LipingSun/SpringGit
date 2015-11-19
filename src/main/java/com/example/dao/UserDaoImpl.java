package com.example.dao;

/**
 * Created by Liping on 11/18/15.
 */
public class UserDaoImpl implements UserDao {
    @Override
    public String findUserById(String id) {
        if (id == "1") {
            return "1";
        } else {
            return null;
        }
    }
}
