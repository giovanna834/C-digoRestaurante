package restaurante;

public class Dinheiro extends Pagamento {
private double valor_entregue;
private double troco_cliente;


  public void ConfirmarPagamento()
  {
      System.out.println("Pagamento realizado com sucesso");
  }
  public void Valor_Troco(double troco)
  {
      System.out.println("Troco:"+troco);
  }
}
