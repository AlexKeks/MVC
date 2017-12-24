package by.htp.hotel.controller;

import by.htp.hotel.entities.User;
import by.htp.hotel.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/hotel")
public class Controll {


   /* @Autowired
    public Controll(UserService userService) {
        this.userService = userService;

    }*/



  //  private UserService userService;

  //  private static final String MAIN = "persons/main";

    @GetMapping(value = "/welcom")
    public String home(ModelMap model){
    //  model.addAttribute("visitorCount", visitorCount++);
      //  fillModel(model);
        return "welcom/welcom_page";

    }

    @RequestMapping(value = "/10")
    public ModelAndView main() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userJSP", new User());
        modelAndView.setViewName("index");
        return modelAndView;
    }

   /* private void fillModel(ModelMap model) {
        List<User> list = userService.getAll();
        model.put("persons", list);
        User user = new User();
        if (list.size() > 1) {
            user = list.get(0);
        }
        model.put("user", user);
    }*/
}
