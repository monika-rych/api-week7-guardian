package com.rych.apiweek7guardian;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/news")
public class NewsController {

    private NewsService newsService;

    @Autowired

    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    @GetMapping
    public ResponseEntity<List<Result>> getNews(){
        List<Result> resultList = newsService.getNews();
        return new ResponseEntity<>(resultList, HttpStatus.OK);
    }

    @PutMapping()
    public ResponseEntity updateNews(@RequestBody Result result){
        boolean success = newsService.update(result);
        if (success) {

            return new ResponseEntity(HttpStatus.OK);
        }
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }
}
