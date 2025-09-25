package Service.DB.DAO;

import Model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;

import static Service.DB.DBManager.manager;

public class UserDAO implements BaseDAO<User> {
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

            pst.close();
            manager.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void read(Object o) throws SQLException {
        try {
            pst = manager.prepareStatement("SELECT * FROM users WHERE user_name = ?");

            pst.setString(1, (String) o);


            ResultSet resultSet = pst.executeQuery();
            int columnCount = resultSet.
                    getMetaData().
                    getColumnCount();

            while (resultSet.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(resultSet.getString(i) + "\t");
                }
            }

            pst.close();
            manager.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
