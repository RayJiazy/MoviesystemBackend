package com.mvsys.movie.controller;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.mvsys.movie.model.*;
import com.mvsys.movie.service.*;

@RestController
@RequestMapping("movie")
// 动态刷新配置注解 配置相关后面会介绍到
@RefreshScope
public class MovieController {
    @Autowired
    private MovieService movieService;
    @PostMapping("/show")
    public String get_movie(@RequestBody PageRequest page) {
        return movieService.getMovie(page);
    }
}
