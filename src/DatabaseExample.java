import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseExample {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gas2go", "root", "mysql");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM drivers WHERE manager_id=1");

            while (resultSet.next()){
                System.out.println(resultSet.getString("first_name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
