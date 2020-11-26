package BackEnd.Entities;

public class ProdutoVenda {

    private Integer idProduto;
    private String descProduto;
    private Double precoProduto;

    private Fornecedor fornecedor;
    private Categoria categoria;
    
    public ProdutoVenda() {

    }

    public ProdutoVenda(String descProduto,Fornecedor fornecedor, Double precoProduto, ProdutoEstoque estoqueProduto, Categoria categoria) {
        this.descProduto = descProduto;
        this.precoProduto = precoProduto;
        this.categoria = categoria;
        this.fornecedor = fornecedor;
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
    
    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
}
