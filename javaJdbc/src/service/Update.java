package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;

public class Update {
    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement statement = null;

        try {
            conn = DB.getConnection();
            statement = conn.prepareStatement(
                    "UPDATE seller " +
                            "SET BaseSalary = BaseSalary + ? " +
                            "WHERE (DepartmentId = ?)");

            statement.setDouble(1, 200.0);
            statement.setInt(2, 2);

            int rowAffected = statement.executeUpdate();

            System.out.println("Done! Rows affected: " + rowAffected);

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            DB.closeStatement(statement);
            DB.closeConnection();
        }
    }
}
