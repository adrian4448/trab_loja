package BackEnd.DaoInterface;

import BackEnd.Entities.ProdutoVenda;
import java.util.HashMap;
import java.util.List;

public interface ProdutoVendaDao {
    
    void cadastrarProduto(ProdutoVenda produto);
    void adicionarProdutoEstoque(ProdutoVenda produto);
    void devolverProduto(ProdutoVenda produto);
    ProdutoVenda findProduto(HashMap<String, Object> param);
    List<ProdutoVenda> getAllProducts();
    
}
