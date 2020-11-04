package Model.Entities;

public class Fornecedor {

    private Integer idFornecedor;
    private String nomeFornecedor;
    private Produto produto;
    private Integer telefoneFornecedor;

    public Fornecedor() {

    }

    public Fornecedor(String nomeFornecedor, Produto produto, Integer telefoneFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
        this.produto = produto;
        this.telefoneFornecedor = telefoneFornecedor;
    }

    public Integer getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(Integer idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Integer getTelefoneFornecedor() {
        return telefoneFornecedor;
    }

    public void setTelefoneFornecedor(Integer telefoneFornecedor) {
        this.telefoneFornecedor = telefoneFornecedor;
    }
}
