package org.lessons.java.best_of_the_year.classes;

import java.io.Serializable;

public class Movie implements Serializable {
    private int id;
    private String title;

    public Movie(){}

    public Movie(int id, String title){
        this.title = title;
        this.id = id;
    }

    // getters
    public String getTitle(){
        return title;
    }
    public int getId(){
        return id;
    }

    // setters
    public void setTitle(String title){
        this.title = title;
    }
    public void setId(int id){
        this.id = id;
    }

    // to string
    @Override
    public String toString() {
        return "Id: " + id + ", Titolo: " + title;
    }


}
