package dao;
/**
 *
 * @author Kenez
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexão {
    private static final String URL = "jdbc:postgresql://localhost:5432/Spotifei";
    private static final String USUARIO = "postgres";
    private static final String SENHA = "kenezb";
    
    public static Connection conectar() {
        try {
            return DriverManager.getConnection(, USUARIO, SENHA);
        } catch (SQLException e) {
            System.out.println("ERRO AO CONECTAR COM O BANCO DE DADOS, " 
            + e.getMessage());
            return null;
        }
    }
}
