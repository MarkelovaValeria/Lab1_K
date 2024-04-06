package com.example.lab1_k;
import com.example.lab1_k.Lab2.User;
import org.apache.tomcat.util.buf.UEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/")
public class DemoController {
    @GetMapping
    public String index(Model model) {
        model.addAttribute("pageTitle", "Hello Spring!");
        model.addAttribute("languages", List.of("Java", "Kotlin", "Groovy"));
        model.addAttribute("username", "Markelova Valeria");
        model.addAttribute("newuser",new User("Kovinia", "Roman"));
        model.addAttribute("capitalsOfTheWorld", new HashMap<String, String>() {{
            put("Belgium", "Brussels");
            put("France", "Paris");
        }});
        model.addAttribute("Users", List.of(new User("Markelova","Valeria"), new User("Gladchenko","Bogdan"), new User("Bondareva","Daria"), new User("Kovinia","Roman")));
        model.addAttribute("task10","dashboard.Kovinia");
        return "index";
    }

}
