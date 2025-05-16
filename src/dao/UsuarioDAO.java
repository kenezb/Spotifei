package dao;
/**
 *
 * @author Kenez
 */
//Conexões
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import model.Usuario;

public class UsuarioDAO {
    private Connection conn;
    
    public UsuarioDAO(Connection conn) {
        this.conn = conn;
    }
    //Método Inserir
    public void inserir(Usuario usuario) throws SQLException {
        String sql = "INSERT INTO usuario(nome, usuario, senha) " +"VALUES('" +
                usuario.getNome() + "', '" +usuario.getUsuario() + "', '" +
                usuario.getSenha() + "')";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.execute();
        conn.close();
    }
    //Método Consultar
    public ResultSet consultar(Usuario usuario) throws SQLException {
        String sql = "SELECT * FROM usuario WHERE usuario = ? AND senha = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, usuario.getUsuario());
        statement.setString(2, usuario.getSenha());
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        conn.close();
        return resultado;
    }
    
}
