package Service.DB.DAO;

import Model.Product.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static Service.DB.DBManager.manager;

public class ProductDAO implements BaseDAO<Product> {
    PreparedStatement pst;
    @Override

    public void create(Product product) {
        try {
            pst = manager.prepareStatement(
                    "INSERT INTO products(product_name. category, amount)" +
                            "VALUES (?, ?)"
            );

            pst.setString(1, product.getProduct_name());
            pst.setInt(2, product.getAmount());

            pst.executeUpdate();


            pst.close();
            manager.close();

        } catch (SQLException e) {
        }
    }

    @Override
    public void read(Object o) throws SQLException {
        try {
            pst = manager.prepareStatement("SELECT * FROM products");

            ResultSet resultSet = pst.executeQuery();
            int columnCount = resultSet.
                    getMetaData().
                    getColumnCount();

            while (resultSet.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.println(resultSet.getString(i) + "\t");
                }
            }

        } catch (SQLException e) {
        }
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
