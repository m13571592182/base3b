package com.threeb.base.controller;

import com.threeb.base.entity.SeUser;
import com.threeb.base.service.user.SeUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author Raine
 * @Date 2018年8月14日14:35:12
 * @Version 1.0
 */
@Controller
public class SeUserController {
    @Autowired
    SeUserService seUserService;

    @RequestMapping("/getAllUser")
    @ResponseBody
    public List<SeUser> getAllUser(){
        return seUserService.findAll();
    }

    @RequestMapping("/")
    public String index() {
        return "page/index";
    }
}
