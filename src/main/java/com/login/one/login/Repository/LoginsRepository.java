package com.login.one.login.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.login.one.login.Entity.LoginsEntity;

@Repository
public interface LoginsRepository extends JpaRepository<LoginsEntity, Long>{
    LoginsEntity findByUsername(String username);
}
