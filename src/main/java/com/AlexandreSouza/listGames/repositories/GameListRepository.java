package com.AlexandreSouza.listGames.repositories;

import com.AlexandreSouza.listGames.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList,Long> {
}
