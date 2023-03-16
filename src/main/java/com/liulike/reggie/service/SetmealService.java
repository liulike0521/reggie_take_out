package com.liulike.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liulike.reggie.dto.SetmealDto;
import com.liulike.reggie.entity.Setmeal;
import com.liulike.reggie.mapper.SetmealMapper;

import java.util.List;

public interface SetmealService extends IService<Setmeal>{

    /**
     * 新增套餐，同时保存套餐和菜品的关联关系
     * @param setmealDto
     */
    public void saveWithDish(SetmealDto setmealDto);

    /**
     * 删除套餐，同时删除套餐和菜品的关联关系
     * @param ids
     */
    public void removeWithDish(List<Long> ids);

}
