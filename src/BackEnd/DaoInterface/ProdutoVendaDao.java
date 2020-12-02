package BackEnd.DaoInterface;

import BackEnd.Entities.ProdutoVenda;
import java.util.HashMap;
import java.util.List;

public interface ProdutoVendaDao {
    
    void cadastrarProduto(ProdutoVenda produto);
    void alterarProduto(ProdutoVenda produto);
    void devolverProduto(ProdutoVenda produto);
    void inativarProduto(ProdutoVenda produto);
    void venderProduto(ProdutoVenda produto);
    ProdutoVenda findProdutoById(Integer id);
    List<ProdutoVenda> getAllProducts();
    List<ProdutoVenda> produtosWithFilter(HashMap<String, Object> params);
}
