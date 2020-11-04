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
import Utils.Delete.DeleteImplements;
import Connection.DB;
import java.util.HashMap;

public class FuncionarioJDBC implements FuncionarioDao{
    
    private Connection con = DB.getConnection();
    
    @Override
    public Funcionario findFuncionarioById(Integer id) { 
        ResultSet rs = null;
        SelectImplements lib = new SelectImplements();
        HashMap<String,Object> params = new HashMap<String, Object>();
        try {
            params.put("NOME_ATRIBUTO", "ID_FUNCIONARIO");
            params.put("VALOR_ATRIBUTO", id);
            
            rs = lib.findByFieldName(params, "Funcionarios");
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
       
    @Override
    public void deleteFuncionarioById(Integer id) {
        try {
            DeleteImplements lib = new DeleteImplements();
            lib.deleteById(id, "Funcionarios"); 
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println(e.getStackTrace());
        }
    }

    @Override
    public Funcionario findFuncionarioByName(String nome) {
        ResultSet rs = null;
        HashMap<String,Object> params = new HashMap<String, Object>();
        SelectImplements lib = new SelectImplements();
        Funcionario funcionario = new Funcionario();
        try { 
            params.put("NOME_ATRIBUTO", "NOME_FUNCIONARIO");
            params.put("VALOR_ATRIBUTO", nome);
            
            rs = lib.findByFieldName(params, "Funcionarios");
            
            while(rs.next()) {
                funcionario = createFuncionario(rs);
            }
        }catch(Exception e) {
           JOptionPane.showMessageDialog(null, e.getMessage());
           System.out.println(e.getStackTrace()); 
        }
        return funcionario;
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
}
