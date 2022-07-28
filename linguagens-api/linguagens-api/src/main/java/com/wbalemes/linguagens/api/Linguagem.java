package com.wbalemes.linguagens.api;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "principaisLinguagens")
public class Linguagem {

    @Id
    private String id;
    private String tittle;
    private String image;
    private int ranking;

    public Linguagem() {

    }

    public Linguagem(String tittle, String image, int ranking) {
        this.tittle = tittle;
        this.image = image;
        this.ranking = ranking;
    }

    public String getId() {
        return id;
    }

    public String getTittle() {
        return tittle;
    }
    public String getImage() {
        return image;
    }
    public int getRanking() {
        return ranking;
    }


}