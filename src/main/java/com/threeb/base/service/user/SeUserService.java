package com.threeb.base.service.user;

import com.threeb.base.entity.SeUser;

import java.util.List;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author Raine
 * @Date 2018年8月14日14:53:45
 * @Version 1.0
 */
public interface SeUserService {
    List<SeUser> findAll();
}
