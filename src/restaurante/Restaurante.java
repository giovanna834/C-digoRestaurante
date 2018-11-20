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
        Scanner read = new Scanner(System.in); 
        System.out.print("ID do Produto:");
        int idProduto = read.nextInt();
        System.out.print("Status:");
        String status = read.nextLine();
        
        pedido.CadastrarPedido(status,idProduto);
        System.out.println("Deseja acrescentar adicional?(S/N)");
        String resposta=read.nextLine();
        if ("S".equals(resposta))
        {
        
        }
        
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
        System.out.print("1-Cadastrar Funcionário\n2-Cadastrar Pedido\n3-Cadastrar novo produto\n4-Cadastrar novo adicional\n");
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
        System.out.println("CADASTRO DE PEDIDO");
        Pedido pedido = new Pedido();
        RegistrarPedido(pedido);
        PedidoDAO PedDAO = new PedidoDAO();
        PedDAO.insert(pedido);
        } 
        else if ("3".equals(resposta)) 
        {
        System.out.println("CADASTRO DE PRODUTO");
        Produto produto = new Produto();
        RegistrarNovoProduto(produto);
        ProdutoDAO ProDAO = new ProdutoDAO();
        ProDAO.insert(produto);
        } 
        else if ("4".equals(resposta)) 
        {
        System.out.println("CADASTRO DE PRODUTOS ADICIONAIS");
        Adicional adicional = new Adicional();
        RegistrarNovoAdicional(adicional);
        AdicionalDAO adDAO = new AdicionalDAO();
        adDAO.insert(adicional);
        } 
    }
    public static void main(String[] args) {
    Escolha();
        
    }

    
    
}
