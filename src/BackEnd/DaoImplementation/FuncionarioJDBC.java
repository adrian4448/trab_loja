package BackEnd.DaoImplementation;

import BackEnd.DaoInterface.FuncionarioDao;
import BackEnd.Entities.Funcionario;
import Utils.Select.SelectImplements;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class FuncionarioJDBC implements FuncionarioDao {
    
    SelectImplements selectUtils = new SelectImplements();
    
    
    @Override
    public void cadastrarFuncionario(Funcionario funcionario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualizarDadosFuncionario(Funcionario funcionario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void inativarFuncionario(Funcionario funcionario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Funcionario findFuncionario(HashMap<String, Object> param) {
        ResultSet rs = null;
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
    
    public Funcionario constructFuncionario(ResultSet rs) throws SQLException{
        Funcionario funcionario = new Funcionario();
        funcionario.setNomeFuncionario(rs.getString("NOME_FUNCIONARIO"));
        funcionario.setDataNascimento(rs.getDate("DATA_NASCIMENTO").toInstant().atZone(ZoneId.systemDefault() ).toLocalDate());
        funcionario.setCpfFuncionario(rs.getString("CPF_FUNCIONARIO"));
        funcionario.setLoginFuncionario(rs.getString("LOGIN_FUNCIONARIO"));
        funcionario.setSenhaFuncionario(rs.getString("SENHA_FUNCIONARIO"));
        
        return funcionario;
    }
}
