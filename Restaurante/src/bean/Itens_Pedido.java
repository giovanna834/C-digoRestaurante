package bean;

public class Itens_Pedido {

private int id;
private int idPedido ;    
private int idProduto ;
private int quantidade;
private double valorUni; 
private double valorTotal;

    public Itens_Pedido(int idPedido, int idProduto, int quantidade, double valorUni, double valorTotal) {
        this.idPedido = idPedido;
        this.idProduto = idProduto;
        this.quantidade = quantidade;
        this.valorUni = valorUni;
        this.valorTotal = valorTotal;
    }

    public Itens_Pedido() {
    }
   
//getters e setters
    public int getId() {
        return id;
    }
    public void setId(int idItens) {
        this.id=id;
    }
    public int getIdPedido() {
        return idPedido;
    }
    public void setIdPedido(int idPedido) {
        this.idPedido=idPedido;
    }
    public int getIdProduto() {
        return idProduto;
    }
    public void setIdProduto(int idProduto) {
        this.idProduto=idProduto;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade=quantidade;
    }
    public double getValorUni() {
        return valorUni;
    }
    public void setValorUni(double valorUni) {
        this.valorUni=valorUni;
    }
    public double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal=valorTotal;
    }
    public void subTotalItem(){
        System.out.println("O valor do pedido será decorrente a sua escolha, sendo item 1 (R$6,00) ou item 2 (R$7,00), sendo sua escolha o item "+idPedido+", digite o valor que você irá pagar: "+valorUni);
    }
    public void subTotalItensPedidos(){
        valorTotal = valorUni * quantidade;
        System.out.println("O que deverá se pago ao todo, será de R$"+valorTotal);
    }
}
