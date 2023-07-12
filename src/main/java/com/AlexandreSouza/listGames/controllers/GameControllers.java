package com.AlexandreSouza.listGames.controllers;

import com.AlexandreSouza.listGames.dto.GameMinDTO;
import com.AlexandreSouza.listGames.entities.Game;
import com.AlexandreSouza.listGames.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/games")
public class GameControllers {
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll(){
        return gameService.findAll();
    }
}
