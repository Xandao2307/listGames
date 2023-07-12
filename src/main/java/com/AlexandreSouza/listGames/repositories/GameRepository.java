package com.AlexandreSouza.listGames.repositories;


import com.AlexandreSouza.listGames.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game,Long> {
}
