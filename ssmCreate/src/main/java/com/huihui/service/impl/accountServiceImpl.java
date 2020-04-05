package com.huihui.service.impl;

import com.huihui.dao.IAccountDao;
import com.huihui.domain.account;
import com.huihui.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * FBI WARING:
 **/

@Service(value = "accountService")
public class accountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

    @Override
    public List<account> findAll() {
        System.out.println("业务层：查询所有账户信息");
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(account acc)
    {
        accountDao.saveAccount(acc);
        System.out.println("业务层：保存账户");
    }
}
