package com.AlexandreSouza.listGames.services;

import com.AlexandreSouza.listGames.dto.GameDTO;
import com.AlexandreSouza.listGames.dto.GameMinDTO;
import com.AlexandreSouza.listGames.entities.Game;
import com.AlexandreSouza.listGames.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO>findAll(){
        var games = gameRepository.findAll();
        return games.stream().map(x -> new GameMinDTO(x)).toList();
    }
    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        return new GameDTO(gameRepository.findById(id).get());
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long id){
        var result = gameRepository.searchByList(id);
        return result.stream().map(x -> new GameMinDTO(x)).toList();

    }
}
