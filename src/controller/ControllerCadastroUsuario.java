package controller;
/**
 *
 * @author Kenez
 */
//Imports
import dao.UsuarioDAO;
import dao.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Usuario;
import view.TelaCadastroUsuario;

public class ControllerCadastroUsuario {
    private TelaCadastroUsuario view;
    
    public ControllerCadastroUsuario(TelaCadastroUsuario view) {
        this.view = view;
    }
    
    public void salvarUsuario() {
        String nome = view.getTxtNome().getText();
        String usuario = view.getTxtUsuario().getText();
        String senha = view.getTxtSenha().getText();
        
        Usuario u = new Usuario(nome, usuario, senha);
        Conexao conn = new Conexao();
        
        try {
            Connection connection = conn.conectar();
            UsuarioDAO dao = new UsuarioDAO(connection);
            dao.inserir(u);
            JOptionPane.showMessageDialog(view, "Seu Usuário foi Cadastrado!");
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(view, "Algo deu errado no Cadastro!",
                    "Erro!!!", JOptionPane.ERROR_MESSAGE);
        }
    }
}
