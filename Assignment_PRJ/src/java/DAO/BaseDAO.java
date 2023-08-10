package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class BaseDAO {

    public Connection getConnection() throws Exception {
        String url = "jdbc:sqlserver://" + serverName + ":" + portNumber + ";databaseName=" + dbName;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url, userID, password);
    }

    private final String serverName = "localhost";
    private final String dbName = "Web_banson";
    private final String portNumber = "1433";
    private final String userID = "sa";
    private final String password = "123456";

    public static void main(String[] args) {
        try {
            BaseDAO dbcontext = new BaseDAO();
            if (dbcontext.getConnection() != null) {
                System.out.println("connect successfully");
            } else {
                System.out.println("not connect");
            }
        } catch (Exception e) {
        }
    }
}
