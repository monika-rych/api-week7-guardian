package com.rych.apiweek7guardian;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/news")
public class NewsController {

    private NewsService newsService;

    @Autowired

    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    @GetMapping
    public void getNews(){
        newsService.bla();
    }
}
