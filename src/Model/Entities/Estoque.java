package Model.Entities;

public class Estoque {

    private Integer idEstoque;
    private Integer totalEstoque;
    private Fornecedor fornecedor;

    public Estoque() {

    }

    public Estoque(Integer totalEstoque, Fornecedor fornecedor) {
        this.totalEstoque = totalEstoque;
        this.fornecedor = fornecedor;
    }

    public Integer getIdEstoque() {
        return idEstoque;
    }

    public void setIdEstoque(Integer idEstoque) {
        this.idEstoque = idEstoque;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    public Integer getTotalEstoque() {
        return totalEstoque;
    }

    public void setTotalEstoque(Integer totalEstoque) {
        this.totalEstoque = totalEstoque;
    }
}
