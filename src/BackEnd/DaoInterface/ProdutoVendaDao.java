package BackEnd.DaoInterface;

import BackEnd.Entities.ProdutoVenda;
import java.util.HashMap;
import java.util.List;

public interface ProdutoVendaDao {
    
    void cadastrarProduto(ProdutoVenda produto);
    void alterarProduto(ProdutoVenda produto);
    void devolverProduto(ProdutoVenda produto);
    void venderProduto(ProdutoVenda produto);
    ProdutoVenda findProduto(HashMap<String, Object> param);
    List<ProdutoVenda> getAllProducts();
    
}
