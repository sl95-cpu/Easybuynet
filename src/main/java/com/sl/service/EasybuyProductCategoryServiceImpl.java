package com.sl.service;

import com.sl.dao.EasybuyProductCategoryMapper;
import com.sl.pojo.EasybuyProductCategory;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class EasybuyProductCategoryServiceImpl implements EasybuyProductCategoryService {

    private EasybuyProductCategoryMapper easybuyProductCategoryMapper;

    public void setEasybuyProductCategoryMapeer(EasybuyProductCategoryMapper easybuyProductCategoryMapper) {
        this.easybuyProductCategoryMapper = easybuyProductCategoryMapper;
    }

    public List<EasybuyProductCategory> queryAllBuyType(int type) {
        return easybuyProductCategoryMapper.queryAllBuyType(type);
    }
}
