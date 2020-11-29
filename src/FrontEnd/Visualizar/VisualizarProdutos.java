package FrontEnd.Visualizar;

import BackEnd.DaoFactory.DaoFactory;
import BackEnd.DaoInterface.CategoriaDao;
import BackEnd.DaoInterface.FornecedorDao;
import BackEnd.DaoInterface.ProdutoVendaDao;
import BackEnd.Entities.ProdutoVenda;
import BackEnd.Entities.StatusProduto;
import FrontEnd.Utils.MethodUtils;
import FrontEnd.Visualizar.Alterar.AlterarProduto;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VisualizarProdutos extends javax.swing.JFrame {

    public VisualizarProdutos() {
        initComponents();
        popularTabela();
        methodUtils.popularComboBox(cbxCategoriaProduto, cbxFornecedor);
    }
        
    CategoriaDao categoriaDao = DaoFactory.createCategoriaDao();
    ProdutoVendaDao produtoDao = DaoFactory.createProdutoVendaDao();
    FornecedorDao fornecedorDao = DaoFactory.createFornecedorDao();
    MethodUtils methodUtils = new MethodUtils();
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popUpMenu = new javax.swing.JPopupMenu();
        alterarProdutoOP = new javax.swing.JMenuItem();
        devolverProdutoOP = new javax.swing.JMenuItem();
        venderProdutoOP = new javax.swing.JMenuItem();
        inativarProduto = new javax.swing.JMenuItem();
        panel = new javax.swing.JPanel();
        scrollPane = new javax.swing.JScrollPane();
        tblProduto = new javax.swing.JTable();
        lblNomeProduto = new javax.swing.JLabel();
        lblCategoriaProduto = new javax.swing.JLabel();
        lblFornecedor = new javax.swing.JLabel();
        txtNomeProduto = new javax.swing.JTextField();
        cbxCategoriaProduto = new javax.swing.JComboBox<>();
        cbxFornecedor = new javax.swing.JComboBox<>();
        btnPesquisar = new javax.swing.JButton();

        alterarProdutoOP.setText("Alterar Produto");
        alterarProdutoOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarProduto(evt);
            }
        });
        popUpMenu.add(alterarProdutoOP);

        devolverProdutoOP.setText("Marcar como Devolvido");
        devolverProdutoOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devolverProduto(evt);
            }
        });
        popUpMenu.add(devolverProdutoOP);

        venderProdutoOP.setText("Marcar como Vendido");
        venderProdutoOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                venderProduto(evt);
            }
        });
        popUpMenu.add(venderProdutoOP);

        inativarProduto.setText("Inativar Produto");
        inativarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inativarProduto(evt);
            }
        });
        popUpMenu.add(inativarProduto);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        panel.setBackground(new java.awt.Color(204, 204, 204));

        tblProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sequencia", "Nome Produto", "Valor Produto", "Categoria Produto", "Fornecedor Produto", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                popUp(evt);
            }
        });
        scrollPane.setViewportView(tblProduto);

        lblNomeProduto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNomeProduto.setText("Nome Produto:");

        lblCategoriaProduto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCategoriaProduto.setText("Categoria Produto:");

        lblFornecedor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblFornecedor.setText("Fornecedor:");

        btnPesquisar.setText("Pesquisar");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                        .addComponent(lblNomeProduto)
                        .addGap(180, 180, 180)
                        .addComponent(lblFornecedor)
                        .addGap(339, 339, 339)
                        .addComponent(btnPesquisar)
                        .addGap(0, 81, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(scrollPane, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                                .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbxFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCategoriaProduto)
                                    .addComponent(cbxCategoriaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeProduto)
                    .addComponent(lblFornecedor)
                    .addComponent(lblCategoriaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxCategoriaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addGap(76, 76, 76)
                .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
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
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void popUp(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_popUp
        if(evt.isPopupTrigger()) {
            popUpMenu.show(scrollPane, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_popUp

    private void venderProduto(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_venderProduto
       ProdutoVenda produto = new ProdutoVenda();
       produto.setIdProduto(Integer.parseInt(tblProduto.getValueAt(tblProduto.getSelectedRow(), 0).toString()));
       produtoDao.venderProduto(produto);
       JOptionPane.showMessageDialog(null, "Produto marcado como Vendido");
       popularTabela();
    }//GEN-LAST:event_venderProduto

    private void devolverProduto(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devolverProduto
       ProdutoVenda produto = new ProdutoVenda();
       produto.setIdProduto(Integer.parseInt(tblProduto.getValueAt(tblProduto.getSelectedRow(), 0).toString()));
       produtoDao.devolverProduto(produto);
       JOptionPane.showMessageDialog(null, "Produto marcado como Devolvido");
       popularTabela();
    }//GEN-LAST:event_devolverProduto

    private void alterarProduto(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarProduto
        ProdutoVenda produto = new ProdutoVenda();
        produto.setIdProduto(Integer.parseInt(tblProduto.getValueAt(tblProduto.getSelectedRow(), 0).toString()));
        produto.setDescProduto(tblProduto.getValueAt(tblProduto.getSelectedRow(), 1).toString());
        produto.setPrecoProduto(Double.parseDouble(tblProduto.getValueAt(tblProduto.getSelectedRow(), 2).toString()));
        AlterarProduto alterarProdutoForm = new AlterarProduto();
        alterarProdutoForm.popularCampos(produto);
        alterarProdutoForm.setVisualizarProdutos(this);
        alterarProdutoForm.setVisible(true);
    }//GEN-LAST:event_alterarProduto

    private void inativarProduto(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inativarProduto
       ProdutoVenda produto = new ProdutoVenda();
       produto.setIdProduto(Integer.parseInt(tblProduto.getValueAt(tblProduto.getSelectedRow(), 0).toString()));
       produtoDao.inativarProduto(produto);
       JOptionPane.showMessageDialog(null, "Produto marcado como Inativo");
       popularTabela();
    }//GEN-LAST:event_inativarProduto


    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VisualizarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisualizarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisualizarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualizarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisualizarProdutos().setVisible(true);
            }
        });
    }
    
    public void popularTabela() {
        DefaultTableModel table = (DefaultTableModel) tblProduto.getModel();
        table.setRowCount(0);
        
        for(ProdutoVenda produto : produtoDao.getAllProducts()) {
            table.addRow(new Object[] {
                produto.getIdProduto(),
                produto.getDescProduto(),
                produto.getPrecoProduto(),
                produto.getCategoria().getDescCategoria(),
                produto.getFornecedor().getNomeFornecedor(),
                produto.getStatusProduto().name()
            });
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem alterarProdutoOP;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox<String> cbxCategoriaProduto;
    private javax.swing.JComboBox<String> cbxFornecedor;
    private javax.swing.JMenuItem devolverProdutoOP;
    private javax.swing.JMenuItem inativarProduto;
    private javax.swing.JLabel lblCategoriaProduto;
    private javax.swing.JLabel lblFornecedor;
    private javax.swing.JLabel lblNomeProduto;
    private javax.swing.JPanel panel;
    private javax.swing.JPopupMenu popUpMenu;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTable tblProduto;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JMenuItem venderProdutoOP;
    // End of variables declaration//GEN-END:variables
}
