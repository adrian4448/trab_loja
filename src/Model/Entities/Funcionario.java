package Model.Entities;

public class Funcionario {

    private Integer idFuncionario;
    private String nomeFuncionario;
    private String loginFuncionario;
    private String senhaFuncionario;

    public Funcionario() {

    }

    public Funcionario(String nomeFuncionario, String loginFuncionario, String senhaFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
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
