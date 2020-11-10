package Model.Entities;

public class Produto {

    private Integer idProduto;
    private String descProduto;
    private Double precoProduto;

    private Estoque produtoEstoque;
    private Categoria categoria;

    public Produto() {

    }

    public Produto(String descProduto, Double precoProduto, Estoque produtoEstoque) {
        this.descProduto = descProduto;
        this.precoProduto = precoProduto;
        this.produtoEstoque = produtoEstoque;
    }

    public boolean produtoHasEstoque() {
        if (this.produtoEstoque != null && this.produtoEstoque.getTotalEstoque() > 0) {
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

    public Estoque getProdutoEstoque() {
        return produtoEstoque;
    }

    public void setProdutoEstoque(Estoque produtoEstoque) {
        this.produtoEstoque = produtoEstoque;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void cadastrarCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
