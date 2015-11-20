package com.example.controller;

import com.example.entity.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Liping on 11/19/15.
 */
@RequestMapping("/api/v1/users*")
@RestController
public class UserController {
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getPersonJSON(@PathVariable("id") long userId) {
        if (userId == 2) {
            return new ResponseEntity<>(new User(1, "user1", "user1@gmail.com", "This is user1"), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }
}
