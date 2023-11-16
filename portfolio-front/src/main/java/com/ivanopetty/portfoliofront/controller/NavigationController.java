package com.ivanopetty.portfoliofront.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.service.annotation.GetExchange;

@Controller
public class NavigationController {

    @GetExchange("/")
    public String goToPortfolioIndex(){
        return "index";
    }
}
