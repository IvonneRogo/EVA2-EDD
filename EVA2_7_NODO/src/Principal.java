/*LISTAS ENLAZADAS
    ENLAZAR LOS 3 OBJETOS

8
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
        Nodo obj1 = new Nodo(100);
        Nodo obj2 = new Nodo(200);
        Nodo obj3 = new Nodo(300);
        //OBJ1 --> OBJ2 --> OBJ3
        obj1.nSig=obj2;//LA DIRECCION DE obj2 SE GUARDA EN nSig DE obj1
        obj2.nSig=obj3;
        //IMPRIMIR LOS VALORES DE LA "LISTA"
        Nodo nTemp = obj1;//NODO TEMPORAL QUE VA MOVERSE EN LA LISTA
        while(nTemp != null){
            System.out.print(nTemp.iVal+" - ");
            nTemp=nTemp.nSig;//ACTUALIZA EL VALOR DE nTemp AL VALOR SIGUIENTE
        }
    }

}

class Nodo {

    public int iVal;//ALMACENA
    public Nodo nSig;//ENLACE AL SIGUIENTE VALOR

    public Nodo() {
        iVal = 0;
        nSig = null;//SIEMPRE DEBE ESTAR INICIALIZADO
    }

    public Nodo(int iNum) {
        iVal = iNum;
        nSig = null;
    }

}
