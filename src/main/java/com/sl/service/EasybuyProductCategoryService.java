package com.sl.service;

import com.sl.pojo.EasybuyProductCategory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EasybuyProductCategoryService {
    List<EasybuyProductCategory> queryAllBuyType(int type);
}
