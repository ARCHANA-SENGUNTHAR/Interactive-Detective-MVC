package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static boolean printed = false;

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    DBConfig.URL,
                    DBConfig.USER,
                    DBConfig.PASSWORD);

            if (!printed) {
                System.out.println(" Database Connected Successfully");
                printed = true;
            }
            return con;

        } catch (Exception e) {
            System.out.println(" Database Connection Failed");
            return null;
        }
    }
}
