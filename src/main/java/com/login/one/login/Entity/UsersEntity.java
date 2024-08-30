package com.login.one.login.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbluser")
public class UsersEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "type_user", nullable = false)
    private String type_user;
    
    @OneToOne
    @JoinColumn(name = "id_cliente", nullable = false)
    private ClientsEntity cliente;

    @OneToOne(mappedBy = "usersEntity")
    private LoginsEntity logins;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType_user() {
        return type_user;
    }

    public void setType_user(String type_user) {
        this.type_user = type_user;
    }

    public ClientsEntity getCliente() {
        return cliente;
    }

    public void setCliente(ClientsEntity cliente) {
        this.cliente = cliente;
    }

    public LoginsEntity getLogins() {
        return logins;
    }

    public void setLogins(LoginsEntity logins) {
        this.logins = logins;
    }

    
}
