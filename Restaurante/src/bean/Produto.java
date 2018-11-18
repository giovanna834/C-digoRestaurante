package bean;

public class Produto {
private int id; 
private String produto;
private double valor;  
private int disponivel;

public Produto(String produto, double valor, int disponivel) {
        this.produto = produto;
        this.valor = valor;
        this.disponivel = disponivel;
    }

public Produto() {
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id= id;
    }
    
     public String getProduto() {
        return produto;
    }

    public void setProduto(String Produto) {
        this.produto = produto;
    }  
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor= valor;
    }
    
    public int getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(int qtdDisponivel) {
        this.disponivel= disponivel;
    }
    public void tipoProduto(){
        System.out.println("A opção de escolha foi o número: "+id+" que tem o valor de: R$"+valor+", tendo o número de refeições disponíveis de: "+disponivel);
    }
}


