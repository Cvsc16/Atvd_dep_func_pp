import java.sql.Connection;
import java.sql.SQLException;


public class App {
    public static void main(String[] args) throws SQLException {
        Connection con = new ConnectionFactory().getConnection();
        System.out.println("Conectado.");
        con.close();
    }
}
