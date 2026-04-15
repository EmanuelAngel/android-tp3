package com.angelemanuel.tp3.models;

import java.io.Serializable;
import java.util.ArrayList;

public class Book implements Serializable {
    private final String title;
    private final String author;
    private final int pagesQuantity;
    private final int publishYear;
    private final ArrayList<String> genres;
    private final String description;
    private final int imageResId;

    public Book(
            String title,
            String author,
            int pagesQuantity,
            int publishYear,
            ArrayList<String> genres,
            String description,
            int imageResId
    ) {
        this.title = title;
        this.author = author;
        this.pagesQuantity = pagesQuantity;
        this.publishYear = publishYear;
        this.genres = genres;
        this.description = description;
        this.imageResId = imageResId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPagesQuantity() {
        return pagesQuantity;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public ArrayList<String> getGenres() {
        return genres;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResId() {
        return imageResId;
    }
}