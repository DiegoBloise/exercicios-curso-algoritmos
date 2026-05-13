package examplos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;
import db.exceptions.DbIntegrityException;

public class Delete {
    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement statement = null;

        try {
            conn = DB.getConnection();
            statement = conn.prepareStatement(
                    "DELETE FROM department " +
                            "WHERE id = ?");

            statement.setInt(1, 5);

            int rowAffected = statement.executeUpdate();

            System.out.println("Done! Rows affected: " + rowAffected);

        } catch (SQLException e) {
            throw new DbIntegrityException(e.getMessage());
        } finally {
            DB.closeStatement(statement);
            DB.closeConnection();
        }
    }
}
