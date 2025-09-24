package Service.DB;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.SQLException;

public class DBManager {
    private final static Logger logger = LoggerFactory.getLogger(DBManager.class);
    public static final Connection manager = new DBConnector().getConnect();

    void close() throws SQLException {
        manager.close();
        logger.info("Connect is end");
    }
}
