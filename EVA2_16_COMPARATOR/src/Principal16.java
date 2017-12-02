
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import javafx.print.Collation;

/*QUE ORDEN LE QUEREMOS DAR.
 */
/**
 *
 * @author 15060769
 */
public class Principal16 {

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
        llMiLista.add("COLLECTIONS");
        for (String llMiLista1 : llMiLista) {
            System.out.print(llMiLista1);
        }

        Comparator cmMiComparator = new Comparator() {//COMPARATOR ES UNA INTERFAZ, NO UNA CLASE
            @Override
            public int compare(Object o1, Object o2) {
                String sCade1, sCade2;//CONVERTIR A STRING 
                sCade1 = (String) o1;
                sCade2 = (String) o2;
                char c1,c2;
                c1=sCade1.charAt(0);
                c2=sCade2.charAt(0);
                /*compare regresa positivo(grande), cero(igual), negativo(pequeño)
                *CON EL CODIGO ASCII, SE RESTA SU VALOR DECIMAL, SI SALE POSITIVO
                *EL CARACTER VA PRIMERO, SI SALE NEGATIVO VA DESPUES
                */
               // return c1-c2;
                return c2-c1;
                
            }
        };
        System.out.println("");
        Collections.sort(llMiLista, cmMiComparator);
        System.out.println(llMiLista);

    }

}
