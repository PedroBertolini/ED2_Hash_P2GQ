package hash_e_prova2gq;
import hash_e_prova2gq.hash.Hash;
import hash_e_prova2gq.txtdados.Dado;
import hash_e_prova2gq.txtdados.RepositorioDados;
import hash_e_prova2gq.txtdados.Txt;
/**
 *
 * @author PEDRO BERTOLINI
 */
public class Teste {

    public static void main(String[] args) {
        RepositorioDados rep = new RepositorioDados();
        RepositorioDados repH = new RepositorioDados();
        Dado[] novo;
        String key;
        Txt text = new Txt();
        text.startTxt();        
        Hash hash = new Hash(text.getLista().getLista());
        System.out.println("Size List: " + text.getLista().getLista().size());
        hash.createHash();
       

      /*  for (int i = 0; i < 20; i++) {
            novo = new Dado(Integer.toString(i)); //
            rep.adicionar(novo);
            novo = new Dado(Integer.toString(i));
            rep.adicionar(novo);

        }
*/
    }

}
