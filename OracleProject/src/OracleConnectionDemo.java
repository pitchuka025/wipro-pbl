import java.sql.Connection;
import java.sql.DriverManager;

public class OracleConnectionDemo {

    public static void main(String[] args) {

        // Change these values according to your Oracle Database
        String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
        String username = "system";
        String password = "rupa";

        Connection con = null;

        try {

            // Load Oracle JDBC Driver
            Class.forName("oracle.jdbc.OracleDriver");

            // Establish Connection
            con = DriverManager.getConnection(url, username, password);

            if (con != null) {
                System.out.println("Connection Established successfully");
            }

            // Close Connection
            con.close();

        } catch (Exception e) {

            System.out.println("Connection could not be established");
            System.out.println("Exception: " + e.getMessage());
        }
    }
}