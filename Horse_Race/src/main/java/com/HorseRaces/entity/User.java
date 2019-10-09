package com.HorseRaces.entity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;


public class User{

    private Long id;
    private int account;
    private String name;
    private String role;
    @NotNull
    @Size(min=5)
    private String login;
    @NotNull
    @Size(min=5)
    private String password;

    public User(Long id,String name,String login,String password,int account,String role){
        this.id = id;
        this.name = name;
        this.login = login;
        this.password =password;
        this.account=account;
        this.role=role;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id) {this.id = id;}

    public int getAccount(){return account;}

    public void setAccount(int account) { this.account = account; }

    public String getRole(){return role;}

    public void setRole(String role) {this.role = role; }

    public String getName(){
        return name;
    }

    public void setName(String name){this.name = name;}

    public String getLogin(){return login;}

    public void  setLogin(String login) {this.login = login;}

    public String getPassword(){return password;}

    public void setPassword(String password){this.password = password;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id.equals(user.id);
    }

    @Override
    public int hashCode() {return Objects.hash(id);}
}