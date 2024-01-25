import java.sql.*;

public class MyJDBC {
    public static void main(String[] args) {
        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gas2go","root","mysql");

            Statement statement = connection.createStatement();

            ResultSet resultset = statement.executeQuery("");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
