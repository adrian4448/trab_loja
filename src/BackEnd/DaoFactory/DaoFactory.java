package BackEnd.DaoFactory;

import BackEnd.DaoImplementation.CategoriaJDBC;
import BackEnd.DaoImplementation.FuncionarioJDBC;

public class DaoFactory {
    
    public static FuncionarioJDBC createFuncionarioDao() {
        return new FuncionarioJDBC();
    }           
    
    public static CategoriaJDBC createCategoriaDao() {
        return new CategoriaJDBC();
    }
}
