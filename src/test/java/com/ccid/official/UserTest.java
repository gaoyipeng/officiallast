package com.ccid.official;

import com.ccid.official.dao.mapper.UserMapper;
import com.ccid.official.dao.entity.po.User;
import com.ccid.official.util.SessionFactorySingleton;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class UserTest {

    @Test
    public void userFindByIdTest(){
        SqlSession session = SessionFactorySingleton.getInstance().getSqlSessionFactory().openSession();
        //获取mapper接口代理对象
        UserMapper userMapper = session.getMapper(UserMapper.class);
        User user = userMapper.selectByPrimaryKey(1);
        //输出结果
        System.out.println(user.getUsername());
        //关闭session
        session.close();
    }
}
