package Model.Entities;

public class Categoria {
   
    private Integer idCategoria;
    private String descCategoria;
    
    public Categoria() {
        
    }
    
    public Categoria(Integer idCategoria, String descCategoria) {
        this.idCategoria = idCategoria;
        this.descCategoria = descCategoria;
    }
    
    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getDescCategoria() {
        return descCategoria;
    }

    public void setDescCategoria(String descCategoria) {
        this.descCategoria = descCategoria;
    }
}
