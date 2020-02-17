package com.sl.controller;

import com.sl.pojo.EasybuyUser;
import com.sl.service.EasybuyService;
import com.sl.util.MD5;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class EasybuyUserController {

    // controller 掉service层
    @Autowired
    @Qualifier("EasybuyServiceImpl")
    private EasybuyService easybuyService;
    @RequestMapping("/toLogin")
    public String toLogin(){
        return "Login";
    }

    @RequestMapping("/toRegis")
    public String toRegis(){
        return "Regist";
    }
    @RequestMapping("/toindex")
    public String toIndex(){
        return "index";
    }

    @RequestMapping("/Login")
    public void login(@RequestParam("loginName") String loginName, @RequestParam("password") String password, HttpServletResponse response, HttpServletRequest request) throws IOException {
        EasybuyUser user1 = easybuyService.queryUser(loginName);
        PrintWriter out = response.getWriter();
        JSONObject json = new JSONObject();
        if (user1!=null){
            if(user1.getPassword().equals(MD5.string2MD5(password))){
                request.getSession().setAttribute("user",user1);
                json.put("user",user1);
            }else{
                json.put("msg","002");
            }
        }else {
            json.put("msg","001");
        }
        out.print(json);
        out.close();
    }

    @RequestMapping("/addUser")
    public void addUser(EasybuyUser user, HttpServletResponse response) throws IOException {
        user.setPassword(MD5.string2MD5(user.getPassword().trim()));
      int num  = easybuyService.addUser(user);
        PrintWriter out = response.getWriter();
        JSONObject json = new JSONObject();
        if (num>0){
        }
    }
}
