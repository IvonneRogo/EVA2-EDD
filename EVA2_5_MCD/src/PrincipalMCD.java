/*MAXIMO COMUN DIVISOR
 */

/**
 *
 * @author 15060769
 */
public class PrincipalMCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int iNum1 = 180;
        int iNum2 = 48;
        System.out.println("El MCD de " + iNum1 + ", " + iNum2 + " = " + calcularMCD(iNum1, iNum2));
    }

    //METODO IMPERFECTO PORQUE NO ACEPTA NEGATIVOS
    public static int calcularMCD(int iDendo, int iDsor) {
        if (iDsor == 0) {
            return iDendo;
        } else {
            int iResi = iDendo % iDsor;
            //System.out.println(iDendo+"\t"+iDsor+"\t"+iResi);
            return calcularMCD(iDsor, iResi);
        }
    }

}
