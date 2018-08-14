package com.threeb.base.service.user;

import com.threeb.base.dao.SeUserRepository;
import com.threeb.base.entity.SeUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author Raine
 * @Date 2018年8月14日14:55:13
 * @Version 1.0
 */
@Service
public class SeUserServiceImpl implements SeUserService {
    @Autowired
    SeUserRepository seUserRepository;

    @Override
    public List<SeUser> findAll() {
        return seUserRepository.findAll();
    }
}
