package FrontEnd.Cadastros;

import BackEnd.DaoFactory.DaoFactory;
import BackEnd.DaoInterface.FornecedorDao;
import BackEnd.Entities.Fornecedor;
import javax.swing.JOptionPane;

public class CadastroFornecedor extends javax.swing.JFrame {

    public CadastroFornecedor() {
        initComponents();
    }
    
    FornecedorDao fornecedorDao = DaoFactory.createFornecedorDao();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panell = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        txtNomeFornecedor = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        btnCancelar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        panell.setBackground(new java.awt.Color(204, 204, 204));

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Cadastro de Fornecedor");
        lblTitulo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblNome.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        lblNome.setText("Nome:");

        lblTelefone.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        lblTelefone.setText("Telefone:");

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnCancelar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarProcesso(evt);
            }
        });

        btnCadastrar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        btnCadastrar.setText("Salvar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarFornecedor(evt);
            }
        });

        javax.swing.GroupLayout panellLayout = new javax.swing.GroupLayout(panell);
        panell.setLayout(panellLayout);
        panellLayout.setHorizontalGroup(
            panellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panellLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(panellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panellLayout.createSequentialGroup()
                        .addComponent(btnCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panellLayout.createSequentialGroup()
                            .addComponent(lblNome)
                            .addGap(37, 37, 37)
                            .addComponent(txtNomeFornecedor))
                        .addGroup(panellLayout.createSequentialGroup()
                            .addComponent(lblTelefone)
                            .addGap(18, 18, 18)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        panellLayout.setVerticalGroup(
            panellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panellLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(panellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(panellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnCadastrar))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panell, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panell, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarProcesso(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarProcesso
        this.hide();
    }//GEN-LAST:event_cancelarProcesso

    private void cadastrarFornecedor(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarFornecedor
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setNomeFornecedor(txtNomeFornecedor.getText());
        fornecedor.setTelefoneFornecedor(txtTelefone.getText());
        fornecedorDao.cadastrarFornecedor(fornecedor);
        JOptionPane.showMessageDialog(null, "Fornecedor cadastado com sucesso !");
    }//GEN-LAST:event_cadastrarFornecedor

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panell;
    private javax.swing.JTextField txtNomeFornecedor;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
