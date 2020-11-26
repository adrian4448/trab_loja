package BackEnd.Entities;

public class ProdutoEstoque {

    private Integer idEstoque;
    private Integer totalEstoque;
    

    public ProdutoEstoque() {

    }

    public ProdutoEstoque(Integer totalEstoque) {
        this.totalEstoque = totalEstoque;
    }

    public Integer getIdEstoque() {
        return idEstoque;
    }

    public void setIdEstoque(Integer idEstoque) {
        this.idEstoque = idEstoque;
    }
    
    public Integer getTotalEstoque() {
        return totalEstoque;
    }

    public void setTotalEstoque(Integer totalEstoque) {
        this.totalEstoque = totalEstoque;
    }
    
    public void baixaEstoque() {
        this.totalEstoque -= 1;
    }
}
