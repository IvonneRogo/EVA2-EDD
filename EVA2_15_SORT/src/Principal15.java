
import java.util.Collections;
import java.util.LinkedList;

/*ORDENAMIENTO
 *DEPENDIENDO DEL TIPO DE DATO SE PUEDE ORDENAR
 */
/**
 *
 * @author 15060769
 */
public class Principal15 {

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
        System.out.println("");
        Collections.sort(llMiLista);//ORDEN ALFABETICO, SI NO SE ESPECIFICA COMO SE ORDENA
        for (String llMiLista1 : llMiLista) {
            System.out.print(llMiLista1);
        }
    }

}
