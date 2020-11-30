package BackEnd.DaoInterface;

import BackEnd.Entities.Fornecedor;
import java.util.List;

public interface FornecedorDao {
    
    void cadastrarFornecedor(Fornecedor fornecedor);
    void atualizarFornecedor(Fornecedor fornecedor);
    void excluirFornecedor(Fornecedor fornecedor);
    Fornecedor findFornecedorByNome(String name);
    Fornecedor findFornecedorById(Integer idFornecedor);
    List<Fornecedor> getAllFornecedores();
    List<Fornecedor> getFornecedorByFilter(String nomeFornecedor);
}
