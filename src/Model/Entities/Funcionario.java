package Model.Entities;

import java.time.LocalDate;

public class Funcionario {

    private Integer idFuncionario;
    private String nomeFuncionario;
    private String cpfFuncionario;
    private LocalDate dataNascimento;
    private String loginFuncionario;
    private String senhaFuncionario;

    public Funcionario() {

    }

    public Funcionario(String nomeFuncionario,String cpfFuncionario,LocalDate dataNascimento, String loginFuncionario, String senhaFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
        this.cpfFuncionario = cpfFuncionario;
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
}
