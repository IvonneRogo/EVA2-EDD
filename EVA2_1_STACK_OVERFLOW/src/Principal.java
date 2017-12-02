/*SE QUEDA SIN MEMORIA
EL METODO RECURSIVO DEBE DE DETENERSE
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
        recursivo();
    }
    
    public static void recursivo(){
        System.out.println("ups");
        recursivo();
    }
}
