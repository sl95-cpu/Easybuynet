package com.sl.controller;

import com.sl.pojo.EasybuyNews;
import com.sl.service.EasybuyNewService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Controller
public class EasybuyNewController {
    // controller 掉service层
    @Autowired
    @Qualifier("EasybuyNewServiceImpl")
    private EasybuyNewService newService;

    @RequestMapping("/allnew")
    public void allNew(HttpServletResponse response) throws IOException {
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");
        List<EasybuyNews> list = newService.queryAllEasybuyNews();
        System.out.println(list);
        PrintWriter out  = response.getWriter();
        JSONObject json =new JSONObject();
        json.put("list",list);
        out.print(json);
        out.close();
    }
}
