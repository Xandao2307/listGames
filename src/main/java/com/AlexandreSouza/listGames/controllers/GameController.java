package com.AlexandreSouza.listGames.controllers;

import com.AlexandreSouza.listGames.dto.GameDTO;
import com.AlexandreSouza.listGames.dto.GameMinDTO;
import com.AlexandreSouza.listGames.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/games")
public class GameController {
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll(){
        return gameService.findAll();
    }

    @GetMapping(value="/{id}")
    public GameDTO findById(@PathVariable Long id){
        return gameService.findById(id);
    }
}
