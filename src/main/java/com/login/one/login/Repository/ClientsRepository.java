package com.login.one.login.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.login.one.login.Entity.ClientsEntity;


@Repository
public interface ClientsRepository extends JpaRepository<ClientsEntity, Long> {
}
