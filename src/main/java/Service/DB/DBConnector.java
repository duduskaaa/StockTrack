package Service.DB;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
    private static final Logger logger = LoggerFactory.getLogger(DBConnector.class);
    Connection connector;
    public DBConnector() {
        try {
            connector = DriverManager.getConnection("jdbc:postgresql://localhost:5432/stocktrack",
                    "khatep", "moon");

            logger.info("Connected to DB");
        } catch (SQLException e) {
            logger.error("Failed to connect to DB");
        }
    }

    public Connection getConnect() {
        return connector;
    }
}
