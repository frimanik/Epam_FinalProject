package com.HorseRaces.repository;

import com.HorseRaces.entity.Horse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class HorseRepositoryImpl implements HorseRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    private RowMapper<Horse> horse = (rowStr, rowNum) -> new Horse(
            rowStr.getLong("id"),
            rowStr.getString("color")
    );

    @Override
    public int create(Horse horse) {
        String sql = "insert into 'horse'('color'=?) where 'id'=?";
        return jdbcTemplate.update(sql,
                horse.getColor(),
                horse.getId());
    }

    @Override
    public Horse get(Long id) {
        String sql = "select 'id', 'color' where 'id'=? ";
        return jdbcTemplate.queryForObject(sql, Horse.class, id);
    }
// @override
    @Override
    public int update(Horse horse) {
        String sql = "update horse from 'horse' set 'color'=? where 'id'=?";
        return jdbcTemplate.update(sql,
                horse.getColor(),
                horse.getId());
    }
    @Override
    public int delete(Long id){
        String sql ="delete horse from 'horse' where 'id'=?";
        return jdbcTemplate.update(sql,id);
    }

}