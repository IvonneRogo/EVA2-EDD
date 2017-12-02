
import java.util.Stack;

/*PILAS
 *PUSH Y POP
 */

/**
 *
 * @author 15060769
 */
public class Principal4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack <Double> sMiPila=new Stack();
        sMiPila.push(20.0);
        sMiPila.push(21.0);
        sMiPila.push(22.0);
        sMiPila.push(19.0);
        sMiPila.push(18.0);
        
        System.out.println(sMiPila.pop());//LE EL ULTIMO ELEMENTO AGREGADO (QUE SERIA EL PRIMERO EN UNA PILA)
        System.out.println(sMiPila.pop());//*Y LO BORRA
        System.out.println(sMiPila.peek());//SOLO LEE EL PRIMER VALOR
    }
    
}
