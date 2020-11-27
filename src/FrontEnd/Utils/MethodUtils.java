package FrontEnd.Utils;

import BackEnd.DaoFactory.DaoFactory;
import BackEnd.DaoInterface.CategoriaDao;
import BackEnd.DaoInterface.FornecedorDao;
import BackEnd.DaoInterface.ProdutoVendaDao;
import BackEnd.Entities.Categoria;
import BackEnd.Entities.Fornecedor;
import javax.swing.JComboBox;

public class MethodUtils {
    
    CategoriaDao categoriaDao = DaoFactory.createCategoriaDao();
    ProdutoVendaDao produtoDao = DaoFactory.createProdutoVendaDao();
    FornecedorDao fornecedorDao = DaoFactory.createFornecedorDao();
    
    public void popularComboBox(JComboBox<String> cbxCategoria,JComboBox<String> cbxFornecedor) {
        for(Categoria categoria : categoriaDao.getAllCategorias()) {
            cbxCategoria.addItem(categoria.getDescCategoria());
        }
        
        for(Fornecedor fornecedor : fornecedorDao.getAllFornecedores()) {
            cbxFornecedor.addItem(fornecedor.getNomeFornecedor());
        }
    }
    
}
