package restaurante;
import DAO.AdicionalDAO;
import DAO.FuncionarioDAO;
import DAO.PedidoDAO;
import DAO.ProdutoDAO;
import bean.Adicional;
import bean.Funcionario;
import bean.Pedido;
import bean.Produto;
import java.util.List;
import java.util.Scanner;
public class Restaurante {
    
    public static Funcionario RegistrarFuncionario(Funcionario gerente) 
    {    
        Scanner read = new Scanner(System.in);
            
        System.out.print("Nome:");
        String nome = read.nextLine();
        System.out.print("RG:");
        int RG = read.nextInt();
        System.out.print("CPF:");
        int CPF = read.nextInt();
        System.out.print("Telefone:");
        int telefone = read.nextInt();
        gerente.CadastrarFuncionarios(nome,RG,CPF,telefone);
        return gerente;   
    }
    
    public static Pedido RegistrarPedido(Pedido pedido) 
    {    
        Adicional adicional = new Adicional();
        Scanner read = new Scanner(System.in);
        System.out.print("Status:");
        String status = read.nextLine();
        System.out.print("Valor:");
        double valor_total= read.nextDouble();
        pedido.CadastrarPedido(valor_total,status);
        return pedido;
        
    }
    public static Produto RegistrarNovoProduto(Produto produto) 
    {    
        Scanner read = new Scanner(System.in);

        System.out.print("Nome do Produto:");
        String nomeProduto = read.nextLine();
        System.out.print("Valor:");
        double valorProduto= read.nextDouble();

        produto.CadastrarProduto(nomeProduto,valorProduto);
        return produto;
        
    }
    public static Adicional RegistrarNovoAdicional(Adicional adicional) 
    {    
        
        Scanner read = new Scanner(System.in);

        System.out.print("Descrição do Produto adicional:");
        String descricao= read.nextLine();
        System.out.print("Valor do adicional:");
        double valor_adicional = read.nextDouble();

        adicional.CadastrarAdicional(descricao,valor_adicional);
        return adicional;
        
    }
    
  public static void Escolha() 
  {     
        Scanner read=new Scanner(System.in);
        System.out.println("Olá, O que você deseja realizar no sistema?");
        System.out.print("1-Cadastrar Funcionário\n2-Cadastrar Pedido\n3-Cadastrar novo produto\n");
        String resposta = read.nextLine();
        System.out.println("");
        if ("1".equals(resposta))
        {
        System.out.println("CADASTRO DE FUNCIONÁRIO");
        Funcionario funcio = new Funcionario();
        RegistrarFuncionario(funcio);
        FuncionarioDAO FunDAO = new FuncionarioDAO();
        FunDAO.insert(funcio);
        }     
        else if ("2".equals(resposta)) 
        {
        Dinheiro dinheiro=new Dinheiro();
        Adicional adicional = new Adicional();
        System.out.println("CADASTRO DE PEDIDO");
        Pedido pedido = new Pedido();
        RegistrarPedido(pedido);
        PedidoDAO PedDAO = new PedidoDAO();
        PedDAO.insert(pedido);
        System.out.println("Deseja acrescentar adicional?(S/N)");
        String res=read.nextLine();
        if ("S".equals(res))
        { 
        RegistrarNovoAdicional(adicional);
        AdicionalDAO adDAO = new AdicionalDAO();
        adDAO.insert(adicional);
        double total=adicional.TotalAdicional()+pedido.TotalPedido();
        System.out.println(""); 
        System.out.println("Total a pagar:"+total);
        System.out.println("Valor pago pelo cliente:");
        double valorCliente=read.nextDouble();
           if (valorCliente==total)
           {
           dinheiro.ConfirmarPagamento();
           }
           else if (valorCliente>total)
           {
           double troco=valorCliente-total;
           dinheiro.Valor_Troco(troco);
           }
        }
        else if ("N".equals(res))
        {
        double total=pedido.TotalPedido();
            System.out.println(""); 
        System.out.println("Total a pagar:"+total);
        System.out.print("Valor pago pelo cliente:");
        double valorCliente=read.nextDouble();
          if (valorCliente==total)
           {
           dinheiro.ConfirmarPagamento();
           }
           else if (valorCliente>total)
           {
           double troco=valorCliente-total;
           dinheiro.Valor_Troco(troco);
           }
        }
        
        } 
        else if ("3".equals(resposta)) 
        {
        System.out.println("CADASTRO DE PRODUTO");
        Produto produto = new Produto();
        RegistrarNovoProduto(produto);
        ProdutoDAO ProDAO = new ProdutoDAO();
        ProDAO.insert(produto);
        }         
    }
    public static void main(String[] args) {
    Escolha();
        
    }

    
    
}
