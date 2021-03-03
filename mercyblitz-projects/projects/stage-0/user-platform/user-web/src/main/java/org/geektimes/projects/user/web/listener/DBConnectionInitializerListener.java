package org.geektimes.projects.user.web.listener;

import org.apache.tomcat.dbcp.dbcp.BasicDataSource;
import org.geektimes.projects.user.sql.DBConnectionManager;
import org.geektimes.projects.user.sql.DataSourceManager;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.sql.SQLException;
import java.sql.Statement;

@WebListener
public class DBConnectionInitializerListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("DBConnectionInitializerListener.contextInitialized start");
        initDataSource(sce.getServletContext());
        initData();
    }

    private void initData() {
        try {
            Statement statement = DataSourceManager.getInstance().getConnection().createStatement();
            statement.execute(DBConnectionManager.CREATE_USERS_TABLE_DDL_SQL);
            statement.executeUpdate(DBConnectionManager.INSERT_USER_DML_SQL);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    private void initDataSource(ServletContext servletContext) {
        String databaseURL = "jdbc:derby:/db/user-platform;create=true";
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl(databaseURL);
        DataSourceManager.getInstance().setDataSource(dataSource);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
