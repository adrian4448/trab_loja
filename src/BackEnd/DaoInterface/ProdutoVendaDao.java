package BackEnd.DaoInterface;

import BackEnd.Entities.ProdutoVenda;
import java.util.HashMap;

public interface ProdutoVendaDao {
    
    void cadastrarProduto(ProdutoVenda produto);
    ProdutoVenda findProduto(HashMap<String, Object> param);
    void adicionarProdutoEstoque(ProdutoVenda produto);
    void devolverProduto(ProdutoVenda produto);
    
}
