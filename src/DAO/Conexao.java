/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import com.mysql.jdbc.Connection;
import java.io.Serializable;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author LabII
 */
public class Conexao implements Serializable {

    private static Conexao conexao = null;
    private static Connection connection;
    private String usuario;
    private String senha;
    private String url;

    private Conexao() {
        usuario = "root";
        senha = "";

        url = "jdbc:mysql://localhost:3306/locadora";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = (Connection) DriverManager.getConnection(url, usuario, senha);
        } catch (ClassNotFoundException | SQLException e) {
        }
    }

    public static Connection getInstance() {
        if (conexao == null) {
            synchronized (Conexao.class) {
                conexao = new Conexao();
            }
        }
        return connection;
    }

    public static void closelInstance() throws SQLException {
        if (conexao != null) {
            connection.close();
        }
    }

    public static void commit() throws SQLException {
        connection.commit();
    }

    public static void rollback() throws SQLException {
        connection.rollback();
    }
}
