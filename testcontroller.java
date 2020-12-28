package sample.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testcontroller {
    @RequestMapping("home") //连接网址
    public String test(Model model){
        //model.addAttribute();
        return "index"; //连接html文件名
    }
}
