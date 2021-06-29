package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class studentsDB {
    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    public void readDataBase() throws Exception{
        try {
            Class.forName("com.mysql.jdbc.Driver");

            connect = DriverManager.getConnection("jdbc:mysql://localhost/students?"
                    + "user=admin&password=admin");
            statement = connect.createStatement();
            resultSet = statement.executeQuery("select * from students.student");
            // writeResultSet(resultSet);
        } catch (Exception e) {
            throw e;
        } finally {
            System.out.println("close");

        }
    }
}
