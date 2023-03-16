package com.liulike.reggie.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.liulike.reggie.entity.ShoppingCart;
import com.liulike.reggie.mapper.ShoppingCartMapper;
import com.liulike.reggie.service.ShoppingCartService;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {

}
