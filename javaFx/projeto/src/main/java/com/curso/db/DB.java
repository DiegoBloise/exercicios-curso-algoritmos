package com.curso.db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.curso.db.exceptions.DbException;
import com.curso.util.Alerts;

import javafx.scene.control.Alert.AlertType;

public class DB {

    private static Connection conn = null;

    public static Connection getConnection() {
        if (conn == null) {
            Properties props = loadProperties();
            String url = props.getProperty("dburl");
            try {
                conn = DriverManager.getConnection(url, props);
            } catch (SQLException e) {
                Alerts.showAlert("Erro ao abrir conexão com o banco de dados", null, e.getMessage(), AlertType.ERROR);
                throw new DbException(e.getMessage());
            }
        }
        return conn;
    }

    public static void closeConnection() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                Alerts.showAlert("Erro ao fechar conexão com o banco de dados", null, e.getMessage(), AlertType.ERROR);
                throw new DbException(e.getMessage());
            }
        }
    }

    private static Properties loadProperties() {
        try (FileInputStream fs = new FileInputStream("db.properties")) {
            Properties props = new Properties();
            props.load(fs);
            return props;
        } catch (IOException e) {
            Alerts.showAlert("Erro ao carregar arquivo de configuração", null, e.getMessage(), AlertType.ERROR);
            throw new DbException(e.getMessage());
        }
    }

    public static void closeStatement(Statement st) {
        if (st != null) {
            try {
                st.close();
            } catch (SQLException e) {
                Alerts.showAlert("Erro ao fechar conexão com o banco de dados", null, e.getMessage(), AlertType.ERROR);
                throw new DbException(e.getMessage());
            }
        }
    }

    public static void closeResultSet(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                Alerts.showAlert("Erro ao fechar conexão com o banco de dados", null, e.getMessage(), AlertType.ERROR);
                throw new DbException(e.getMessage());
            }
        }
    }
}