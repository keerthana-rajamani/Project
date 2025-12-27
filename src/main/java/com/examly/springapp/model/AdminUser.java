package com.examly.springapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity@Table(name="admin_user")
public class AdminUser {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String username;
    private String password;
    private String role;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    protected AdminUser()
    {

    }

    public AdminUser(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }   
    @Override
    public String toString()
    {
        return String.format(
            "AdminUser[id=%d, username='%s', role='%s']",
            id,username,role);
    }
}
