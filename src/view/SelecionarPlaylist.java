/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

//Imports
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Kenez
 */
public class SelecionarPlaylist extends javax.swing.JFrame {

    /**
     * Creates new form SelecionarPlaylist
     */
    private int idMusica;
    public SelecionarPlaylist(int idMusica){
        initComponents();
        this.idMusica = idMusica;
        carregarPlaylists();
        //Tela cheia nessa tela
        //this.setExtendedState(MAXIMIZED_BOTH);
        //fundo preto
        getContentPane().setBackground(new java.awt.Color(0, 0, 0));
        //centraliza essa telinha
        this.setLocationRelativeTo(null);
    }
    //Carregar playlists no combobox
    private void carregarPlaylists(){
        int idUsuario = model.Sessao.getUsuario().getId();
        
        try{
            //Conexao com banco
            Connection conn = dao.Conexao.conectar();
            
            //Comandos SQL
            String sql = "SELECT id, nome FROM playlist WHERE id_usuario = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1 , idUsuario);
            ResultSet rs = stmt.executeQuery();
            
            comboPlaylists.removeAllItems();
            
            while (rs.next()){
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                comboPlaylists.addItem(id +  " - " + nome);
            }
            conn.close();
        }catch(Exception e){
            //Possíveis erros
            JOptionPane.showMessageDialog(this,
                    "Erro ao carregar playlists!" + e.getMessage());
        }
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        comboPlaylists = new javax.swing.JComboBox<>();
        btnCancelar = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 51));
        jLabel1.setText("Selecione uma Playlist");

        comboPlaylists.setBackground(new java.awt.Color(153, 153, 153));
        comboPlaylists.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnCancelar.setBackground(new java.awt.Color(51, 255, 51));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancelar.setText("Cancelar");

        btnAdicionar.setBackground(new java.awt.Color(51, 255, 51));
        btnAdicionar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addComponent(comboPlaylists, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(comboPlaylists, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        // TODO add your handling code here:
        //Adiciona música na playlist de fato
        String itemSelecionado = (String) comboPlaylists.getSelectedItem();
        
        if (itemSelecionado !=null){
            int idPlaylist = Integer.parseInt(itemSelecionado.split(" - ")[0]);
            
            try{
                //Conexao com banco
                Connection conn = dao.Conexao.conectar();
                
                //Comandos SQL
                String sql = "INSERT INTO musica_playlist (id_musica, id_playlist) VALUES (?, ?)";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setInt(1 , idMusica);
                stmt.setInt(2 , idPlaylist);
                stmt.executeUpdate();
                
                conn.close();
                
                //Caso dê certo
                JOptionPane.showMessageDialog(this,
                        "Música adicionada na Playlist!");
                this.dispose();
            }catch(Exception e){
                //Erro ao adicionar a musica
                JOptionPane.showMessageDialog(this,
                        "Erro ao adicionar música!" + e.getMessage());
            }
        }else{
           //Caso nao selecione nenhuma playlist
           JOptionPane.showMessageDialog(this,
                   "Nenhuma playlist foi selecionada!");
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> comboPlaylists;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
