package BackEnd.DaoInterface;

import BackEnd.Entities.Fornecedor;
import java.util.List;

public interface FornecedorDao {
    
    void cadastrarFornecedor(Fornecedor fornecedor);
    void atualizarFornecedor(Fornecedor fornecedor);
    void excluirFornecedor(Fornecedor fornecedor);
    List<Fornecedor> getAllFornecedores();
}
