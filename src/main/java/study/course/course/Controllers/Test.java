package study.course.course.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Test {
    

    @GetMapping("/test")
    public void test(){
        System.out.println("this is test");
    }
}
