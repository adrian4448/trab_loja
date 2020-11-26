package BackEnd.DaoFactory;

import BackEnd.DaoImplementation.CategoriaJDBC;
import BackEnd.DaoImplementation.FornecedorJDBC;
import BackEnd.DaoImplementation.FuncionarioJDBC;
import BackEnd.DaoImplementation.ProdutoVendaJDBC;

public class DaoFactory {
    
    public static FuncionarioJDBC createFuncionarioDao() {
        return new FuncionarioJDBC();
    }           
    
    public static CategoriaJDBC createCategoriaDao() {
        return new CategoriaJDBC();
    }
    
    public static FornecedorJDBC createFornecedorDao() {
        return new FornecedorJDBC();
    }
    
    public static ProdutoVendaJDBC createProdutoVendaDao() {
        return new ProdutoVendaJDBC();
    }
}
