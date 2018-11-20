package bean;
import bean.Produto;

public class Pedido {
private int idPedido;
private double valor_total;
public String status;
private int idProduto;

    public Pedido(double valor_total, String status,int idProduto) {
        this.valor_total = valor_total;
        this.status = status;
        this.idProduto=idProduto;
    }

    public Pedido() {
    }
  //getters e setters
    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido= idPedido;
    }
     public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto= idProduto;
    }
    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }
    
     public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    } 
    public void  CadastrarPedido(String status,int idProduto) {
        this.status = status;
        this.idProduto=idProduto;
    }
    public void TotalPedido()
    {
    Produto produto=new Produto();
    valor_total=produto.getValorProduto();
    }
}
