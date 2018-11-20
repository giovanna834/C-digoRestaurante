package bean;
import java.util.Scanner;
public class Funcionario 
{
protected int idFuncio;
public String nome;
public int RG;
public int CPF;
public int telefone;       
    //construtor com descrição
    public Funcionario(String nome, int RG, int CPF, int telefone) 
    {
        this.nome = nome;
        this.RG = RG;
        this.CPF = CPF;
        this.telefone = telefone;
    } 
    //construtor vazio
    public Funcionario() {
    }
    //getters e setters
    public int getIdFuncio() 
      {
        return idFuncio;
      }
    public void setIdFuncio(int idFuncio) 
      {
        this.idFuncio = idFuncio;
      }

    public String getNome() 
    {
        return nome;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }  
  
    public int getRG() 
      {
        return RG;
      }
    public void setRG(int RG) 
      {
        this.RG = RG;
      }
    
    public int getCPF() 
    {
        return CPF;
    }
    public void setCPF(int CPF) 
    {
        this.CPF = CPF;
    }
    
    public int getTelefone() 
      {
        return telefone;
      }
    public void setTelefone(int telefone) 
      {
        this.telefone = telefone;
      }
    public void CadastrarFuncionarios(String nome, int RG, int CPF, int telefone) {
        this.nome = nome;
        this.RG = RG;
        this.CPF = CPF;
        this.telefone = telefone;
    }
    
    }
