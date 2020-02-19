package com.sl.dao;

import com.sl.pojo.EasybuyProductCategory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EasybuyProductCategoryMapper {
    List<EasybuyProductCategory> queryAllBuyType(@Param("type") int type);
}
