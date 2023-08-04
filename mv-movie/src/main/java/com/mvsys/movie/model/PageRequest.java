package com.mvsys.movie.model;

public class PageRequest {
    private int page;
    private String genre;
    private String sort;

    // getter and setter
    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
}