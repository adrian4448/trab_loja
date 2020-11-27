package FrontEnd.Visualizar;

import BackEnd.DaoFactory.DaoFactory;
import BackEnd.DaoInterface.CategoriaDao;
import BackEnd.DaoInterface.FornecedorDao;
import BackEnd.DaoInterface.ProdutoVendaDao;
import BackEnd.Entities.ProdutoVenda;
import FrontEnd.Utils.MethodUtils;
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
        excluirProduto = new javax.swing.JMenuItem();
        alterarProdutoOP = new javax.swing.JMenuItem();
        devolverProdutoOP = new javax.swing.JMenuItem();
        venderProdutoOP = new javax.swing.JMenuItem();
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

        excluirProduto.setText("Excluir Produto");
        popUpMenu.add(excluirProduto);

        alterarProdutoOP.setText("Alterar Produto");
        popUpMenu.add(alterarProdutoOP);

        devolverProdutoOP.setText("Marcar como Devolvido");
        popUpMenu.add(devolverProdutoOP);

        venderProdutoOP.setText("Marcar como Vendido");
        popUpMenu.add(venderProdutoOP);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        panel.setBackground(new java.awt.Color(204, 204, 204));

        tblProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
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
                        .addComponent(scrollPane)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                        .addComponent(btnPesquisar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNomeProduto))
                        .addGap(18, 180, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                .addComponent(lblFornecedor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCategoriaProduto)
                                .addGap(94, 94, 94))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                .addComponent(cbxFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbxCategoriaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34))))))
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
                    .addComponent(cbxCategoriaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(btnPesquisar)
                .addGap(18, 18, 18)
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
    
    private void popularTabela() {
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
    private javax.swing.JMenuItem excluirProduto;
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
