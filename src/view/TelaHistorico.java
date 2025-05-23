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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kenez
 */
public class TelaHistorico extends javax.swing.JFrame {

    /**
     * Creates new form TelaHistorico
     */
    public TelaHistorico() {
        initComponents();
        //Tela cheia nessa tela
        //this.setExtendedState(MAXIMIZED_BOTH);
        //fundo preto
        getContentPane().setBackground(new java.awt.Color(0, 0, 0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bntCurtidas = new javax.swing.JButton();
        btnDescurtidas = new javax.swing.JButton();
        btnUltimasBuscas = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaHistorico = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bntCurtidas.setBackground(new java.awt.Color(51, 255, 51));
        bntCurtidas.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bntCurtidas.setText("Musicas Curtidas");
        bntCurtidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCurtidasActionPerformed(evt);
            }
        });

        btnDescurtidas.setBackground(new java.awt.Color(51, 255, 51));
        btnDescurtidas.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnDescurtidas.setText("Musicas Descurtidas");
        btnDescurtidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescurtidasActionPerformed(evt);
            }
        });

        btnUltimasBuscas.setBackground(new java.awt.Color(51, 255, 51));
        btnUltimasBuscas.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnUltimasBuscas.setText("Ultimas 10 Buscas");
        btnUltimasBuscas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimasBuscasActionPerformed(evt);
            }
        });

        btnVoltar.setBackground(new java.awt.Color(51, 255, 51));
        btnVoltar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnVoltar.setText("Voltar ao menu");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        tabelaHistorico.setBackground(new java.awt.Color(0, 0, 0));
        tabelaHistorico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tabelaHistorico.setForeground(new java.awt.Color(51, 255, 51));
        tabelaHistorico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Artista", "Gênero"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaHistorico.setGridColor(new java.awt.Color(153, 153, 153));
        jScrollPane1.setViewportView(tabelaHistorico);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addComponent(bntCurtidas)
                .addGap(58, 58, 58)
                .addComponent(btnDescurtidas)
                .addGap(59, 59, 59)
                .addComponent(btnUltimasBuscas)
                .addGap(266, 266, 266))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 986, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnVoltar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUltimasBuscas)
                    .addComponent(btnDescurtidas)
                    .addComponent(bntCurtidas))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btnVoltar)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntCurtidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCurtidasActionPerformed
        // TODO add your handling code here:
        //Aqui mostraremos na tabela as musicas curtidas pelo usuario
        int idUsuario = model.Sessao.getUsuario().getId();
        
        try{
            //Conexao com bd
            Connection conn = dao.Conexao.conectar();
            
            //Comandos SQL/ true para curtida
            String sql = "SELECT m.id, m.nome, a.nome AS artista, m.genero " + 
                         "FROM curtida c " + 
                         "JOIN musica m ON c.id_musica = m.id " + 
                         "JOIN artista a ON m.id_artista = a.id " + 
                         "WHERE c.id_usuario = ? AND c.status = true";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idUsuario);
            ResultSet rs = stmt.executeQuery();
            
            DefaultTableModel model = (DefaultTableModel) 
                    tabelaHistorico.getModel();
            model.setRowCount(0); 
            
            //Mostrar de fato na tabela
            while (rs.next()){
                int id = rs.getInt("id");
                String nome = rs.getString( "nome");
                String artista = rs.getString( "artista");
                String genero = rs.getString("genero");
                
                model.addRow(new Object[]{ id, nome, artista, genero });
            }
            
            conn.close();
        }catch (Exception e) {
            //Possivel erro que pode dar
            JOptionPane.showMessageDialog(this, "Erro ao carregar curtidas!"
                    + e.getMessage());
        }
    }//GEN-LAST:event_bntCurtidasActionPerformed

    private void btnDescurtidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescurtidasActionPerformed
        // TODO add your handling code here:
        //Aqui mostraremos as musicas descurtidas pelo usuario
        int idUsuario = model.Sessao.getUsuario().getId();
        
        try{
            //Conexão com bd
            Connection conn = dao.Conexao.conectar();
            
            //Comandos para SQL/ false para descurtida
            String sql = "SELECT m.id, m.nome, a.nome AS artista, m.genero " + 
                         "FROM curtida c " + 
                         "JOIN musica m ON c.id_musica = m.id " + 
                         "JOIN artista a ON m.id_artista = a.id " + 
                         "WHERE c.id_usuario = ? AND c.status = false";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1 , idUsuario);
            ResultSet rs = stmt.executeQuery();
            
            DefaultTableModel model = (DefaultTableModel)
                    tabelaHistorico.getModel();
            model.setRowCount(0);
            
            //Mostra de fato na tabela
            while(rs.next()){
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String artista = rs.getString("artista");
                String genero = rs.getString("genero");
                
                model.addRow(new Object[]{ id, nome, artista, genero });
            }
            
            conn.close();
            
            
        }catch (Exception e){
            //Possiveis erros exibem isso:
            JOptionPane.showMessageDialog(this,
                    "Erro ao carregar descurtidas!" + e.getMessage());
        }
    }//GEN-LAST:event_btnDescurtidasActionPerformed

    private void btnUltimasBuscasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimasBuscasActionPerformed
        // TODO add your handling code here:
        //Aqui vamos exibir as 10 ultimas buscas
        int idUsuario = model.Sessao.getUsuario().getId();
        
        try{
            //conexao com bd
            Connection conn = dao.Conexao.conectar();
            
            //Comandos SQL/ limitado a 10 buscas
            String sql = "SELECT m.id, m.nome, a.nome AS artista, m.genero " + 
                         "FROM historico_busca h " + 
                         "JOIN musica m ON h.id_musica = m.id " + 
                         "JOIN artista a ON m.id_artista = a.id " + 
                         "WHERE h.id_usuario = ? " + 
                         "ORDER BY h.data DESC LIMIT 10";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1 , idUsuario);
            ResultSet rs = stmt.executeQuery();
            
            DefaultTableModel model = (DefaultTableModel) 
                    tabelaHistorico.getModel();
            model.setRowCount(0);
            
            //Exibindo de verdade na tabela
            
            while(rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String artista = rs.getString("artista");
                String genero = rs.getString("genero");
                
                model.addRow(new Object[]{ id, nome, artista, genero });
            }
            conn.close();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Erro ao carregar as últimas buscas!" + e.getMessage());
        }
    }//GEN-LAST:event_btnUltimasBuscasActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        //Fecha essa tela
        this.dispose();
        //Abre essa outra(voltar)
        new TelaPrincipal().setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaHistorico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntCurtidas;
    private javax.swing.JButton btnDescurtidas;
    private javax.swing.JButton btnUltimasBuscas;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaHistorico;
    // End of variables declaration//GEN-END:variables
}
