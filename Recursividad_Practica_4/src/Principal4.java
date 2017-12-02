
import java.util.Scanner;

/**
 *
 * @author 15060769
 */
public class Principal4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String sCadena = sc.nextLine();

        System.out.println("Cadena: " + sCadena + ". Cadena limpia: " + limpiarCadena(sCadena));
    }

    public static String limpiarCadena(String sCad) {
        if (sCad.length() == 1) {
            return sCad;
        } else if (sCad.charAt(0) == sCad.charAt(1)) {

            return limpiarCadena(sCad.substring(1));
        } else {
            return sCad.substring(0, 1) + limpiarCadena(sCad.substring(1));
        }
    }

}
