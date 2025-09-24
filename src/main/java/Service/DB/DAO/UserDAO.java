package Service.DB.DAO;

import Model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;

import static Service.DB.DBManager.manager;

public class UserDAO implements BaseDAO<User> {
    private static final Logger logger = LoggerFactory.getLogger(UserDAO.class);
    PreparedStatement pst;

    @Override
    public void create(User user) {
        try {
            pst = manager.prepareStatement(
                    "INSERT INTO users(user_name)" +
                            "VALUES (?)"
            );
            pst.setString(1, user.getFirst_name());

            pst.executeUpdate();

            logger.info("Write to table <user>");
            pst.close();
            manager.close();

        } catch (SQLException e) {
            logger.error(e.getMessage());
        }
    }

    @Override
    public void read() {
        try {
            pst = manager.prepareStatement("SELECT * FROM users");

            logger.info("Start to read <users>");

            ResultSet resultSet = pst.executeQuery();
            ResultSetMetaData meta = resultSet.getMetaData();
            int columnCount = meta.getColumnCount();

            while (resultSet.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(resultSet.getString(i) + "\t");
                }
            }

            pst.close();
            manager.close();
        } catch (SQLException e) {
            logger.error(e.getMessage());
        }
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
