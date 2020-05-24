package com.lz.controller;

import com.lz.entity.MiaoshaUser;
import com.lz.service.MiaoshaUserService;
import com.lz.service.RedisService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author m
 * @className GoodsController
 * @description GoodsController
 * @date 2020/5/17
 */
@CrossOrigin
@Controller
@RequestMapping(value = "goods/")
public class GoodsController {

    private static final Logger logger = LoggerFactory.getLogger(GoodsController.class);

    @Autowired
    MiaoshaUserService miaoshaUserService;

    @Autowired
    RedisService redisService;

    @RequestMapping(value = "toList")
    public String toLogin(Model model,MiaoshaUser user){
        model.addAttribute("user",user.toString());
        return "goodsList";
    }


}