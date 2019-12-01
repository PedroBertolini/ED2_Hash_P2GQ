package hash_e_prova2gq.txtdados;

import java.util.ArrayList;

/**
 *
 * @author PEDRO BERTOLINI
 */
public class RepositorioDados {

    private ArrayList<Dado> lista;

    public RepositorioDados() {
        this.lista = new ArrayList();
    }

    public void adicionar(Dado novo) {
        if (this.lista.isEmpty()) {
            this.lista.add(novo);
            System.out.println("first " + novo.toString());
            return;
        } else {
            for (Dado sup : this.lista) {
                if (sup.getKey().equalsIgnoreCase(novo.getKey())) {
                    sup.incrementa();
                    System.out.println("Incrementado " + sup.toString());
                    return;
                }
            }
            lista.add(novo);
            System.out.println("Adicionado " + novo.toString());
            return;
        }
    }

    public ArrayList<Dado> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Dado> lista) {
        this.lista = lista;
    }
    
    

}
