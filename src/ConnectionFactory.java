import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {
    public Connection getConnection(){
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/hr","root","password");
        }
        catch (SQLException e){
            e.getMessage();
        }
        return null;
    }
}
