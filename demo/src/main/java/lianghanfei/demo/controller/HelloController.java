package lianghanfei.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("hello") //hello是网址路径 localhost:8080/hello
    public String Hello(){
        //System.out.println("Hello");
        return "hello you motherfucking idoit";

    }
}
