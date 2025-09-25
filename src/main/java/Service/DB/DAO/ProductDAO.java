package Service.DB.DAO;

import Model.Product.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import static Service.DB.DBManager.manager;

public class ProductDAO implements BaseDAO<Product> {
    PreparedStatement pst;
    private static final Logger logger = LoggerFactory.getLogger(ProductDAO.class);
    @Override
    public void create(Product product) throws SQLException {
        try {
            pst = manager.prepareStatement(
                    "INSERT INTO products(product_name. category, amount)" +
                            "VALUES (?, ?, ?)"
            );

            pst.setString(1, product.getProduct_name());
            pst.setString(2, product.getCategory());
            pst.setInt(3, product.getAmount());

            pst.executeUpdate();

            logger.info("Write to table <products>");

            pst.close();
            manager.close();

        } catch (SQLException e) {
            logger.error(e.getMessage());
        }
    }

    @Override
    public void read() throws SQLException {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
