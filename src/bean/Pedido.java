package bean;
import bean.Produto;

public class Pedido {
private int idPedido;
public double valor_total;
public String status;

    public Pedido(double valor_total, String status) {
        this.valor_total = valor_total;
        this.status = status;
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
    public void  CadastrarPedido(double valor_total,String status) {
        this.status = status;
        this.valor_total = valor_total;
        
    }
    public double TotalPedido()
    {   
        return valor_total;
        
    }
}