package com.HorseRaces.repository;

import com.HorseRaces.entity.Race;

    public interface RaceRepository {

        int create (Race race);

        Race get (Long id);

        int update (Race race);

        int delete (Long id);

    }