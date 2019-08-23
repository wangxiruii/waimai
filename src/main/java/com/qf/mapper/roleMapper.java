package com.qf.mapper;

import com.qf.pojo.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Auther: 王玺瑞
 * @Date: 2019/8/22 21:38
 * @Description:
 */
@Mapper
public interface roleMapper {
    public List<Role> findAll();
}
