package com.login.one.login.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.one.login.Entity.LoginsEntity;
import com.login.one.login.Repository.LoginsRepository;

@Service
public class LoginsService {
    @Autowired
    private LoginsRepository loginsRepository;

    public LoginsEntity findByUsername(String username){
        return loginsRepository.findByUsername(username);

    }

}
