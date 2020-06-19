package com.rych.apiweek7guardian;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class NewsService {

    RestTemplate restTemplate;
    NewsRepository newsRepository;

    @Autowired
    public NewsService(NewsRepository newsRepository) {
        this.restTemplate = new RestTemplate();
        this.newsRepository = newsRepository;
    }

    public List<Result> bla(){
        News news = restTemplate.getForObject("https://content.guardianapis.com/search?api-key=55d96216-6d52-4f95-b52a-ee427353bfe6", News.class);
        news.response.results.forEach(result ->{
            if(newsRepository.existsById(result.id)== false) {
                newsRepository.save(result);
            }
        });
        return newsRepository.findAll();
    }

}
