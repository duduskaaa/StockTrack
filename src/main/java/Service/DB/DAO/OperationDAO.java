package Service.DB.DAO;

import Model.Operation.Operation;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import static Service.DB.DBManager.manager;

public class OperationDAO implements BaseDAO<Operation> {
    PreparedStatement pst;
    @Override
    public void create(Operation operation) throws SQLException {
        pst = manager.prepareStatement(
                "INSERT INTO (product_id, type, quantity, user_id) " +
                        "VALUES(?, ?, ?, ?)"
                );

        pst.setInt(1, operation.getProduct_id());
        pst.setString(2, operation.getType().name());
        pst.setInt(3, operation.getQuantity());
        pst.setInt(4, operation.getUser_id());

        pst.executeUpdate();

        pst.close();
        manager.close();
    }

    @Override
    public void read() throws SQLException{
        pst = manager.prepareStatement(
                "SELECT * FROM operations"
        );


        ResultSet resultSet = pst.executeQuery();
        ResultSetMetaData meta = resultSet.getMetaData();
        int columnCount = meta.getColumnCount();

        while (resultSet.next()) {
            for (int i = 0; i < columnCount; i++) {
                System.out.println(resultSet.getString(i) + "\t");
            }
        }

        manager.close();
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
