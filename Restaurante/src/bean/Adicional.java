package bean;

public class Adicional {
   private int idAdicional;
    private String descricao;
    private double valor_adicional;
    //construtor com descrição

    public Adicional(String descricao, double valor_adicional) {
        this.descricao = descricao;
        this.valor_adicional = valor_adicional;
    }
    //construtor vazio
    public Adicional() {
    }

    //getters e setters
    public int getIdAdicional() {
        return idAdicional;
    }

    public void setIdAdicional(int idAdicional) {
        this.idAdicional= idAdicional;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }  
    
    public double getValor_adicional() {
        return valor_adicional;
    }

    public void setValor_adicional(double valor_adicional) {
        this.valor_adicional = valor_adicional;
    }
    public void valorAdicional(){
        System.out.println("O valor que será adicionado junto com o preço real do produto, será de: R$"+valor_adicional);
        System.out.println(descricao);
    }
}