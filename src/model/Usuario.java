package model;
/**
 *
 * @author Kenez
 */
public class Usuario {
    //Atributos da tabela usuario
    private int id;
    private String nome;
    private String usuario;
    private String senha;
    
    //Construtor vazio
    public Usuario() {
     
    }
    
    //Construtor com os atributos da tabela usuario
    public Usuario(int id,String nome,String usuario,String senha) {
        this.id = id;
        this.nome = nome;
        this.usuario = usuario;
        this. senha = senha;
    }
    
    //Construtor com os atributos da tabela usuario exeto ID (para cadastro)
    public Usuario(String nome,String usuario,String senha) {
        this.nome = nome;
        this.usuario = usuario;
        this. senha = senha;
    }
    
    //Get e Set (para acessar cada atributo)
    
    //Gets
    public int getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getUsuario() {
        return usuario;
    }
    
    public String getSenha() {
        return senha;
    }
    
    //Sets
    public void setId(int id) {
        this.id = id;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    //Método toString (para exibir os atributos)
    @Override
    public String toString() {
        return "Usuario| " + "id= " + id + ", nome= " + nome + ", usuario= "
                + usuario + "|";
    }
}
