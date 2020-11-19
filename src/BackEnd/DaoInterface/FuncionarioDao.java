package BackEnd.DaoInterface;

import BackEnd.Entities.Funcionario;
import java.util.HashMap;

public interface FuncionarioDao {
    
    void cadastrarFuncionario(Funcionario funcionario);
    void atualizarDadosFuncionario(Funcionario funcionario);
    void inativarFuncionario(Funcionario funcionario);
    Funcionario findFuncionario(HashMap<String, Object> param);
    boolean funcionarioLogin(String login, String senha);
    
}
