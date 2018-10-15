package com.itheima.demo;

import com.itheima.dao.AccountDao;

import com.itheima.domain.Account;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DaoText {
    @Test
    public void Dao_Text(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext-dao.xml");
        AccountDao dao = ac.getBean(AccountDao.class);
        Account account = dao.findAccountById(1);
        System.out.println(account.getName());
    }
}
