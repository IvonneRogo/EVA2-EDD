
import java.util.Scanner;

/**
 *
 * @author 15060769
 */
public class Principal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int iNum = sc.nextInt();
        System.out.println("Suma de los digitos " + sumaDigitos(iNum));
    }

    static int s = 0;

    public static int sumaDigitos(int iN) {
        //int s = 0;
        if (iN == 0) {
            return s;
        } else {
            int r = iN % 10;
            s += r;
            //int d = iN / 10;
            return sumaDigitos(iN / 10);
        }
    }
}
