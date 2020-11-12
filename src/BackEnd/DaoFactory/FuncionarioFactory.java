package BackEnd.DaoFactory;

import BackEnd.DaoImplementation.FuncionarioJDBC;

public class FuncionarioFactory {
    
    public FuncionarioJDBC CreateDao() {
        return new FuncionarioJDBC();
    }           
}
