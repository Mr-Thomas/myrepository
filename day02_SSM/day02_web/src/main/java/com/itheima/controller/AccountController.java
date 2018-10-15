package com.itheima.controller;

import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAccountById")
    public String findAccountById(Model model, Integer id, HttpServletResponse response){
        System.out.println("表现层:findAccountById执行了...");
//        response.setContentType("text/html;charset=UTF-8");
        Account account = accountService.findAccountById(id);
        model.addAttribute("account",account);
        System.out.println(account);
        return "success";
    }
}
