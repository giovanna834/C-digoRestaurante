package bean;

import java.sql.Date;

public class Caixa {
private int idCaixa;
private double saldoInicial;
private double saldoFinal;
private String horaInicial ;
private String horaFinal;
private Date dataPedido;

    public Caixa(double saldoInicial, double saldoFinal, String horaInicial, String horaFinal, Date DataPedido) {
        this.saldoInicial = saldoInicial;
        this.saldoFinal = saldoFinal;
        this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;
        this.dataPedido = DataPedido;
    }
    //construtor vazio
    public Caixa() {
    }

    //getters e setters
    public int getIdCaixa() {
        return idCaixa;
    }

    public void setIdCaixa(int idCaixa) {
        this.idCaixa=idCaixa;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }  
    
    public double getSaldoFinal() {
        return saldoFinal;
    }

    public void setSaldoFinal(double saldoFinal) {
        this.saldoFinal = saldoFinal;
    }
    
    public String getHoraInicial() {
        return horaInicial;
    }

    public void setHoraInicial(String horaInicial) {
        this.horaInicial = horaInicial;
    }
    
    public String getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(String horaFinal) {
        this.horaFinal = horaFinal;
    }
    
     public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date DataPedido) {
        this.dataPedido = DataPedido;
    }
    
    public void valorPagar(){
        System.out.println("O valor a pago foi de: R$"+saldoInicial+" e o valor retornado foi de: R$"+saldoFinal);
    }
    public float EfetuarPG(){
        System.out.println("O caixa "+idCaixa+" atendeu às "+horaInicial+" até "+horaFinal+" no dia "+dataPedido);
    return 0;
    }
}
