package BackEnd.DaoImplementation;

import BackEnd.DaoInterface.ProdutoVendaDao;
import BackEnd.Entities.ProdutoVenda;
import Utils.DataManipulation.DataManipulationImplements;
import Utils.Delete.DeleteImplements;
import Utils.Select.SelectImplements;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class ProdutoVendaJDBC implements ProdutoVendaDao {
    
    SelectImplements selectUtils = new SelectImplements();
    DataManipulationImplements dataManipulationUtils = new DataManipulationImplements();
    DeleteImplements deleteUtils = new DeleteImplements();
    
    @Override
    public void cadastrarProduto(ProdutoVenda produto) {
        HashMap<String,Object> params = new HashMap<>();
        params.put("DESC_PRODUTO", produto.getDescProduto());
        params.put("PRECO_PRODUTO", produto.getPrecoProduto());
        params.put("ID_CATEGORIA", produto.getCategoria().getIdCategoria());
        params.put("ID_FORNECEDOR", produto.getFornecedor().getIdFornecedor());
        try {
            dataManipulationUtils.insertInto(params, "tbl_produtoVenda");
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @Override
    public ProdutoVenda findProduto(HashMap<String, Object> param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void adicionarProdutoEstoque(ProdutoVenda produto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void devolverProduto(ProdutoVenda produto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
