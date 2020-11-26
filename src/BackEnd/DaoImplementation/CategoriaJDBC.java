package BackEnd.DaoImplementation;

import static BackEnd.DaoImplementation.FornecedorJDBC.constructFornecedor;
import BackEnd.DaoInterface.CategoriaDao;
import BackEnd.Entities.Categoria;
import BackEnd.Entities.Fornecedor;
import Connection.DB;
import Utils.DataManipulation.DataManipulationImplements;
import Utils.Delete.DeleteImplements;
import Utils.Select.SelectImplements;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;

public class CategoriaJDBC implements CategoriaDao{
    
    SelectImplements selectUtils = new SelectImplements();
    DataManipulationImplements dataManipulationUtils = new DataManipulationImplements();
    DeleteImplements deleteUtils = new DeleteImplements();
    
    @Override
    public void cadastrarCategoria(Categoria categoria) {
        HashMap<String,Object> params = new HashMap<>();
        params.put("DESC_CATEGORIA", categoria.getDescCategoria());
        try {
            dataManipulationUtils.insertInto(params, "tbl_categoria");
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @Override
    public void excluirCategoria(Categoria categoria) {
        HashMap<String,Object> param = new HashMap<>();
        param.put("ID_CATEGORIA", categoria.getIdCategoria());
        try {
            deleteUtils.deleteByFieldName(param, "tbl_categoria");
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @Override
    public List<Categoria> getAllCategorias() {
        ResultSet rs = null;
        List<Categoria> categoriasList = new ArrayList<>();
        try {
           rs = selectUtils.findAll("tbl_categoria");      
           while(rs.next()) {
               categoriasList.add(constructCategoria(rs));
           }
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally {
            DB.closeResultSet(rs);
        }
        return categoriasList;
    }
    
    @Override
    public Categoria findCategoriaByName(String name) {
        ResultSet rs = null;
        Categoria categoria = new Categoria();
        HashMap<String, Object> param = new HashMap<>();
        param.put("DESC_CATEGORIA", name);
        try {
            rs = selectUtils.findByFieldName(param, "tbl_categoria");
            while(rs.next()) {
                categoria = constructCategoria(rs);
            }
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return categoria;
    }
    
    public Categoria constructCategoria(ResultSet rs) throws SQLException{
        Categoria categoria = new Categoria();
        categoria.setIdCategoria(rs.getInt("ID_CATEGORIA"));
        categoria.setDescCategoria(rs.getString("DESC_CATEGORIA"));
        return categoria;
    }
}
