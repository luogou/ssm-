package com.huihui.service;

import com.huihui.domain.account;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * FBI WARING:
 **/
public interface IAccountService {
    public List<account> findAll();
    public void saveAccount(account acc);
}
