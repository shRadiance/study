package org.geektimes.projects.user.sql;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author sunhao
 * @date 2021/3/3 13:37
 * @Description:
 */
public class DataSourceManager {

    private DataSource dataSource;
//    private static volatile DataSourceManager INSTANCE = null;
    private static final DataSourceManager INSTANCE = new DataSourceManager();

//    private DataSourceManager() {}

    public static DataSourceManager getInstance() {
//        this.setDataSource();
        return INSTANCE;
    }

//    public static DataSourceManager getInstance() {
//        if (INSTANCE == null) {
//            synchronized (DataSourceManager.class) {
//                if (INSTANCE == null) {
//                    INSTANCE = new DataSourceManager();
//                }
//            }
//        }
//        return INSTANCE;
//    }

    public Connection getConnection() {
        try {
            return dataSource.getConnection();
        } catch (SQLException throwables) {
            throw new RuntimeException("获取数据库连接失败！");
        }
    }

    public void setDataSource(DataSource dataSource) {
        System.out.println("setDataSource = " + dataSource.toString());
        DataSourceManager.INSTANCE.dataSource = dataSource;
    }

}
