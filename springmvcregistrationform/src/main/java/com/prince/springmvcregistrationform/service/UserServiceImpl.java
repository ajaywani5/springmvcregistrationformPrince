package com.prince.springmvcregistrationform.service;

import com.prince.springmvcregistrationform.entity.User;
import com.prince.springmvcregistrationform.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepo repo;

    @Override
    public void registerUser(User user) {
    repo.save(user);
    }
}
