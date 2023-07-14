package com.AlexandreSouza.listGames.dto;

import com.AlexandreSouza.listGames.entities.Game;
import com.AlexandreSouza.listGames.projections.GameMinProjection;

public class GameMinDTO {
    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO() {
    }
    public GameMinDTO(Game game) {
        this.id = game.getId();
        this.title = game.getTitle();
        this.year = game.getYear();;
        this.imgUrl = game.getImgUrl();
        this.shortDescription = game.getShortDescription();
    }
    public GameMinDTO(GameMinProjection game) {
        this.id = game.getId();
        this.title = game.getTitle();
        this.year = game.getYear();;
        this.imgUrl = game.getImgUrl();
        this.shortDescription = game.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
