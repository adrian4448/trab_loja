package BackEnd.Entities;

public class Categoria {
   
    private Integer idCategoria;
    private String descCategoria;
    
    public Categoria() {
        
    }
    
    public Categoria(String descCategoria) {
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
