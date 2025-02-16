package FrontEnd.Visualizar;

import BackEnd.DaoFactory.DaoFactory;
import BackEnd.DaoInterface.FornecedorDao;
import BackEnd.Entities.Fornecedor;
import FrontEnd.Visualizar.Alterar.AlterarFornecedor;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VisualizarFornecedores extends javax.swing.JFrame {

    public VisualizarFornecedores() {
        initComponents();
        popularTabela(fornecedorDao.getAllFornecedores());
    }

    FornecedorDao fornecedorDao = DaoFactory.createFornecedorDao();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popUpMenu = new javax.swing.JPopupMenu();
        alterarFornecedorOP = new javax.swing.JMenuItem();
        excluirFornecedorOP = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane = new javax.swing.JScrollPane();
        tblFornecedores = new javax.swing.JTable();
        lblNomeFornecedor = new javax.swing.JLabel();
        txtNomeFornecedor = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        alterarFornecedorOP.setText("Alterar Fornecedor");
        alterarFornecedorOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarFornecedor(evt);
            }
        });
        popUpMenu.add(alterarFornecedorOP);

        excluirFornecedorOP.setText("Excluir Fornecedor");
        excluirFornecedorOP.setToolTipText("");
        excluirFornecedorOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirFornecedor(evt);
            }
        });
        popUpMenu.add(excluirFornecedorOP);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        tblFornecedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sequencia", "Nome Fornecedor", "Telefone Fornecedor"
            }
        ));
        tblFornecedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                abrirPopUp(evt);
            }
        });
        jScrollPane.setViewportView(tblFornecedores);

        lblNomeFornecedor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNomeFornecedor.setText("Nome Fornecedor");

        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisar(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNomeFornecedor)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNomeFornecedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void excluirFornecedor(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirFornecedor
        Fornecedor categoria = new Fornecedor();
        Integer idFornecedor = Integer.parseInt(tblFornecedores.getValueAt(tblFornecedores.getSelectedRow(),0).toString());
        categoria.setIdFornecedor(idFornecedor);

        fornecedorDao.excluirFornecedor(categoria);
        popularTabela(fornecedorDao.getAllFornecedores());
        JOptionPane.showMessageDialog(null, "Fornecedor excluido com Sucesso !");
    }//GEN-LAST:event_excluirFornecedor

    private void abrirPopUp(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abrirPopUp
         if(evt.isPopupTrigger()) {
            popUpMenu.show(jScrollPane, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_abrirPopUp

    private void alterarFornecedor(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarFornecedor
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setIdFornecedor((Integer) tblFornecedores.getValueAt(tblFornecedores.getSelectedRow(), 0));
        fornecedor.setNomeFornecedor((String) tblFornecedores.getValueAt(tblFornecedores.getSelectedRow(), 1));
        fornecedor.setTelefoneFornecedor((String) tblFornecedores.getValueAt(tblFornecedores.getSelectedRow(), 2));
        
        AlterarFornecedor alterarFornecedorForm = new AlterarFornecedor();
        alterarFornecedorForm.popularCampos(fornecedor);
        alterarFornecedorForm.setVisualizarFornecedores(this);
        alterarFornecedorForm.setVisible(true);
    }//GEN-LAST:event_alterarFornecedor

    private void pesquisar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisar
        String nomeFornecedor = txtNomeFornecedor.getText();
        fornecedorDao.getFornecedorByFilter(nomeFornecedor);
        popularTabela(fornecedorDao.getFornecedorByFilter(nomeFornecedor));
    }//GEN-LAST:event_pesquisar

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VisualizarFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisualizarFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisualizarFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualizarFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisualizarFornecedores().setVisible(true);
            }
        });
    }
    
    public void popularTabela(List<Fornecedor> fornecedores) {
       DefaultTableModel table = (DefaultTableModel) tblFornecedores.getModel();
       table.setNumRows(0);
       for(Fornecedor fornecedor : fornecedores) {
           table.addRow(new Object[] {
               fornecedor.getIdFornecedor(),
               fornecedor.getNomeFornecedor(),
               fornecedor.getTelefoneFornecedor()
           });
       }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem alterarFornecedorOP;
    private javax.swing.JMenuItem excluirFornecedorOP;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblNomeFornecedor;
    private javax.swing.JPopupMenu popUpMenu;
    private javax.swing.JTable tblFornecedores;
    private javax.swing.JTextField txtNomeFornecedor;
    // End of variables declaration//GEN-END:variables
}
