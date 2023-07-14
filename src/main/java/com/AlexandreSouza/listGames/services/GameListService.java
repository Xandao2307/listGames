package com.AlexandreSouza.listGames.services;

import com.AlexandreSouza.listGames.dto.GameListDTO;
import com.AlexandreSouza.listGames.repositories.GameListRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {
    private GameListRepository repository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        var gameLists = repository.findAll();
        return gameLists.stream().map(x -> new GameListDTO(x)).toList();
    }
}
