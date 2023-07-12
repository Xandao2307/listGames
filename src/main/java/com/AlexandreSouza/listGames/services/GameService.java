package com.AlexandreSouza.listGames.services;

import com.AlexandreSouza.listGames.dto.GameMinDTO;
import com.AlexandreSouza.listGames.entities.Game;
import com.AlexandreSouza.listGames.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO>findAll(){
        var games = gameRepository.findAll();
        return games.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
