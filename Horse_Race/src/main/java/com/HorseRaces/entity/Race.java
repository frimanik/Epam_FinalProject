package com.HorseRaces.entity;



import java.util.List;

public class Race{
    private long id;
    private String date;
    ;

    private List <Horse> horses;

    public Race(Long id, String date){
        this.id = id;
        this.date = date;
    }

    public Long getId(){
        return id;
    }

    public void setId(long id) { this.id = id; }

    public String getDate() {
        return date;
    }

    public void setDate(String date) { this.date = date; }


    public List<Horse> getHorses() { return horses; }

    public void setHorses(List<Horse> horses) { this.horses = horses; }
}