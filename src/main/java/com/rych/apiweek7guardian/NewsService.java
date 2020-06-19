package com.rych.apiweek7guardian;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NewsService {

    RestTemplate restTemplate = new RestTemplate();


    public void bla(){
        News news = restTemplate.getForObject("https://content.guardianapis.com/search?api-key=55d96216-6d52-4f95-b52a-ee427353bfe6", News.class);
        System.out.println();
    }

}
