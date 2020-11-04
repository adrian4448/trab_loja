package Model.DaoFactory;

import Model.DaoImplementation.FuncionarioJDBC;

public class FuncionarioFactory {
    
    public FuncionarioJDBC CreateDao() {
        return new FuncionarioJDBC();
    }           
}
