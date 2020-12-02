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
    
    public boolean validaCPF(String cpf) {
        Integer digito1 = Integer.parseInt(cpf.substring(0,1));
        Integer digito2 = Integer.parseInt(cpf.substring(1,2));
        Integer digito3 = Integer.parseInt(cpf.substring(2,3));
        Integer digito4 = Integer.parseInt(cpf.substring(4,5));
        Integer digito5 = Integer.parseInt(cpf.substring(5,6));
        Integer digito6 = Integer.parseInt(cpf.substring(6,7));
        Integer digito7 = Integer.parseInt(cpf.substring(8,9));
        Integer digito8 = Integer.parseInt(cpf.substring(9,10));
        Integer digito9 = Integer.parseInt(cpf.substring(10,11));
        Integer digito10 = Integer.parseInt(cpf.substring(12,13));
        Integer digito11 = Integer.parseInt(cpf.substring(13,14));
        
        if(digito1 == digito2 && digito2 == digito3 && digito3 == digito4 && digito4 == digito5 && digito5 == digito6 && digito6 == digito7 && digito7 == digito8 && digito8 == digito9 && digito9 == digito10 && digito10 == digito11) {
            return false;
        }
        
        int soma1 = ((digito1 * 10 + digito2 * 9 + digito3 * 8 + digito4 * 7 + digito5 * 6 + digito6 * 5 + digito7 * 4 + digito8 * 3 + digito9 * 2) * 10) % 11;
        
        if(soma1 == 10) {
            soma1 = 0;
        }
        
        int soma2 = ((digito1 * 11 + digito2 * 10 + digito3 * 9 + digito4 * 8 + digito5 * 7 + digito6 * 6 + digito7 * 5 + digito8 * 4 + digito9 * 3 + digito10 * 2) * 10) % 11;

        if(soma2 == 10) {
            soma2 = 0;
        }
        
        if(soma1 == digito10 && soma2 == digito11) {
            return true;
        }else {
            return false;
        }     
    }
    
}
