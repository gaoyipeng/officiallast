package com.ccid.official.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SessionFactorySingleton {

    private static volatile SessionFactorySingleton instance = null;
    private static SqlSessionFactory sqlSessionFactory ;

    private SessionFactorySingleton()  {
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        InputStream inputStream= null;
        try {
            inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = builder.build(inputStream);
        this.sqlSessionFactory=sqlSessionFactory;
    }

    //运行时加载对象
    public static SessionFactorySingleton getInstance() {
        if (instance == null) {
            synchronized(SessionFactorySingleton.class){
                if(instance == null){
                    instance = new SessionFactorySingleton();
                }
            }
        }
        return instance;
    }

    public static SqlSessionFactory getSqlSessionFactory()
    {
        return sqlSessionFactory;
    }
}
