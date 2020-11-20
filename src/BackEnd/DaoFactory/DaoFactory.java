package BackEnd.DaoFactory;

import BackEnd.DaoImplementation.FuncionarioJDBC;

public class DaoFactory {
    
    public static FuncionarioJDBC createFuncionarioDao() {
        return new FuncionarioJDBC();
    }           
}
