package Model.DaoInterface;

import Model.Entities.Funcionario;
import java.util.List;

public interface FuncionarioDao {
    
    Funcionario findFuncionarioById(Integer id);
    
    List<Funcionario> findAllFuncionarios();    
    
    void deleteFuncionarioById(Integer id);
    
}
