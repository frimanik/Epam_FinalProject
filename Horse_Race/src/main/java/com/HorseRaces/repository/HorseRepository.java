package com.HorseRaces.repository;

import com.HorseRaces.entity.Horse;

public interface HorseRepository {

    int create (Horse horse);

    Horse get (Long id);

    int update (Horse horse);

    int delete (Long id);

}
