package com.ccid.official;

import java.sql.*;
import java.util.UUID;

public class Test {

    public static void main(String[] args) throws SQLException  {
        Connection conn = null;
        Statement  stmt = null;
        ResultSet rs = null;
        try {
            conn = ConnectionPool.getInstance().getConnection();
            stmt = conn.createStatement();

            //如果存在USER_INFO表就先删除USER_INFO表
            stmt.execute("DROP TABLE IF EXISTS USER_INFO");
            //创建USER_INFO表
            stmt.execute("CREATE TABLE USER_INFO(id VARCHAR(36) PRIMARY KEY,name VARCHAR(100),sex VARCHAR(4))");
            //新增
            stmt.executeUpdate("INSERT INTO USER_INFO VALUES('" + UUID.randomUUID()+ "','大日如来','男')");
            stmt.executeUpdate("INSERT INTO USER_INFO VALUES('" + UUID.randomUUID()+ "','青龙','男')");
            stmt.executeUpdate("INSERT INTO USER_INFO VALUES('" + UUID.randomUUID()+ "','白虎','男')");
            stmt.executeUpdate("INSERT INTO USER_INFO VALUES('" + UUID.randomUUID()+ "','朱雀','女')");
            stmt.executeUpdate("INSERT INTO USER_INFO VALUES('" + UUID.randomUUID()+ "','玄武','男')");
            stmt.executeUpdate("INSERT INTO USER_INFO VALUES('" + UUID.randomUUID()+ "','苍狼','男')");
            //删除
            stmt.executeUpdate("DELETE FROM USER_INFO WHERE name='大日如来'");
            //修改
            stmt.executeUpdate("UPDATE USER_INFO SET name='孤傲苍狼' WHERE name='苍狼'");
            //查询
            rs = stmt.executeQuery("SELECT * FROM USER_INFO");
            //遍历结果集
            while (rs.next()) {
                System.out.println(rs.getString("id") + "," + rs.getString("name")+ "," + rs.getString("sex"));
            }

        } finally {
            ConnectionPool.releaseConnection(conn, stmt, rs);
        }
    }

}
