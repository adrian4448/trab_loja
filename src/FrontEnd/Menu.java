package FrontEnd;

import FrontEnd.Cadastros.CadastroFuncionario;
import FrontEnd.Cadastros.CadastroFornecedor;
import FrontEnd.Cadastros.CadastroCategoria;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imageIcon = new javax.swing.JLabel();
        menuBarPrincipal = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        cadastroCategoriaOP = new javax.swing.JMenuItem();
        cadastroFornecedorOP = new javax.swing.JMenuItem();
        cadastroFuncionarioOP = new javax.swing.JMenuItem();
        cadastroProdutoOP = new javax.swing.JMenuItem();
        menuEstoque = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imageIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FrontEnd/fotos/PainelLoja.jpg"))); // NOI18N
        getContentPane().add(imageIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, -1));

        menuCadastro.setText("Cadastro");

        cadastroCategoriaOP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FrontEnd/imagens/icons/lista.png"))); // NOI18N
        cadastroCategoriaOP.setText("Categoria");
        cadastroCategoriaOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirCadastroCategoria(evt);
            }
        });
        menuCadastro.add(cadastroCategoriaOP);

        cadastroFornecedorOP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FrontEnd/imagens/icons/cliente-icon.png"))); // NOI18N
        cadastroFornecedorOP.setText("Fornecedor");
        cadastroFornecedorOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirCadastroFornecedor(evt);
            }
        });
        menuCadastro.add(cadastroFornecedorOP);

        cadastroFuncionarioOP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FrontEnd/imagens/icons/usuario-icon.png"))); // NOI18N
        cadastroFuncionarioOP.setText("Funcionario");
        cadastroFuncionarioOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirCadastroFuncionario(evt);
            }
        });
        menuCadastro.add(cadastroFuncionarioOP);

        cadastroProdutoOP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FrontEnd/imagens/icons/caixa (1).png"))); // NOI18N
        cadastroProdutoOP.setText("Produto");
        menuCadastro.add(cadastroProdutoOP);

        menuBarPrincipal.add(menuCadastro);

        menuEstoque.setText("Estoque");
        menuBarPrincipal.add(menuEstoque);

        setJMenuBar(menuBarPrincipal);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void abrirCadastroFuncionario(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirCadastroFuncionario
        CadastroFuncionario cadastroFuncionarioForm = new CadastroFuncionario();
        cadastroFuncionarioForm.setVisible(true);
    }//GEN-LAST:event_abrirCadastroFuncionario

    private void abrirCadastroCategoria(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirCadastroCategoria
        CadastroCategoria cadastroCategoriaForm = new CadastroCategoria();
        cadastroCategoriaForm.setVisible(true);
    }//GEN-LAST:event_abrirCadastroCategoria

    private void abrirCadastroFornecedor(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirCadastroFornecedor
        CadastroFornecedor cadastroFornecedorForm = new CadastroFornecedor();
        cadastroFornecedorForm.setVisible(true);
    }//GEN-LAST:event_abrirCadastroFornecedor

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cadastroCategoriaOP;
    private javax.swing.JMenuItem cadastroFornecedorOP;
    private javax.swing.JMenuItem cadastroFuncionarioOP;
    private javax.swing.JMenuItem cadastroProdutoOP;
    private javax.swing.JLabel imageIcon;
    private javax.swing.JMenuBar menuBarPrincipal;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenu menuEstoque;
    // End of variables declaration//GEN-END:variables
}
