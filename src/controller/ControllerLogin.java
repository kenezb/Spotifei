package controller;
/**
 *
 * @author Kenez
 */
//Imports
import dao.Conexao;
import dao.UsuarioDAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Usuario;
import view.TelaLogin;
import view.TelaPrincipal;

public class ControllerLogin {
    private TelaLogin view;
    
    public ControllerLogin(TelaLogin view) {
        this.view = view;
    }
    
    public void autenticarUsuario() {
        String usuario = view.getTxtUsuario().getText();
        String senha = view.getTxtSenha().getText();
        
        Usuario u = new Usuario();
        u.setUsuario(usuario);
        u.setSenha(senha);
        
        //Conexão 
        Conexao conexao = new Conexao();
        
        try{
            Connection conn = conexao.conectar();
            UsuarioDAO dao = new UsuarioDAO(conn);
            ResultSet rs = dao.consultar(u);
            
            if (rs.next()) {
                JOptionPane.showMessageDialog(view, "Seu Usuário foi logado!");
                //Fecha essa tela
                view.dispose();
                //Abre a tela inicial agora
                new TelaPrincipal().setVisible(true);
            }else{
                JOptionPane.showMessageDialog(view, "Usuário ou senha "
                        + "incorretos!", "Erro!!!", JOptionPane.ERROR_MESSAGE);
            }
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(view, "Algo deu errado com o Banco!",
                    "Erro!!!", JOptionPane.ERROR_MESSAGE);
        }
    }
}
