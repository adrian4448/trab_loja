package BackEnd.DaoInterface;

import BackEnd.Entities.Fornecedor;

public interface FornecedorDao {
    
    void cadastrarFornecedor(Fornecedor fornecedor);
    void atualizarFornecedor(Fornecedor fornecedor);
    void excluirFornecedor(Fornecedor fornecedor);
    
}
