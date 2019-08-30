package com.qf.service.impl;

import com.github.pagehelper.PageHelper;
import com.qf.mapper.UserMapper;
import com.qf.pojo.Users;
import com.qf.service.UserService;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther:
 * @Date: 2019/8/21 20:22
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
   /* @Resource
    private JavaMailSender javaMailSender;*/
    @Override
    public Users findUserInfo(String userName) {
        Users users=userMapper.findUserInfo(userName);
        return users;
    }

    @Override
    public int save(Users users) {
        int count=userMapper.save(users);
        return count;
    }

    @Override
    public Users loadUser(Users users) {
        return userMapper.loadUser(users);
    }

    @Override
    public List<Users> loadAll(int page, int rows) {
        PageHelper.startPage(page,rows);
        return userMapper.loadAll();
    }


    @Override
    public int delete(List<Integer> ids) {
        return userMapper.delete(ids);
    }

    @Override
    public int updetaUser(Users users) {
        return userMapper.updetaUser(users);
    }

    @Override
    public List<Users> loadName(String userName) {
        return userMapper.loadName(userName);
    }

    @Override
    public int caleMaxPage(int rows) {
        int count=userMapper.getTotalCount();
        return count % rows==0?count/rows:count/rows+1;
    }

    @Override
    public Users loadById(int userId) {
        return userMapper.loadById(userId);
    }

   /* @Override
    public void sendSimpleMail(String to, String title, String content) {
        //创建要发送的邮件
*//*        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(from);
        message.setTo(to);
        message.setSubject(title);
        message.setText(content);
        mailSender.send(message);*//*
        SimpleMailMessage message=new SimpleMailMessage();
        message.setFrom("1064169874@qq.com");
        message.setTo(to);
        message.setSubject(title);
        message.setText(content);
        message.setText(content);
        message.setText(content);
        javaMailSender.send(message);
    }*/
    //前台

}
