package mindfulness.mindfulnessspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MindfulnessController{
    @GetMapping("mindfulness")
    public String mindfulness(Model model){
        model.addAttribute("data", "mindfulness!!");
        return "mindfulness";

    }
    @GetMapping("mindfulness-mvc")
    public String mindfulnessMvc(@RequestParam("name") String name, Model model){
        model.addAttribute("name", name);
        return "mindfulness-template";
    }
/*API방식*/
//    @ResponseBody를 통해 viewResolver를 거치지 않고
//    그대로 HTTP 바디부분 데이터를 반환
    @GetMapping("mindfulness-String")
    @ResponseBody
    public String mindfulnessString(@RequestParam("name") String name){
        return "mindfulness"+ name;
    }

    @GetMapping("mindfulness-api")
    @ResponseBody
    //object created
    public Mindfulness mindfulnessApi(@RequestParam("name") String name){
        Mindfulness mindfulness = new Mindfulness();
        mindfulness.setName(name);
        return mindfulness; //객체를 반환, JSON방식(key:value)으로 데이터 교환
    }

    static class Mindfulness{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
