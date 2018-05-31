package net.wohlfart.gemini;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    // serve index.html for all routes, see: https://stackoverflow.com/questions/31415052/angular-2-0-router-not-working-on-reloading-the-browser
    @GetMapping(path = {"/", "/login", "/label", "/settings", "/admin", "/home" })
    public String index() {
        return "forward:index.html";
    }

}