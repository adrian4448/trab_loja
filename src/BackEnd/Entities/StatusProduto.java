package BackEnd.Entities;

public enum StatusProduto {
    
    ATIVO(1),
    VENDIDO(2),
    DEVOLVIDO(3);
    
    private final Integer statusProduto;

    private StatusProduto(Integer valor) {
        statusProduto = valor;
    }
    
    public Integer getValorStatusProduto() {
        return statusProduto;
    }
}
