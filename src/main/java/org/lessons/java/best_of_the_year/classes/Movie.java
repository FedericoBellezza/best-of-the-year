package org.lessons.java.best_of_the_year.classes;

import java.io.Serializable;

public class Movie implements Serializable {
    private Integer id;
    private String title;

    public Movie(){}

    public Movie(Integer id, String title){
        this.title = title;
        this.id = id;
    }

    // getters
    public String getTitle(){
        return title;
    }
    public Integer getId(){
        return id;
    }

    // setters
    public void setTitle(String title){
        this.title = title;
    }
    public void setId(Integer id){
        this.id = id;
    }

    // to string
    @Override
    public String toString() {
        return "Id: " + id + ", Titolo: " + title;
    }


}
