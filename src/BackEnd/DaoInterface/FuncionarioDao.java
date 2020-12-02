package BackEnd.DaoInterface;

import BackEnd.Entities.Funcionario;

public interface FuncionarioDao {
    
    void cadastrarFuncionario(Funcionario funcionario);
    void atualizarDadosFuncionario(Funcionario funcionario);
    void inativarFuncionario(Funcionario funcionario);
    Funcionario findFuncionarioByLogin(String login);
    Funcionario findFuncionarioById(Integer id);
    boolean funcionarioLogin(String login, String senha);
    
}
