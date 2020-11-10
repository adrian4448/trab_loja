package Model.Entities;

public class Fornecedor {

    private Integer idFornecedor;
    private String nomeFornecedor;
    private Integer telefoneFornecedor;

    public Fornecedor() {

    }

    public Fornecedor(String nomeFornecedor, Integer telefoneFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
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

    public Integer getTelefoneFornecedor() {
        return telefoneFornecedor;
    }

    public void setTelefoneFornecedor(Integer telefoneFornecedor) {
        this.telefoneFornecedor = telefoneFornecedor;
    }
}
