package by.htp.hotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomControll {

    private int visitorCount = 0;

    @RequestMapping (value = "/")
    public String home(/*Model model*/){
        //model.addAttribute("visitorCount", visitorCount++);
        return "redirect:/hotel/welcom";
        //return "index";
    }
}
