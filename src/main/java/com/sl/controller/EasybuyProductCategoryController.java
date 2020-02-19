package com.sl.controller;

import com.sl.service.EasybuyProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class EasybuyProductCategoryController {

    // controller 掉service层
    @Autowired
    @Qualifier("EasybuyProductCategoryServiceImpl")
    private EasybuyProductCategoryService service;

}
