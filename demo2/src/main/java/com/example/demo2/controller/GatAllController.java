package com.example.demo2.controller;

import com.example.demo2.pojo.Userin;
import com.example.demo2.repository.UserinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/a")
public class GatAllController {
    @Autowired
    private UserinRepository userinRepository;
    @RequestMapping("/a")
    public Userin getall(){
        return userinRepository.findByUnameOrUpwd("2","2");
    }

    public Userin getone(){
        return userinRepository.getone(2l);
    }
    @RequestMapping("c")
    public List<Userin> gatAll(){
       return userinRepository.findAll();
    }

    @RequestMapping("b")
    public String ho(){
        return "hello world";
    }
    @RequestMapping("d")
    public Userin get(){

       return userinRepository.findByUnameOrUpwd("1","1");
    }
}
