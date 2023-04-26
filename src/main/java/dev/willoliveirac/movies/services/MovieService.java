package dev.willoliveirac.movies.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dev.willoliveirac.movies.Movie;
import dev.willoliveirac.movies.repositories.MovieRepository;

@Service
public class MovieService {
    
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies() {
        return movieRepository.findAll();        
    }

    public Optional<Movie> findMovieByImdbId(String imdbID) {

        return  movieRepository.findMovieByImdbId(imdbID);

    }

    



    
}
