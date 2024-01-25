import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Driver {
    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gas2go", "root", "mysql");

            Statement statement = connection.createStatement();




                ResultSet resultSet = statement.executeQuery("SELECT * FROM customers");

                while (resultSet.next()) {
                    System.out.println( resultSet.getString("first_name") + " " + resultSet.getString("last_name") + " " + resultSet.getString("street"));
                }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
