import java.sql.Connection;
import java.sql.SQLException;


public class App {
    public static void main(String[] args) throws SQLException {
        DAOFactory mysqlFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);

        DepartmentDAO deptDAO = mysqlFactory.getDepartmentDAO();
    }
}