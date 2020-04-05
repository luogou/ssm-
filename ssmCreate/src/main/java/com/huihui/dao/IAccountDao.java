package com.huihui.dao;

import com.huihui.domain.account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * FBI WARING:
 **/
@Repository
public interface IAccountDao {
    @Select("select * from account")
    public List<account> findAll();
    @Insert("insert into account (name,money) values (#{name},#{money})")
    public void saveAccount(account acc);
}
