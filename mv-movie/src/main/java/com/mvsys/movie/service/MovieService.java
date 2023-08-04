package com.mvsys.movie.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Base64;
import java.nio.file.Files;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.HashMap;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mvsys.movie.model.*;
import com.mvsys.movie.mapper.MovieMapper;
@Service
public class MovieService {
    @Autowired
    private MovieMapper movieMapper;
    private final String basepath = System.getProperty("user.dir");
    public String getMovie(PageRequest page_request) {
        String genre = page_request.getGenre();
        int num = 2;
        int page = page_request.getPage();
        int start = page * num + 1;
        List<Movie> movies;

        if (Objects.equals(page_request.getSort(), "Release Date Descending"))
            movies = List.of(movieMapper.getMovieInfo_date(start, num, genre));
        else
            movies = List.of(movieMapper.getMovieInfo_rate(start, num, genre));
        Integer total = movieMapper.getMovie_num(genre);
        System.out.println(total);
        if (total != null) {
            if (movies.size() < num)
                num = movies.size();
            byte[] fileContent;
            for (int i = 0; i < num; i++) {
                try {
                    fileContent = Files.readAllBytes(Path.of(basepath, "mv-movie/src/main/java/com/mvsys/movie", movies.get(i).getPoster()));
                } catch (IOException e) {
                    return e.getMessage();
                }
                String encodedString = "data:image/jpeg;base64," + Base64.getEncoder().encodeToString(fileContent);
                movies.get(i).setPoster(encodedString);
            }
        }
        else total = 0;

        ObjectMapper mapper = new ObjectMapper();
        String json;
        Map<String, Object> result = new HashMap<>();
        try {
            result.put("movies", movies);
            result.put("total", total);
            json = mapper.writeValueAsString(result);
        } catch (JsonProcessingException e) {
            return e.getMessage();
        }
        return json;
    }
}
