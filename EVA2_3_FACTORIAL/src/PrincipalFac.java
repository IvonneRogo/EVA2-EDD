
import java.util.logging.Level;
import java.util.logging.Logger;

/*FACTORIAL CON RECURSIVIDAD
 */
/**
 *
 * @author 15060769
 */
public class PrincipalFac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //try {
            // TODO code application logic here
            System.out.println("Factorial de 5 = " + factorial(5));
        /*} catch (Exception ex) {
            ex.printStackTrace();
        }*/

    }

    public static int factorial(int iNum) {// Exception {
        //excepcion
        /*if (iNum < 0)//NO ES UN VALOR VALIDO
        {
            throw new Exception("Número no valido");
        }*/
        if (iNum == 0) {
            return 1;
        } else {
            return iNum * factorial(iNum - 1);
        }
    }

}
