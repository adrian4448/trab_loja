package BackEnd.Entities;

import java.time.LocalDate;

public class Funcionario {

    private Integer idFuncionario;
    private String nomeFuncionario;
    private LocalDate dataNascimento;
    private String loginFuncionario;
    private String senhaFuncionario;
    private String cpfFuncionario;

    public Funcionario() {

    }

    public Funcionario(String nomeFuncionario, LocalDate dataNascimento, String loginFuncionario, String senhaFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
        this.dataNascimento = dataNascimento;
        this.loginFuncionario = loginFuncionario;
        this.senhaFuncionario = senhaFuncionario;
    }

    public Integer getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Integer idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getLoginFuncionario() {
        return loginFuncionario;
    }

    public void setLoginFuncionario(String loginFuncionario) {
        this.loginFuncionario = loginFuncionario;
    }

    public String getSenhaFuncionario() {
        return senhaFuncionario;
    }

    public void setSenhaFuncionario(String senhaFuncionario) {
        this.senhaFuncionario = senhaFuncionario;
    }

    public String getCpfFuncionario() {
        return cpfFuncionario;
    }

    public void setCpfFuncionario(String cpfFuncionario) {
        this.cpfFuncionario = cpfFuncionario;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
