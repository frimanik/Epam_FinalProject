package com.HorseRaces.repository;

import com.HorseRaces.entity.Bet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


@Repository
public class BetRepositoryImpl implements BetRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    private RowMapper<Bet> rowMapper = (rowStr, rowNum) -> new Bet(
            rowStr.getLong("id"),
            rowStr.getInt("quantity"),
            rowStr.getInt("multiplier"),
            rowStr.getDate("created_at")
    );

    @Override
    public int create (Bet bet)        {
        String sql = "insert into 'bet' ('id','quantity','multiplier','created_at)" + "VALUES(?,?,?,?)";
        return jdbcTemplate.update(sql,
                bet.getId(),
                bet.getMultiplier(),
                bet.getQuantity(),
                bet.getCreated_at());
    }

    @Override
    public Bet get (Long id){
        String sql = "select 'id','quantity','multiplier','created_at' where  id=?";
        return jdbcTemplate.queryForObject(sql,Bet.class,id);
    }

    @Override
    public int update (Bet bet){
        String sql = "update bet from 'bet' set 'multiplier=?','quantity=?','created_at=?' where 'id'=?";
        return jdbcTemplate.update(sql,
                bet.getId(),
                bet.getQuantity(),
                bet.getMultiplier(),
                bet.getCreated_at());
    }

    @Override
    public int delete(Long id) {
        String sql = "delete bet from 'bet' where 'id'=?";
        return jdbcTemplate.update(sql,id);
    }

}

