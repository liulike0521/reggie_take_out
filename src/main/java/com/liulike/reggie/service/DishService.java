package com.liulike.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liulike.reggie.dto.DishDto;
import com.liulike.reggie.entity.Dish;

public interface DishService extends IService<Dish> {
    //新增菜品 同时新增口味 操作两张表
    public void saveWithFlavor(DishDto dishDto);

    //根据id查询菜品以及口味
    public DishDto getByIdWithFlavor(Long id);

    //修改菜品以及口味
    public void updateWithFlavor(DishDto dishDto);
}
