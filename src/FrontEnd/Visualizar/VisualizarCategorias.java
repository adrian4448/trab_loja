package FrontEnd.Visualizar;

import BackEnd.DaoFactory.DaoFactory;
import BackEnd.DaoInterface.CategoriaDao;
import BackEnd.Entities.Categoria;
import javax.swing.table.DefaultTableModel;

public class VisualizarCategorias extends javax.swing.JFrame {

    public VisualizarCategorias() {
        initComponents();
        popularTabela();
    }
    
    CategoriaDao categoriaDao = DaoFactory.createCategoriaDao();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popUpMenu = new javax.swing.JPopupMenu();
        excluirCategoriaOP = new javax.swing.JMenuItem();
        panel = new javax.swing.JPanel();
        jScrollPane = new javax.swing.JScrollPane();
        tblCategorias = new javax.swing.JTable();
        lblNomeCategoria = new javax.swing.JLabel();
        txtNomeCategoria = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();

        excluirCategoriaOP.setText("Excluir Categoria");
        excluirCategoriaOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirCategoriaOPActionPerformed(evt);
            }
        });
        popUpMenu.add(excluirCategoriaOP);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        panel.setBackground(new java.awt.Color(204, 204, 204));

        tblCategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sequencia", "Descrição Categoria"
            }
        ));
        tblCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblCategoriasMouseReleased(evt);
            }
        });
        jScrollPane.setViewportView(tblCategorias);

        lblNomeCategoria.setText("Nome Categoria");

        btnPesquisar.setText("Pesquisar");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(lblNomeCategoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(btnPesquisar)))
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeCategoria)
                    .addComponent(txtNomeCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblCategoriasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCategoriasMouseReleased
        if(evt.isPopupTrigger()) {
            popUpMenu.show(jScrollPane, evt.getX(), evt.getY());
        }  
    }//GEN-LAST:event_tblCategoriasMouseReleased

    private void excluirCategoriaOPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirCategoriaOPActionPerformed
        Categoria categoria = new Categoria();
        Integer idCategoria = (Integer) tblCategorias.getValueAt(0, tblCategorias.getSelectedRow());
        categoria.setIdCategoria(idCategoria);
        
        categoriaDao.excluirCategoria(categoria);
        popularTabela();
    }//GEN-LAST:event_excluirCategoriaOPActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VisualizarCategorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisualizarCategorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisualizarCategorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualizarCategorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisualizarCategorias().setVisible(true);
            }
        });
    }
    
    public void popularTabela() {
       DefaultTableModel table = (DefaultTableModel) tblCategorias.getModel();
       table.setNumRows(0);
       for(Categoria categoria : categoriaDao.getAllCategorias()) {
           table.addRow(new Object[] {
               categoria.getIdCategoria(),
               categoria.getDescCategoria()
           });
       }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JMenuItem excluirCategoriaOP;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblNomeCategoria;
    private javax.swing.JPanel panel;
    private javax.swing.JPopupMenu popUpMenu;
    private javax.swing.JTable tblCategorias;
    private javax.swing.JTextField txtNomeCategoria;
    // End of variables declaration//GEN-END:variables
}
