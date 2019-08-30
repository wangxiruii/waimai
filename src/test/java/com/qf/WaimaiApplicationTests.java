package com.qf;

import com.qf.mapper.User_role_mapper;
import com.qf.service.User_Role_Service;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WaimaiApplicationTests {
    @Autowired
    User_role_mapper user_role_mapper;
    @Autowired
    private User_Role_Service user_role_service;

    @Test
    public void contextLoads() {
    //public List<Integer> loadByUid(int userId);
        List<Integer> lists=new ArrayList<>();
        lists.add(1);
        lists.add(2);
        List<Integer>  list=user_role_mapper.loadByUid(lists);
        System.out.println(list);


    }


    @Test
    public void testemail(){
        String checkcode = String.valueOf(new Random().nextInt(899999) + 100000);
        System.out.println(checkcode);
    }

}
