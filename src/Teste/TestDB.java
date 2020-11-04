package Teste;

import Connection.DB;
import Model.DaoFactory.FuncionarioFactory;
import Model.DaoImplementation.FuncionarioJDBC;
import Model.Entities.Funcionario;

public class TestDB {
    
    public static void main(String[] args) {
      DB conection = new DB();
      FuncionarioJDBC funcDao = new FuncionarioFactory().CreateDao();
      
      for(Funcionario f : funcDao.findAllFuncionarios()) {
          System.out.println(f.getLoginFuncionario());
      }
      
      System.out.println(funcDao.findFuncionarioById(1).getSenhaFuncionario());
      
      conection.getConnection();
    }
}
