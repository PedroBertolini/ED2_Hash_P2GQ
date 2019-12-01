package hash_e_prova2gq.hash;

import hash_e_prova2gq.txtdados.Dado;
import hash_e_prova2gq.txtdados.RepositorioDados;
import java.util.ArrayList;

/**
 *
 * @author PEDRO BERTOLINI
 */
public class Hash {

    private Dado[] list;
    private ArrayList<Dado> listIn;

    public Hash(ArrayList<Dado> list2) {
        this.listIn = list2;
        this.list = new Dado[this.listIn.size() * 10];
    }

    public void createHash() {
        if (this.listIn.isEmpty()) {
            System.out.println("Arquivo Vazio!");
            return;
        } else {
            for (Dado sup : this.listIn) {
                int positionHash = geraHash(sup);
                if (this.list[positionHash] == null) {
                    this.list[positionHash] = sup;
                    System.out.println(sup.toString() + " Guardado no endereço: " + positionHash);
                } else {
                    System.out.println("Colisão de: " + sup.toString() + " no endereço: " + positionHash);
                }
            }
            return;
        }
    }
    
    
    public int geraHash(Dado dado) {
        int hash = ((Integer.parseInt(dado.getKey()) % this.list.length));
        System.out.print("Hash gerado: " + Integer.toString(hash) + " =>    ");
        return hash;
    }
}

