package Connection;

import Model.DaoImplementation.FuncionarioJDBC;
import Model.Entities.Funcionario;

public class TestDB {
    
    public static void main(String[] args) {
      DB conection = new DB();
      FuncionarioJDBC funcDao = new FuncionarioJDBC();
      
      for(Funcionario f : funcDao.findAllFuncionarios()) {
          System.out.println(f.getLoginFuncionario());
      }
      
        System.out.println(funcDao.findFuncionarioById(1).getSenhaFuncionario());
      
      conection.getConnection();
    }
}
