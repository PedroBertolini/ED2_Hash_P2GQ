package hash_e_prova2gq.txtdados;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author PEDRO BERTOLINI
 */
public class Txt {     
   Scanner ler = new Scanner(System.in); 
   private String nome;
   private RepositorioDados lista;
   
   
   public Txt(){
   this.nome = "c:\\doc\\dados.txt";
   this.lista = new RepositorioDados();
   }   
   
    public void startTxt(){    
    System.out.printf("Text has been started:\n");
    geraLista();
    }
 
    public void geraLista(){
    try {
      FileReader arq = new FileReader(nome);
      BufferedReader lerArq = new BufferedReader(arq);
 
      String linha = lerArq.readLine();
      Dado new1 = new Dado(linha);
      lista.adicionar(new1);
      
      while (linha != null) {
        //System.out.printf("%s\n", linha); 
        linha = lerArq.readLine(); // lê da segunda até a última linha
       if(linha != null){
        Dado new2 = new Dado(linha);
        lista.adicionar(new2);
       }
      } 
      arq.close();
    } catch (IOException e) {
        System.err.printf("Erro na abertura do arquivo: %s.\n",
          e.getMessage());
    }
 
    System.out.println();
  }

    public RepositorioDados getLista() {
        return lista;
    }

    public void setLista(RepositorioDados lista) {
        this.lista = lista;
    }
    
    
    
    
    
    
    
    
    
}


