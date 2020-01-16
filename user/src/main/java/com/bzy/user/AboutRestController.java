package com.bzy.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AboutRestController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("about")
    public String about() {
        return "This is user about";
    }

    @GetMapping("orderAbout")
    public String orderAbout() {
        return restTemplate.getForObject("http://order/about", String.class);
    }

}
