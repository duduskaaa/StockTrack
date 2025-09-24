import Model.Operation.Operation;
import Model.User;
import Service.DB.DAO.UserDAO;
import Service.DB.DBConnector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App  {
    private static final Logger logger = LoggerFactory.getLogger(App.class);
    public static void main(String[] args) {
        User user = new User("Andrey");
        UserDAO userDAO = new UserDAO();
    }
}