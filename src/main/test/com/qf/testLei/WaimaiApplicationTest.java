package com.qf.testLei;

import com.qf.pojo.Users;
import com.qf.service.UserService;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.Random;



/**
 * @Auther:
 * @Date: 2019/8/29 15:32
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class WaimaiApplicationTest {
    @Autowired
    UserService userService;
    @Test
    public void  tse() throws EmailException {
       /* Users users=(Users)request.getSession().getAttribute("user");
        String usereName=users.getUserName();*/
        HtmlEmail el=new HtmlEmail();    //创建一个HtmlEmail 实例
        el.setHostName("smtp.qq.com");   //邮箱的SMTP服务器
        el.setCharset("utf-8");   //设置发送的字符类型
        el.addTo("714338547@qq.com");    //对方
        el.setFrom("714338547@qq.com","千峰外卖");  //从哪发
        el.setAuthentication("714338547@qq.com","gbubjivndekzbffj");  //设置发送的邮箱  和授权码
        el.setSubject("千峰外卖---验证码");
        String yan = String.valueOf(new Random().nextInt(899999) + 100000);
        /*request.getSession().setAttribute("cc",yan);*/
        el.setMsg("【千峰外卖】验证码:"+"("+yan+")"+"请勿转发,转发可能导致账号被盗。感谢您对千峰的信任!请妥善保管该验证码!");
        el.send();

    }

    }

