package com.liulike.reggie.dto;

import com.liulike.reggie.entity.Setmeal;
import com.liulike.reggie.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
