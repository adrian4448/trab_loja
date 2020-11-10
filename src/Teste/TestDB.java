package Teste;

import Connection.DB;
import Model.DaoFactory.FuncionarioFactory;
import Model.DaoImplementation.FuncionarioJDBC;
import Model.Entities.Funcionario;

public class TestDB {
    
    public static void main(String[] args) {
      DB conection = new DB();
      FuncionarioJDBC funcDao = new FuncionarioFactory().CreateDao();
      Funcionario funcionarioUpdate = new Funcionario("adrian teste", "adrian teste", "adrian teste");
      funcionarioUpdate.setIdFuncionario(3);
      
      
      funcDao.addFuncionario(new Funcionario("adrian teste 01", "adrian teste 01", "adrian teste 01"));
      funcDao.updateFuncionario(funcionarioUpdate);
    }
}
