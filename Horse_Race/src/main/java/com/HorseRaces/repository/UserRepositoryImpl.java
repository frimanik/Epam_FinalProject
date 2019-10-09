package com.HorseRaces.repository;

import com.HorseRaces.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    private RowMapper<User>user=(rowStr,rowNum)->new User(
            rowStr.getLong("id"),
            rowStr.getString("FULL_NAME"),
            rowStr.getString("login"),
            rowStr.getString("password")
    );

    @Override
    public int create (User user){
        String sql = "insert into 'user' ('FULL_NAME'=?, 'login=?','password=?','role=?') where 'id'=?";
        return jdbcTemplate.update(sql,
                user.getName(),
                user.getLogin(),
                user.getPassword(),
                user.getRole());
    }

    @Override
    public User get(Long id){
        String sql = "select 'id','FULL_NAME','login','password','role' where 'id'=?";
        return jdbcTemplate.queryForObject(sql,User.class,id);
    }

    @Override
    public User get(String login){
        String sql = "Select `id`, `FULL_NAME`" +
                "login`,`password` from `user` where login = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{login}, User.class);
    }

    @Override
    public int update (User user){
        String sql ="update user from 'user' set 'FULL_NAME'=?,'login=?','password=?','role=?'  where 'id'=?";
        return jdbcTemplate.update(sql,
                user.getId(),
                user.getName(),
                user.getLogin(),
                user.getPassword(),
                user.getRole());
    }

    @Override
    public int delete (Long id){
        String sql ="delete user from 'user' where 'id'=?";
        return jdbcTemplate.update(sql,id);
    }
//прописать наличие сервисов
//логика в сервисах - регистрация,авторизация,ставка,выйгрыш.

}
