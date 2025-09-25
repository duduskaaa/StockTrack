package Service.DB;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
    Connection connector;
    public DBConnector() {
        try {
            connector = DriverManager.getConnection("jdbc:postgresql://localhost:5432/stocktrack",
                    "khatep", "moon");

        } catch (SQLException e) {
        }
    }

    public Connection getConnect() {
        return connector;
    }
}
