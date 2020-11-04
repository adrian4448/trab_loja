package Model.Entities;

public class Estoque {

    private Integer idEstoque;
    private Produto produto;
    private Fornecedor fornecedor;

    public Estoque() {

    }

    public Estoque(Produto produto, Fornecedor fornecedor) {
        this.produto = produto;
        this.fornecedor = fornecedor;
    }

    public Integer getIdEstoque() {
        return idEstoque;
    }

    public void setIdEstoque(Integer idEstoque) {
        this.idEstoque = idEstoque;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
}
