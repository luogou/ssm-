package com.huihui.test;

import com.huihui.dao.IAccountDao;
import com.huihui.domain.account;
import com.mysql.cj.Session;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * FBI WARING:
 **/
public class testMybatis {
    @Test
    public void testFindAll() throws Exception {
        InputStream is = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = build.openSession();

        IAccountDao dao = sqlSession.getMapper(IAccountDao.class);

        List<account> all = dao.findAll();
        for (account account : all) {
            System.out.println(all);
        }

        sqlSession.close();
        is.close();

    }

    @Test
    public void testSave() throws Exception {
        InputStream is = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = build.openSession();
        IAccountDao dao = sqlSession.getMapper(IAccountDao.class);

        account acc = new account();
        acc.setName("zhangsan");
        acc.setMoney(400f);
        dao.saveAccount(acc);
        //最最最重要的一步，提交事务提交食物！！！
        sqlSession.commit();
        sqlSession.close();
        is.close();
    }
}
