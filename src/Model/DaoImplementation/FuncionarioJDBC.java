package Model.DaoImplementation;

import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;
import java.sql.ResultSet;
import Model.DaoInterface.FuncionarioDao;
import Model.Entities.Funcionario;
import java.sql.Connection;
import java.sql.SQLException;
import Utils.Select.SelectImplements;
import Connection.DB;

public class FuncionarioJDBC implements FuncionarioDao{
    
    private Connection con = DB.getConnection();
    
    @Override
    public Funcionario findFuncionarioById(Integer id) { 
        try {
            SelectImplements lib = new SelectImplements();
            ResultSet rs = lib.findById("Funcionarios", id);
            while(rs.next()) {
                return createFuncionario(rs);
            }
        }catch(Exception e) {
            e.getMessage();
        }
        return null;
    }

    @Override
    public List<Funcionario> findAllFuncionarios() {
        List<Funcionario> funcionarios = new ArrayList<Funcionario>();
        SelectImplements lib = new SelectImplements();
        try {
            ResultSet rs = lib.findAll("Funcionarios");
            
            while(rs.next()) {
                Funcionario funcionario = createFuncionario(rs);
                funcionarios.add(funcionario);
            }
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }       
        return funcionarios; 
    }
    
    protected Funcionario createFuncionario(ResultSet rs) {
        Funcionario funcionario = new Funcionario();
        try {
            funcionario.setNomeFuncionario(rs.getString("NOME_FUNCIONARIO"));
            funcionario.setLoginFuncionario(rs.getString("LOGIN_FUNCIONARIO"));
            funcionario.setSenhaFuncionario(rs.getString("SENHA_FUNCIONARIO"));
        }catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }  
        return funcionario;
    }   

    @Override
    public void deleteFuncionarioById(Integer id) {
        
    }
}
