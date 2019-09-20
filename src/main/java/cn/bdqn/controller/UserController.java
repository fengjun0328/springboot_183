package cn.bdqn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
public class UserController {


    @RequestMapping(value ="/hello",produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String hello(){
        return "hello,world,中文";
    }

    @RequestMapping(value ="/index.html")
    public String index(Model model){
        List<String> names= Arrays.asList(new String[]{"刘程鹏","西门庆","陈冠希"});
        model.addAttribute("names",names);
        return "index";
    }
}
