package BackEnd.Entities;

public class ProdutoVenda {

    private Integer idProduto;
    private String descProduto;
    private Double precoProduto;

    private ProdutoEstoque estoqueProduto;
    private Fornecedor fornecedor;
    
    public ProdutoVenda() {

    }

    public ProdutoVenda(String descProduto, Double precoProduto, ProdutoEstoque estoqueProduto) {
        this.descProduto = descProduto;
        this.precoProduto = precoProduto;
        this.estoqueProduto = estoqueProduto;
    }

    public boolean produtoHasEstoque() {
        if (this.estoqueProduto != null && this.estoqueProduto.getTotalEstoque() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public String getDescProduto() {
        return descProduto;
    }

    public void setDescProduto(String descProduto) {
        this.descProduto = descProduto;
    }

    public Double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(Double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public ProdutoEstoque getProdutoEstoque() {
        return estoqueProduto;
    }

    public void setProdutoEstoque(ProdutoEstoque produtoEstoque) {
        this.estoqueProduto = produtoEstoque;
    }
}
