
package model;

/**
 *
 * @author Kenez
 */
//Guardando o usuario logado aqui
public class Sessao {
    private static Usuario usuarioLogado;
    
    public static void setUsuario(Usuario usuario) {
        Sessao.usuarioLogado = usuario;
    }

    public static Usuario getUsuario() {
        return Sessao.usuarioLogado;
    }
}
