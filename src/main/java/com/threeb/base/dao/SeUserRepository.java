package com.threeb.base.dao;

import com.threeb.base.entity.SeUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName UserRepository
 * @Description TODO
 * @Author Raine
 * @Date 2018年8月14日14:32:24
 * @Version 1.0
 */
@Mapper
public interface SeUserRepository{
    List<SeUser> findAll() ;
}
