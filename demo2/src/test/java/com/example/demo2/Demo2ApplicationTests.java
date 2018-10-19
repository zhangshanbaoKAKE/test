package com.example.demo2;

import com.example.demo2.pojo.Userin;
import com.example.demo2.pojo.Userinfo;
import com.example.demo2.repository.UserinRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo2ApplicationTests {
    @Autowired
    UserinRepository userinRepository;

    @Test
    public void contextLoads() {
//        Pageable pageable = new PageRequest(0,3);
//        Page<Userin> all = userinRepository.findAll(pageable);
//        List<Userin> content = all.getContent();
//        for (Userin userin : content) {
//            System.out.println(userin.getUname());
//
//        }
//        System.out.println(userinRepository.getone(2l).getUname());
        List<Userinfo> all1 = userinRepository.getAll();
        for (Userinfo all : all1) {
            System.out.println(all.getUseradd() + all.getUserins().getUname());

        }

    }

}
