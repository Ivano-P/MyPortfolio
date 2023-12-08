package com.ivanopetty.portfoliofront.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.service.annotation.GetExchange;

@Controller
public class NavigationController {

    @GetMapping("/")
    public String goToPortfolioIndex(){
        return "index";
    }


}
