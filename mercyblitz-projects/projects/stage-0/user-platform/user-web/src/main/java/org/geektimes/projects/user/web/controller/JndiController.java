package org.geektimes.projects.user.web.controller;

import org.geektimes.web.mvc.controller.PageController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.*;

/**
 * @author sunhao
 * @date 2021/3/3 22:04
 * @Description:
 */
@Path("")
public class JndiController implements PageController {

    @GET
    @Path("/jndi")
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        Context initCtx = new InitialContext();
        Context envCtx = (Context) initCtx.lookup("java:comp/env");
        DataSource ds = (DataSource)envCtx.lookup("jdbc/UserPlatformDB");
        Connection conn = ds.getConnection();
        Statement statement = conn.createStatement();
        // 插入一条数据测试
        String sql = String.format("INSERT INTO users(name,password,email,phoneNumber) VALUES ('%s','%s','%s','%s')",
                "a","a","a","a");
        System.out.println(sql);
        // 执行查询语句（DML）
        int resultSet = statement.executeUpdate(sql);
        return String.valueOf(resultSet);
    }
}
