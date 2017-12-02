
import java.util.Scanner;

/**
 *
 * @author 15060769
 */
public class Principal5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una cadena de parentesis");
        String sCadena = sc.nextLine();
        System.out.println("¿Estan anidados? " + parentesisAnidados(sCadena));
    }

    public static boolean parentesisAnidados(String sCad) {
        if (sCad.equals("")) {
            return true;
        } else if (sCad.charAt(0) == '(' && sCad.charAt(sCad.length() - 1) == ')') {
            return parentesisAnidados(sCad.substring(1, sCad.length() - 1));
        } else {
            return false;
        }
    }
}
