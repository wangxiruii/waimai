package com.qf;

import com.qf.mapper.User_role_mapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WaimaiApplicationTests {
    @Autowired
    User_role_mapper user_role_mapper;


    @Test
    public void contextLoads() {
    //public List<Integer> loadByUid(int userId);
        List<Integer>  list=user_role_mapper.loadByUid(1);
        System.out.println(list);

    }

}
