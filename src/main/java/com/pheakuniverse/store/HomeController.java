package com.pheakuniverse.store;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {

    @Value("${spring.application.name}")
    private String appName;

    @RequestMapping("/me")
    public String index() {
        System.out.println("appName" + appName);
        return "index.html";
    }
}
