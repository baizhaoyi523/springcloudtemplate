package com.bzy.order;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AboutRestController {

    @GetMapping("about")
    public String about() {
        return "This is order about";
    }

}
