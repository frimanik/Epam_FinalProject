package com.HorseRaces.entity;

import java.sql.Date;

public class Race{
    private long id;
    private java.sql.Date startDate;
    private long winner;

    public Race(Long id, java.sql.Date startDate,Long winner){
        this.id = id;
        this.startDate = startDate;
        this.winner=winner;
    }

    public Long getId(){
        return id;
    }

    public void setId(long id) { this.id = id; }

    public java.sql.Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) { this.startDate = startDate; }

    public Long getWinner(){return id;}

    public void setWinner(long winner) { this.winner = winner; }
}