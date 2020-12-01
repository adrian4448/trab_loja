package BackEnd.DaoImplementation;

import BackEnd.DaoFactory.DaoFactory;
import BackEnd.DaoInterface.CategoriaDao;
import BackEnd.DaoInterface.FornecedorDao;
import BackEnd.DaoInterface.ProdutoVendaDao;
import BackEnd.Entities.ProdutoVenda;
import BackEnd.Entities.StatusProduto;
import Utils.DataManipulation.DataManipulationImplements;
import Utils.Delete.DeleteImplements;
import Utils.Select.SelectImplements;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;

public class ProdutoVendaJDBC implements ProdutoVendaDao {
    
    SelectImplements selectUtils = new SelectImplements();
    DataManipulationImplements dataManipulationUtils = new DataManipulationImplements();
    DeleteImplements deleteUtils = new DeleteImplements();
    
    //Para construir os objetos
    CategoriaDao categoriaDao = DaoFactory.createCategoriaDao();
    FornecedorDao fornecedorDao = DaoFactory.createFornecedorDao();
    
    @Override
    public void cadastrarProduto(ProdutoVenda produto) {
        HashMap<String,Object> params = new HashMap<>();
        params.put("DESC_PRODUTO", produto.getDescProduto());
        params.put("PRECO_PRODUTO", produto.getPrecoProduto());
        params.put("ID_CATEGORIA", produto.getCategoria().getIdCategoria());
        params.put("ID_FORNECEDOR", produto.getFornecedor().getIdFornecedor());
        params.put("STATUS_PRODUTO", StatusProduto.ATIVO.getValorStatusProduto());
        try {
            dataManipulationUtils.insertInto(params, "tbl_produtoVenda");
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @Override
    public List<ProdutoVenda> getAllProducts() {
        ResultSet rs = null;
        List<ProdutoVenda> produtos = new ArrayList<>();
        try {
            rs = selectUtils.findAll("tbl_produtoVenda");
            while(rs.next()) {
                produtos.add(construirProduto(rs));
            }
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return produtos;
    }
    
    @Override
    public void devolverProduto(ProdutoVenda produto) {
        HashMap<String,Object> params = new HashMap<>();
        params.put("ID_FIND", produto.getIdProduto());
        params.put("STATUS_PRODUTO", StatusProduto.DEVOLVIDO.getValorStatusProduto());
        try {
            dataManipulationUtils.updateById(params, "tbl_produtoVenda");
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    @Override
    public void venderProduto(ProdutoVenda produto) {
        HashMap<String,Object> params = new HashMap<>();
        params.put("ID_FIND", produto.getIdProduto());
        params.put("STATUS_PRODUTO", StatusProduto.VENDIDO.getValorStatusProduto());
        try {
            dataManipulationUtils.updateById(params, "tbl_produtoVenda");
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    @Override
    public void alterarProduto(ProdutoVenda produto) {
        HashMap<String,Object> params = new HashMap<>();
        params.put("ID_FIND", produto.getIdProduto());
        params.put("DESC_PRODUTO", produto.getDescProduto());
        params.put("PRECO_PRODUTO", produto.getPrecoProduto());
        params.put("ID_CATEGORIA", produto.getCategoria().getIdCategoria());
        params.put("ID_FORNECEDOR", produto.getFornecedor().getIdFornecedor());
        try {
            dataManipulationUtils.updateById(params, "tbl_produtoVenda");
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    @Override
    public void inativarProduto(ProdutoVenda produto) {
         HashMap<String,Object> params = new HashMap<>();
        params.put("ID_FIND", produto.getIdProduto());
        params.put("STATUS_PRODUTO", StatusProduto.INATIVO.getValorStatusProduto());
        try {
            dataManipulationUtils.updateById(params, "tbl_produtoVenda");
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    @Override
    public List<ProdutoVenda> produtosWithFilter(HashMap<String, Object> params) {
        ResultSet rs = null;
        StringBuilder sqlWhere = new StringBuilder();
        List<ProdutoVenda> produtos = new ArrayList<>();
        params.forEach((key,value) -> {
            if(key.equals("DESC_PRODUTO")) {
               sqlWhere.append(key).append(" LIKE '%").append(value).append("%'");
            }else {
               sqlWhere.append(key).append(" = '").append(value).append("'");
            }
            sqlWhere.append(" AND ");
        });
        sqlWhere.delete(sqlWhere.length() - 4, sqlWhere.length());
        try {
            rs = selectUtils.selectWithWhere(sqlWhere, "tbl_produtoVenda");
            while(rs.next()) {
                produtos.add(construirProduto(rs));
            }
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return produtos;
    }
    
    private ProdutoVenda construirProduto(ResultSet rs) throws SQLException{
        ProdutoVenda produto = new ProdutoVenda();
        produto.setIdProduto(rs.getInt("ID_PRODUTO"));
        produto.setPrecoProduto(rs.getDouble("PRECO_PRODUTO"));
        produto.setDescProduto(rs.getString("DESC_PRODUTO"));
        produto.setFornecedor(fornecedorDao.findFornecedorById(rs.getInt("ID_FORNECEDOR")));
        produto.setCategoria(categoriaDao.findCategoriaById(rs.getInt("ID_CATEGORIA")));
        produto.setStatusProduto(StatusProduto.values()[rs.getInt("STATUS_PRODUTO") - 1]);     
        return produto;
    }
}
