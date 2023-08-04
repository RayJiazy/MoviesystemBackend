package com.mvsys.movie.model;

public class Movie {
    private Integer movie_id;
    private String tmdb_id;
    private String imdb_id;
    private String movie_name;
    private String spoken_language;
    private String director;
    private String outline;
    private String poster;
    private String actor;
    private String keyword;
    private String genre;
    private String publish_date;
    private float rate;

    public Integer getMovie_id() {
        return movie_id;
    }
    public void setMovie_id(Integer movie_id) {
        this.movie_id = movie_id;
    }

    public String getImdb_id() {
        return imdb_id;
    }
    public void setImdb_id(String imdb_id) {
        this.imdb_id = imdb_id;
    }

    public String getTmdb_id() {
        return tmdb_id;
    }
    public void setTmdb_id(String tmdb_id) {
        this.tmdb_id = tmdb_id;
    }


    public String getActor() {
        return actor;
    }
    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getKeyword() {
        return keyword;
    }
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getMovie_name() {
        return movie_name;
    }
    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public String getOutline() {
        return outline;
    }
    public void setOutline(String outline) {
        this.outline = outline;
    }

    public String getPoster() {
        return poster;
    }
    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getPublish_date() {
        return publish_date;
    }
    public void setPublish_date(String publish_date) {
        this.publish_date = publish_date;
    }

    public String getSpoken_language() {
        return spoken_language;
    }
    public void setSpoken_language(String spoken_language) {
        this.spoken_language = spoken_language;
    }

    public float getRate() { return rate; }
    public void setRate(float rate) { this.rate = rate; }

}
