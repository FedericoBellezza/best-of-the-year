package org.lessons.java.best_of_the_year.classes;

import java.io.Serializable;

public class Song implements Serializable {
    private String id;
    private String title;

    public Song(){}

    public Song(String id, String title){
        this.title = title;
        this.id = id;
    }

    // getters
    public String getTitle(){
        return title;
    }
    public String getId(){
        return id;
    }

    // setters
    public void setTitle(String title){
        this.title = title;
    }
    public void setId(String id){
        this.id = id;
    }

    // to string
    @Override
    public String toString() {
        return "Id: " + id + ", Titolo: " + title;
    }


}
