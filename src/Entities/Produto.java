package Entities;

public class Produto {

    private Integer idProduto;
    private Venda venda;
    private Integer quantidade;
    private Fornecedor fornecedor;

    public Produto() {

    }

    public Produto(Venda venda, Integer quantidade, Fornecedor fornecedor) {
        this.venda = venda;
        this.quantidade = quantidade;
        this.fornecedor = fornecedor;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
}
