package Service.DB.DAO;

import java.sql.SQLException;

public interface BaseDAO<T> {
    void create(T t) throws SQLException;
    void read(Object o) throws SQLException;
    void update();
    void delete();
}
