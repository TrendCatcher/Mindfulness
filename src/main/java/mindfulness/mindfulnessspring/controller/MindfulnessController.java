package mindfulness.mindfulnessspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MindfulnessController{




    /*API방식*/
//    @ResponseBody를 통해 viewResolver를 거치지 않고
//    그대로 HTTP 바디부분 데이터를 반환
    @GetMapping("mindfulness-api")      // key-value방식의 JSON형식의 데이터 전달
    @ResponseBody
    public Mindfulness mindfulnessApi(@RequestParam("name") String name){
        Mindfulness mindfulness = new Mindfulness();
        mindfulness.setName(name);
        return mindfulness; // 객체를 반환
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

