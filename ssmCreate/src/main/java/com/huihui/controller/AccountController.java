package com.huihui.controller;

import com.huihui.domain.account;
import com.huihui.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * FBI WARING:
 **/
@Controller
@RequestMapping("/account")
public class AccountController {

    //自动类型注入
    @Autowired
    private IAccountService accountService;
    @RequestMapping( "/findAll")
    public String findAll(Model model){
        System.out.println("表现层");
//        调用service的方法
        List<account> all = accountService.findAll();
        model.addAttribute("list",all);
        return "list";
    }

    @RequestMapping("/save")
    public String save(account acc){
        accountService.saveAccount(acc);
        return "list";

    }
}
