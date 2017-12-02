/*IMPRIMIR CADENA
 */

/**
 *
 * @author 15060769
 */
public class PrincipalCad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*for (int i = 1; i <= 10; i++) {
            System.out.println(crearCadena(i));    
        }
        for (int i = 9; i >= 1; i--) {
            System.out.println(crearCadena(i));
        }*/

        //int i = 1, j = 9;
        int i = 1;
        int j = 9;
        while (j != 0) {
            if (i <= 10) {
                //System.out.println("i=" + i);
                System.out.println(crearCadena(i));
                i++;
            }
            if (i > 10) {
                //System.out.println("j=" + j);
                System.out.println(crearCadena(j));
                j--;
            }
        }
        
        /*while (i != 0) {
                //System.out.println("i=" + i);
                System.out.println(crearCadena(i));
                
            
            if (i == 10) {
                
                //System.out.println("j=" + j);
                //System.out.println(crearCadena(j));
                i=i-9;
                //j--;
            }
            i++;
        }*/

    }

    public static String crearCadena(int iNum) {
        if (iNum > 1) {
            return "*" + crearCadena(iNum - 1);
        } else {
            return "*";
        }
    }

}
