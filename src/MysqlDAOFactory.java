import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlDAOFactory extends DAOFactory {

    public static final String DRIVER = "com.mysql.jdbc";
    public static final String DBURL= "jdbc:mysql://localhost/hr";

    public static Connection createConnection() {
        try {
            return DriverManager.getConnection(DBURL,"root","password");
        }
        catch (SQLException e){
            e.getMessage();
        }
        return null;
    }

    @Override
    public DepartmentDAO getDepartmentDAO() {
        return new MysqlDerpatamentDAO();
    }

    //public EmployeeDAO getEmployeeDAO() {
    //  return new MysqlEmployeeDAO();
    //}
}

