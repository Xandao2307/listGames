package com.AlexandreSouza.listGames.controllers;

import com.AlexandreSouza.listGames.dto.GameListDTO;
import com.AlexandreSouza.listGames.dto.GameMinDTO;
import com.AlexandreSouza.listGames.services.GameListService;
import com.AlexandreSouza.listGames.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/lists")
public class GameListController {
    @Autowired
    private GameListService gameListService;
    @Autowired
    private GameService gameService;
    @GetMapping
    public List<GameListDTO> findAll(){
        return gameListService.findAll();
    }
    @GetMapping(value = "/{id}/games")
    public List<GameMinDTO> findAll(@PathVariable Long id){
        return gameService.findByList(id);
    }

}
