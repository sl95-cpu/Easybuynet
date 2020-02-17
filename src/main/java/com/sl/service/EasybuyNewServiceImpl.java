package com.sl.service;

import com.sl.dao.EasybuyNewMapper;
import com.sl.pojo.EasybuyNews;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EasybuyNewServiceImpl implements EasybuyNewService {

    private EasybuyNewMapper newMapper;

    public void setNewMapper(EasybuyNewMapper newMapper) {
        this.newMapper = newMapper;
    }

    public List<EasybuyNews> queryAllEasybuyNews() {
        return newMapper.queryAllEasybuyNews();
    }
}
