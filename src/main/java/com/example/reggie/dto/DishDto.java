package com.example.reggie.dto;

import com.example.reggie.entity.Dish;
import com.example.reggie.entity.DishFlavor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 *  dto(资料) ：用于封装页面提交的数据
 */

@Data
public class DishDto extends Dish {

    private List<DishFlavor> flavors = new ArrayList<>();

    private String categoryName;

    private Integer copies;
}
