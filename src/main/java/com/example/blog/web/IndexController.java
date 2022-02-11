package com.example.blog.web;

import com.example.blog.NotFoundException;
import org.aspectj.weaver.ast.Not;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){
////        int i = 9/0;
//        String blog = null;
//        if(blog == null){
//            throw  new NotFoundException("This Page does not exist.");
//        }
        return "index";
    }
    @GetMapping("/blog")
    public String blog(){
////        int i = 9/0;
//        String blog = null;
//        if(blog == null){
//            throw  new NotFoundException("This Page does not exist.");
//        }
        return "blog";
    }

}
