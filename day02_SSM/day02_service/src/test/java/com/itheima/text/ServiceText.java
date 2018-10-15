package com.itheima.text;

import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceText {
    @Test
    public void ServiceDemo() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext-service.xml");
        AccountService accountService = ac.getBean("accountService", AccountService.class);
        Account account = accountService.findAccountById(1);
        System.out.println(account.getMoney());
    }
}
