package FrontEnd.Cadastros;

import BackEnd.DaoFactory.DaoFactory;
import BackEnd.DaoInterface.CategoriaDao;
import BackEnd.DaoInterface.FornecedorDao;
import BackEnd.DaoInterface.ProdutoVendaDao;
import BackEnd.Entities.Categoria;
import BackEnd.Entities.Fornecedor;
import BackEnd.Entities.ProdutoVenda;
import FrontEnd.Utils.MethodUtils;
import javax.swing.JOptionPane;

public class CadastroProduto extends javax.swing.JFrame {

    public CadastroProduto() {
        initComponents();
        methodUtils.popularComboBox(cbxCategoria,cbxFornecedor);
    }
    
    CategoriaDao categoriaDao = DaoFactory.createCategoriaDao();
    ProdutoVendaDao produtoDao = DaoFactory.createProdutoVendaDao();
    FornecedorDao fornecedorDao = DaoFactory.createFornecedorDao();
    MethodUtils methodUtils = new MethodUtils();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblDescricao = new javax.swing.JLabel();
        lblPreco = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        lblFornecedor = new javax.swing.JLabel();
        cbxCategoria = new javax.swing.JComboBox<>();
        lblCategoria = new javax.swing.JLabel();
        cbxFornecedor = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        panel.setBackground(new java.awt.Color(204, 204, 204));

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Cadastro de Produto");
        lblTitulo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblDescricao.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        lblDescricao.setText("Descrição Produto:");

        lblPreco.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        lblPreco.setText("Preço Produto:");

        btnSalvar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarProduto(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarProcesso(evt);
            }
        });

        lblFornecedor.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        lblFornecedor.setText("Fornecedor Produto:");

        lblCategoria.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        lblCategoria.setText("Categoria Produto:");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar))
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelLayout.createSequentialGroup()
                            .addComponent(lblDescricao)
                            .addGap(18, 18, 18)
                            .addComponent(txtNome))
                        .addGroup(panelLayout.createSequentialGroup()
                            .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(panelLayout.createSequentialGroup()
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblPreco)
                                .addComponent(lblFornecedor)
                                .addComponent(lblCategoria))
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cbxFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addGap(9, 9, 9)
                                    .addComponent(txtPreco))))))
                .addGap(35, 35, 35))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescricao)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPreco)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCategoria))
                .addGap(22, 22, 22)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFornecedor)
                    .addComponent(cbxFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarProcesso(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarProcesso
        this.dispose();
    }//GEN-LAST:event_cancelarProcesso

    private void cadastrarProduto(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarProduto
        Categoria categoria = categoriaDao.findCategoriaByName(cbxCategoria.getSelectedItem().toString());
        Fornecedor fornecedor = fornecedorDao.findFornecedorByNome(cbxFornecedor.getSelectedItem().toString());
        ProdutoVenda produto = new ProdutoVenda();
        produto.setDescProduto(txtNome.getText());
        produto.setPrecoProduto(Double.parseDouble(txtPreco.getText()));
        produto.setCategoria(categoria);
        produto.setFornecedor(fornecedor);
        
        produtoDao.cadastrarProduto(produto);
        JOptionPane.showMessageDialog(null, "Produto cadastado com sucesso !");
    }//GEN-LAST:event_cadastrarProduto

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroProduto().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbxCategoria;
    private javax.swing.JComboBox<String> cbxFornecedor;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblFornecedor;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}
