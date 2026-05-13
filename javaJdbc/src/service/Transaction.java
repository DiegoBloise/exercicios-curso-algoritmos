package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;

public class Transaction {
    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement statement = null;

        try {
            conn = DB.getConnection();

            conn.setAutoCommit(false);

            statement = conn.prepareStatement(
                    "UPDATE seller " +
                            "SET BaseSalary = 3900 " +
                            "WHERE DepartmentId = 2");

            int rowAffected1 = statement.executeUpdate();

            int x = 1;
            if (x > 0) {
                throw new SQLException("Fake error");
            }

            statement = conn.prepareStatement(
                    "UPDATE seller " +
                            "SET BaseSalary = 3900 " +
                            "WHERE DepartmentId = 2");

            int rowAffected2 = statement.executeUpdate();

            conn.commit();

            System.out.println("1: Done! Rows affected: " + rowAffected1);
            System.out.println("2: Done! Rows affected: " + rowAffected2);

        } catch (SQLException e) {
            try {
                conn.rollback();
                System.out.println("Transaction rolled back! Caused by: " + e.getMessage());
            } catch (SQLException err) {
                System.out.println("Error: " + err.getMessage());
            }
        } finally {
            DB.closeStatement(statement);
            DB.closeConnection();
        }
    }
}
