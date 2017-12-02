
import java.util.LinkedList;

/*COLLECTION DE LISTAS
 *SIGUEN SIENDO ARREGLOS
 */
/**
 *
 * @author 15060769
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<String> llMiLista = new LinkedList();//ES COMO LOS ARREGLOS
        llMiLista.add("HOLA");
        llMiLista.add(" ");
        llMiLista.add("MUNDO");
        llMiLista.add(" ");
        llMiLista.add("CRUEL");
        llMiLista.add(" ");
        llMiLista.add("NANANA");
        for (String llMiLista1 : llMiLista) {
            System.out.print(llMiLista1);
        }
        //REMOVER ELEMENTOS
        llMiLista.remove(4);
        System.out.println("");
        for (String llMiLista1 : llMiLista) {
            System.out.print(llMiLista1);
        }
        //INSERTAR
        llMiLista.add(4, "BONDADOSO");
        System.out.println("");
        for (String llMiLista1 : llMiLista) {
            System.out.print(llMiLista1);
        }
        System.out.println("");
        System.out.println("LA LISTA TIENE "+llMiLista.size()+" ELEMENTOS");
    }

}
