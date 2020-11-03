package Entities;

public class Cliente {

    private Integer idCliente;
    private String nomeCliente;
    private String telefoneCliente;

    public Cliente() {

    }

    public Cliente(String nomeCliente, String telefoneCliente) {
        this.nomeCliente = nomeCliente;
        this.telefoneCliente = telefoneCliente;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }
}
