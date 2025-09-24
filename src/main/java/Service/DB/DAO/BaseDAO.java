package Service.DB.DAO;

import java.sql.SQLException;

public interface BaseDAO<T> {
    void create(T t) throws SQLException;
    void read() throws SQLException;
    void update();
    void delete();
}
