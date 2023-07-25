package mindfulness.mindfulnessspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MindfulnessController{
    @GetMapping("mindfulness")
    public String mindfulness(Model model){
        model.addAttribute("data", "mindfulness!!");
        return "mindfulness";

    }

}
