package BackEnd.DaoImplementation;

import BackEnd.DaoInterface.FornecedorDao;
import BackEnd.Entities.Fornecedor;
import Connection.DB;
import Utils.DataManipulation.DataManipulationImplements;
import Utils.Delete.DeleteImplements;
import Utils.Select.SelectImplements;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;

public class FornecedorJDBC implements FornecedorDao {
    
    SelectImplements selectUtils = new SelectImplements();
    DataManipulationImplements dataManipulationUtils = new DataManipulationImplements();
    DeleteImplements deleteUtils = new DeleteImplements();
    
    @Override
    public void cadastrarFornecedor(Fornecedor fornecedor) {
        HashMap<String,Object> params = new HashMap<>();
        params.put("NOME_FORNECEDOR", fornecedor.getNomeFornecedor());
        params.put("TELEFONE_FORNECEDOR", fornecedor.getTelefoneFornecedor());        
        try {
            dataManipulationUtils.insertInto(params, "tbl_fornecedor");
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @Override
    public void atualizarFornecedor(Fornecedor fornecedor) {
        HashMap<String,Object> params = new HashMap<>();
        params.put("ID_FIND", fornecedor.getIdFornecedor());
        params.put("NOME_FORNECEDOR", fornecedor.getNomeFornecedor());
        params.put("TELEFONE_FORNECEDOR", fornecedor.getTelefoneFornecedor());   
        try {
            dataManipulationUtils.updateById(params, "tbl_fornecedor");
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @Override
    public void excluirFornecedor(Fornecedor fornecedor) {
        HashMap<String,Object> param = new HashMap<>();
        param.put("ID_FORNECEDOR", fornecedor.getIdFornecedor());
        try {
            deleteUtils.deleteByFieldName(param, "tbl_fornecedor");
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @Override
    public List<Fornecedor> getAllFornecedores() {
        ResultSet rs = null;
        List<Fornecedor> categoriasList = new ArrayList<>();
        try {
           rs = selectUtils.findAll("tbl_fornecedor");      
           while(rs.next()) {
               categoriasList.add(constructFornecedor(rs));
           }
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally {
            DB.closeResultSet(rs);
        }
        return categoriasList;
    }
    
    @Override
    public Fornecedor findFornecedorByNome(String name) {
        ResultSet rs = null;
        Fornecedor fornecedor = new Fornecedor();
        HashMap<String, Object> param = new HashMap<>();
        param.put("NOME_FORNECEDOR", name);
        try {
            rs = selectUtils.findByFieldName(param, "tbl_fornecedor");
            while(rs.next()) {
                fornecedor = constructFornecedor(rs);
            }
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return fornecedor;
    }
    
    @Override
    public Fornecedor findFornecedorById(Integer idFornecedor) {
        ResultSet rs = null;
        Fornecedor fornecedor = new Fornecedor();
        HashMap<String, Object> param = new HashMap<>();
        param.put("ID_FORNECEDOR", idFornecedor);
        try {
            rs = selectUtils.findByFieldName(param, "tbl_fornecedor");
            while(rs.next()) {
                fornecedor = constructFornecedor(rs);
            }
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return fornecedor;
    }
    
        public static Fornecedor constructFornecedor(ResultSet rs) throws SQLException {
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setIdFornecedor(rs.getInt("ID_FORNECEDOR"));
        fornecedor.setNomeFornecedor(rs.getString("NOME_FORNECEDOR"));
        fornecedor.setTelefoneFornecedor(rs.getString("TELEFONE_FORNECEDOR"));
        return fornecedor;
    }
}
