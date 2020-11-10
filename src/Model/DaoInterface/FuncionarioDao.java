package Model.DaoInterface;

import Model.Entities.Funcionario;
import java.util.List;

public interface FuncionarioDao {
    
    Funcionario findFuncionarioById(Integer id);
    Funcionario findFuncionarioByName(String nome);    
    List<Funcionario> findAllFuncionarios();    
    void addFuncionario(Funcionario funcionario);
    void deleteFuncionarioById(Integer id);
    void updateFuncionario(Funcionario funcionario);
}
