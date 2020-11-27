package BackEnd.DaoInterface;

import BackEnd.Entities.Categoria;
import java.util.List;

public interface CategoriaDao {
    
    void cadastrarCategoria(Categoria categoria);
    void excluirCategoria(Categoria categoria);
    Categoria findCategoriaByName(String name);
    Categoria findCategoriaById(Integer idCategoria);
    List<Categoria> getAllCategorias();

}
