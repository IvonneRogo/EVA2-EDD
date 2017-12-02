
import java.util.Scanner;

/*PRACTICA 2 DE RECURSIVIDAS,
 *ELIMINAR LAS X´S DE UNA CADENA DE CARACTERES
 */
/**
 *
 * @author 15060769
 */
public class Principal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una cadena de caracteres");
        String sC = sc.nextLine();
        //String sC = "abcxdxef";
        //           01234567
        System.out.println("Cadena sin x's " + quitarX(sC));

    }
    static String newCade;

    static int c = 0;

    public static String quitarX(String sCa) {
        int TAMA = sCa.length();
        if (sCa.equals("x")) {
            return "";
        } else {
            for (int i = 0; i < TAMA; i++) {
                if (sCa.charAt(i) == 'x') {
                    c++;
                } else {
                    newCade = sCa;
                }
            }
            if (c == 0) {
                return newCade;
            } else {
                if (sCa.charAt(0) == 'x') {
                    newCade = sCa.substring(1);
                } else if (sCa.charAt(TAMA - 1) == 'x') {
                    newCade = sCa.substring(0, TAMA - 1);
                } else {
                    for (int i = 0; i < sCa.length(); i++) {
                        if (sCa.charAt(i) == 'x') {//i=3
                            newCade = sCa.substring(0, i) + sCa.substring(i + 1, TAMA);
                            //                    0,2                      3,4
                        }
                    }
                }
            }
            c--;
            return quitarX(newCade);
        }
        //return quitarX(newCade);
    }

}
