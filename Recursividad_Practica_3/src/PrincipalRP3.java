
import java.util.Scanner;

/*RECURSIVIDAD PRACTICA 3
 */
/**
 *
 * @author 15060769
 */
public class PrincipalRP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entero que se quiere elevar");
        int iBase = sc.nextInt();
        System.out.println("Ingrese la potencia");
        int iPote = sc.nextInt();

        System.out.println("La potencia del numero " + iBase + " a la " + iPote + " potencia es " + potenciaN(iBase, iPote));
    }

    public static int potenciaN(int iB, int iN) {
        if (iN == 0) {
            return 1;
        } else {
            //System.out.println(""+iN);
            int a = iB * potenciaN(iB, iN - 1);
            return a;
        }
    }

}
