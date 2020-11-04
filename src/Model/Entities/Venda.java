package Model.Entities;

import java.util.Date;

public class Venda {

    private Integer idVenda;
    private Date dataVenda;
    private Funcionario funcionario;
    private Cliente cliente;

    public Venda() {

    }

    public Venda(Date dataVenda, Funcionario funcionario, Cliente cliente) {
        this.dataVenda = dataVenda;
        this.funcionario = funcionario;
        this.cliente = cliente;
    }

    public Integer getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(Integer idVenda) {
        this.idVenda = idVenda;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
