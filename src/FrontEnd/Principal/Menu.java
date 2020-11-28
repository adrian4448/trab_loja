package FrontEnd.Principal;

import FrontEnd.Cadastros.CadastroFuncionario;
import FrontEnd.Cadastros.CadastroFornecedor;
import FrontEnd.Cadastros.CadastroCategoria;
import FrontEnd.Cadastros.CadastroProduto;
import FrontEnd.Visualizar.VisualizarCategorias;
import FrontEnd.Visualizar.VisualizarFornecedores;
import FrontEnd.Visualizar.VisualizarProdutos;

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
        menuVisualizar = new javax.swing.JMenu();
        visualizarCategoriasOP = new javax.swing.JMenuItem();
        visualizarFornecedorOP = new javax.swing.JMenuItem();
        visualizarProdutoOP = new javax.swing.JMenuItem();
        visualizarPerfilOP = new javax.swing.JMenuItem();

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
                cadastrarCategoria(evt);
            }
        });
        menuCadastro.add(cadastroCategoriaOP);

        cadastroFornecedorOP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FrontEnd/imagens/icons/cliente-icon.png"))); // NOI18N
        cadastroFornecedorOP.setText("Fornecedor");
        cadastroFornecedorOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarFornecedor(evt);
            }
        });
        menuCadastro.add(cadastroFornecedorOP);

        cadastroFuncionarioOP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FrontEnd/imagens/icons/usuario-icon.png"))); // NOI18N
        cadastroFuncionarioOP.setText("Funcionario");
        cadastroFuncionarioOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarFuncionario(evt);
            }
        });
        menuCadastro.add(cadastroFuncionarioOP);

        cadastroProdutoOP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FrontEnd/imagens/icons/caixa (1).png"))); // NOI18N
        cadastroProdutoOP.setText("Produto");
        cadastroProdutoOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarProduto(evt);
            }
        });
        menuCadastro.add(cadastroProdutoOP);

        menuBarPrincipal.add(menuCadastro);

        menuVisualizar.setText("Visualizar ");

        visualizarCategoriasOP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FrontEnd/imagens/icons/lista.png"))); // NOI18N
        visualizarCategoriasOP.setText("Categorias");
        visualizarCategoriasOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarCategorias(evt);
            }
        });
        menuVisualizar.add(visualizarCategoriasOP);

        visualizarFornecedorOP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FrontEnd/imagens/icons/cliente-icon.png"))); // NOI18N
        visualizarFornecedorOP.setText("Fornecedor");
        visualizarFornecedorOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarFornecedores(evt);
            }
        });
        menuVisualizar.add(visualizarFornecedorOP);

        visualizarProdutoOP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FrontEnd/imagens/icons/caixa (1).png"))); // NOI18N
        visualizarProdutoOP.setText("Produto");
        visualizarProdutoOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarProdutos(evt);
            }
        });
        menuVisualizar.add(visualizarProdutoOP);

        visualizarPerfilOP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FrontEnd/imagens/icons/usuario-icon.png"))); // NOI18N
        visualizarPerfilOP.setText("Perfil");
        menuVisualizar.add(visualizarPerfilOP);

        menuBarPrincipal.add(menuVisualizar);

        setJMenuBar(menuBarPrincipal);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarCategoria(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarCategoria
        CadastroCategoria cadastroCategoriaForm = new CadastroCategoria();
        cadastroCategoriaForm.setVisible(true);
    }//GEN-LAST:event_cadastrarCategoria

    private void cadastrarFornecedor(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarFornecedor
        CadastroFornecedor cadastroFornecedorForm = new CadastroFornecedor();
        cadastroFornecedorForm.setVisible(true);
    }//GEN-LAST:event_cadastrarFornecedor

    private void cadastrarFuncionario(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarFuncionario
        CadastroFuncionario cadastroFuncionarioForm = new CadastroFuncionario();
        cadastroFuncionarioForm.setVisible(true);
    }//GEN-LAST:event_cadastrarFuncionario

    private void visualizarCategorias(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizarCategorias
        VisualizarCategorias visualizarCategoriasForm = new VisualizarCategorias();
        visualizarCategoriasForm.setVisible(true);
    }//GEN-LAST:event_visualizarCategorias

    private void visualizarFornecedores(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizarFornecedores
        VisualizarFornecedores visualizarFornecedoresForm = new VisualizarFornecedores();
        visualizarFornecedoresForm.setVisible(true);
    }//GEN-LAST:event_visualizarFornecedores

    private void cadastrarProduto(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarProduto
        CadastroProduto cadastroProdutoForm = new CadastroProduto();
        cadastroProdutoForm.setVisible(true);
    }//GEN-LAST:event_cadastrarProduto

    private void visualizarProdutos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizarProdutos
        VisualizarProdutos visualizarProdutosForm = new VisualizarProdutos();
        visualizarProdutosForm.setVisible(true);
    }//GEN-LAST:event_visualizarProdutos

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
    private javax.swing.JMenu menuVisualizar;
    private javax.swing.JMenuItem visualizarCategoriasOP;
    private javax.swing.JMenuItem visualizarFornecedorOP;
    private javax.swing.JMenuItem visualizarPerfilOP;
    private javax.swing.JMenuItem visualizarProdutoOP;
    // End of variables declaration//GEN-END:variables
}
