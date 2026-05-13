package examplos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Read {
    public static void main(String[] args) {

        Connection conn = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {

            conn = DB.getConnection();

            statement = conn.createStatement();

            resultSet = statement.executeQuery("SELECT * FROM department");

            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + ", " + resultSet.getString("Name"));
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            DB.closeResultSet(resultSet);
            DB.closeStatement(statement);
            DB.closeConnection();
        }
    }
}
