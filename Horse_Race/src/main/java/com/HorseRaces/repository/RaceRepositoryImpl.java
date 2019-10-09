package com.HorseRaces.repository;

import com.HorseRaces.entity.Race;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class RaceRepositoryImpl implements RaceRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    private RowMapper<Race> race = (rowStr,rowNum) -> new Race(
            rowStr.getLong("id"),
            rowStr.getDate("startDate"),
            rowStr.getLong("winner")
    );

    @Override
    public int create(Race race){
        String sql = "insert into 'race' ('startDate'=?,'winner'=?) where 'id'=?";
        return jdbcTemplate.update(sql,
                race.getId(),
                race.getStartDate(),
                race.getWinner());
    }

    @Override
    public Race get(Long id){
        String sql = "select 'id','startDate'  where 'id'=?";
        return jdbcTemplate.queryForObject(sql,Race.class,id);
    }

    @Override
    public int update(Race race){
        String sql ="update race from 'race' set 'startDate'=?,'winner'=? where 'id'=?";
        return jdbcTemplate.update(sql,
                race.getId(),
                race.getStartDate(),
                race.getWinner());
    }

    @Override
    public int delete(Long id){
        String sql = "delete race from 'race' where 'id'=?";
        return jdbcTemplate.update(sql,id);
    }
}
