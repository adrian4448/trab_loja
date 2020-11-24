package BackEnd.DaoImplementation;

import BackEnd.DaoInterface.FornecedorDao;
import BackEnd.Entities.Fornecedor;
import Utils.DataManipulation.DataManipulationImplements;
import Utils.Select.SelectImplements;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class FornecedorJDBC implements FornecedorDao {
    
    SelectImplements selectUtils = new SelectImplements();
    DataManipulationImplements dataManipulationUtils = new DataManipulationImplements();
    
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluirFornecedor(Fornecedor fornecedor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
