package infraestructure.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfig {
    private static String URL="jdbc:mysql://localhost:3306/ejercicioHexa";
    private static String USER="root";
    private static String PASSWORD="olferio";

    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    

}
