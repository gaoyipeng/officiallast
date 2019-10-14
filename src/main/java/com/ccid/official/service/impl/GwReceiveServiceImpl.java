package com.ccid.official.service.impl;

import com.ccid.official.dao.entity.po.GwReceive;
import com.ccid.official.dao.entity.po.User;
import com.ccid.official.dao.mapper.GwReceiveMapper;
import com.ccid.official.dao.mapper.UserMapper;
import com.ccid.official.service.GwReceiveService;
import com.ccid.official.util.SessionFactorySingleton;
import org.apache.ibatis.session.SqlSession;

public class GwReceiveServiceImpl implements GwReceiveService {
    @Override
    public int addGwReceive(GwReceive gwReceive) {
        SqlSession session = SessionFactorySingleton.getInstance().getSqlSessionFactory().openSession();
        //获取mapper接口代理对象
        GwReceiveMapper gwReceiveMapper = session.getMapper(GwReceiveMapper.class);
        System.out.println(gwReceiveMapper.selectByPrimaryKey(1));
        //关闭session
        session.close();
        return 0;
    }
}
