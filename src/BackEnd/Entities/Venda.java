package BackEnd.Entities;

import java.time.LocalDateTime;
import java.util.List;

public class Venda {

    private Integer idVenda;
    private LocalDateTime dataVenda;
    private Funcionario funcionario;
    private List<ProdutoVenda> produtos;

    public Venda() {

    }

    public Venda(LocalDateTime dataVenda, Funcionario funcionario, List<ProdutoVenda> produtos) {
        this.dataVenda = dataVenda;
        this.funcionario = funcionario;
        this.produtos = produtos;
    }

    public Integer getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(Integer idVenda) {
        this.idVenda = idVenda;
    }

    public LocalDateTime getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDateTime dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public List<ProdutoVenda> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ProdutoVenda> produtos) {
        this.produtos = produtos;
    }
}
