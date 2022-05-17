package jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    //hello라는 url은 해당 컨트롤러 호출
    @GetMapping("hello")
    public String Hello(Model model) {
        model.addAttribute("data", "hello!!!");
        return "hello"; //hello.html
    }

}
