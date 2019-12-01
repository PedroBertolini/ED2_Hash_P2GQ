package hash_e_prova2gq.txtdados;

/**
 *
 * @author PEDRO BERTOLINI
 */
public class Dado {
    private String key;
    private int qtd;
    
    public Dado(String key){
        this.key = key;
        this.qtd = 1;
    }
    
    public void incrementa(){
        this.qtd ++;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    @Override
    public String toString() {
        return "key= " + key + " qtd= " + qtd;
    }
    
       
    
    
    
    
    
    
}
