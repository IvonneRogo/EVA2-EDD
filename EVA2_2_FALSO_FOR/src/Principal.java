/*GENERAR UN FOR USANDO RECURSIVIDAD
 RECURSIVIDAD: METODO QUE SE LLAMA ASI MISMO
 DEBE DE TENER UNA CONDICION QUE LO DETENGA
 */

/**
 *
 * @author 15060769
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        falsoFor(5);
        System.out.println("");
        falsoForAdelante(5, 1);
    }

    public static void falsoFor(int iVal) {
        System.out.print(iVal + " - ");
        if (iVal > 1) {
            falsoFor(iVal - 1);
        }
    }
   
    public static void falsoForAdelante(int iFin, int iVal){
        System.out.print(iVal+" - ");
        if(iVal < iFin)
            falsoForAdelante(iFin, iVal+1);
    }

}
