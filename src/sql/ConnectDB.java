package sql;
import java.sql.*;

public class ConnectDB {
    String url = "jdbc:mysql://localhost:3306/students";
    String username = "root";
    String password = "admin";

    public void connect(){

        try {
            Connection connection = DriverManager.getConnection(url,username,password);
            String query = "INSERT INTO student (name, surname, address) VALUES (?,?,?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, "Kent");
            statement.setString(2, "Dagestanov");
            statement.setString(3, "Minsk");
            //TODO: INSERT INTO TABLE DOES NOT WORK

            //TODO: CREATE DIAGRAMS FIRSTLY maybe))
            int rows = statement.executeUpdate();
            if (rows > 0) {
                System.out.println("a row has been inserted");
            }
            statement.close();
            connection.close();

        } catch(SQLException e) {

            e.printStackTrace();
        }
    }
}
