package BackEnd.DaoImplementation;

import BackEnd.DaoInterface.FuncionarioDao;
import BackEnd.Entities.Funcionario;
import Utils.DataManipulation.DataManipulationImplements;
import Utils.Select.SelectImplements;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class FuncionarioJDBC implements FuncionarioDao {
    
    SelectImplements selectUtils = new SelectImplements();
    DataManipulationImplements dataManipulationUtils = new DataManipulationImplements();
    
    @Override
    public void cadastrarFuncionario(Funcionario funcionario) {
        HashMap<String, Object> params = new HashMap<>();
        params.put("NOME_FUNCIONARIO", funcionario.getNomeFuncionario());
        params.put("DATA_NASCIMENTO", funcionario.getDataNascimento());
        params.put("CPF_FUNCIONARIO", funcionario.getCpfFuncionario());
        params.put("LOGIN_FUNCIONARIO", funcionario.getLoginFuncionario());
        params.put("SENHA_FUNCIONARIO", funcionario.getSenhaFuncionario());
        params.put("FUNCIONARIO_ATIVO", 1);
        try {
            dataManipulationUtils.insertInto(params, "tbl_funcionario");
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @Override
    public void atualizarDadosFuncionario(Funcionario funcionario) {
        HashMap<String, Object> params = new HashMap<>();
        params.put("ID_FIND", funcionario.getIdFuncionario());
        params.put("NOME_FUNCIONARIO", funcionario.getNomeFuncionario());
        params.put("DATA_NASCIMENTO", funcionario.getDataNascimento());
        params.put("CPF_FUNCIONARIO", funcionario.getCpfFuncionario());
        params.put("LOGIN_FUNCIONARIO", funcionario.getLoginFuncionario());
        params.put("SENHA_FUNCIONARIO", funcionario.getSenhaFuncionario());
        params.put("FUNCIONARIO_ATIVO", 1);
        try {
            dataManipulationUtils.updateById(params, "tbl_funcionario");
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @Override
    public void inativarFuncionario(Funcionario funcionario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Funcionario findFuncionarioByLogin(String login) {
        ResultSet rs = null;
        HashMap<String, Object> param = new HashMap<>();
        param.put("LOGIN_FUNCIONARIO", login);
        try {
            rs = selectUtils.findByFieldName(param, "tbl_funcionario");
            while(rs.next()) {
                return constructFuncionario(rs);
            }
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return null;
    }

    @Override
    public boolean funcionarioLogin(String login, String senha) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            rs = selectUtils.findAll("tbl_funcionario");         
            while(rs.next()) {
                if(rs.getString("LOGIN_FUNCIONARIO").equals(login) && rs.getString("SENHA_FUNCIONARIO").equals(senha)) {
                    return true;
                }
            }
        }catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return false;
    }
    
    @Override
    public Funcionario findFuncionarioById(Integer id) {
        ResultSet rs = null;
        HashMap<String, Object> param = new HashMap<>();
        param.put("ID_FUNCIONARIO", id);
        try {
            rs = selectUtils.findByFieldName(param, "tbl_funcionario");
            while(rs.next()) {
                return constructFuncionario(rs);
            }
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return null;
    }
    
    public Funcionario constructFuncionario(ResultSet rs) throws SQLException{
        Funcionario funcionario = new Funcionario();
        funcionario.setIdFuncionario(rs.getInt("ID_FUNCIONARIO"));
        funcionario.setNomeFuncionario(rs.getString("NOME_FUNCIONARIO"));
        funcionario.setCpfFuncionario(rs.getString("CPF_FUNCIONARIO"));
        funcionario.setLoginFuncionario(rs.getString("LOGIN_FUNCIONARIO"));
        funcionario.setSenhaFuncionario(rs.getString("SENHA_FUNCIONARIO"));
        
        return funcionario;
    }
}
