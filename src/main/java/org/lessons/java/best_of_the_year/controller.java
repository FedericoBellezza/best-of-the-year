package org.lessons.java.best_of_the_year;

import java.util.ArrayList;

import org.lessons.java.best_of_the_year.classes.Movie;
import org.lessons.java.best_of_the_year.classes.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping("/")
public class controller {

    
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("name", "Federico" );
        return "home";
    }

    @GetMapping("/movies")
    public String bestMovies(Model model) {
        model.addAttribute("listaDeiMiglioriFilm", getBestMovies());
        return "movies";

    }
    @GetMapping("/songs")
    public String bestSongs(Model model){
        model.addAttribute("listaDelleMiglioriCanzoni", getBestSongs());
        return "songs";
    }

    @GetMapping("/movies/{id}")
    public String movieById(Model model, @PathVariable("id") String urlContent){
        model.addAttribute("id", urlContent);
        return "pageById";
    }



    
    
    // getters
    private ArrayList<Movie> getBestMovies(){
        Movie movieUno = new Movie(1, "Harry Potter");
        Movie movieDue = new Movie(2, "Il Signore degli Anelli");
        Movie movieTre = new Movie(3, "Annabelle");

        ArrayList<Movie> listaDeiMiglioriFilm = new ArrayList<>();
        listaDeiMiglioriFilm.add(movieUno);
        listaDeiMiglioriFilm.add(movieDue);
        listaDeiMiglioriFilm.add(movieTre);

        return listaDeiMiglioriFilm;
    }
    private ArrayList<Song> getBestSongs(){
        Song songUno = new Song(1, "Balorda Nostalgia");
        Song songDue = new Song(2, "Volevo essere un duro");
        Song songTre = new Song(3, "La Cura");

        ArrayList<Song> listaDelleMiglioriCanzoni = new ArrayList<>();
        listaDelleMiglioriCanzoni.add(songUno);
        listaDelleMiglioriCanzoni.add(songDue);
        listaDelleMiglioriCanzoni.add(songTre);

        return listaDelleMiglioriCanzoni;
    }
}
