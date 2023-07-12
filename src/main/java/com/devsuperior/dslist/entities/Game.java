package com.devsuperior.dslist.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_game")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @Column(name="game_year")//replace "year" variable. "year" is an internal database name and may give an error.
    private Integer year;
    private String genre;
    private String platforms;
    private Double imgUrl;
    private String shotDescription;
    private String longDescripton;

    public Game(){

    }

    public Game(Long id, String title, Integer year, String genre, String platforms, Double imgUrl, String shotDescription, String longDescripton) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.platforms = platforms;
        this.imgUrl = imgUrl;
        this.shotDescription = shotDescription;
        this.longDescripton = longDescripton;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlatforms() {
        return platforms;
    }

    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }

    public Double getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(Double imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getShotDescription() {
        return shotDescription;
    }

    public void setShotDescription(String shotDescription) {
        this.shotDescription = shotDescription;
    }

    public String getLongDescripton() {
        return longDescripton;
    }

    public void setLongDescripton(String longDescripton) {
        this.longDescripton = longDescripton;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Objects.equals(id, game.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
