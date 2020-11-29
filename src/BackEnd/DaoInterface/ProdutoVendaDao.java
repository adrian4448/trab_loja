package BackEnd.DaoInterface;

import BackEnd.Entities.ProdutoVenda;
import java.util.List;

public interface ProdutoVendaDao {
    
    void cadastrarProduto(ProdutoVenda produto);
    void alterarProduto(ProdutoVenda produto);
    void devolverProduto(ProdutoVenda produto);
    void inativarProduto(ProdutoVenda produto);
    void venderProduto(ProdutoVenda produto);
    List<ProdutoVenda> getAllProducts();
    
}
