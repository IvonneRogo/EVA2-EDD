
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * LADO DERECHO MAYOR, LADO IZQUIERDO MENOR
 */
/**
 *
 * @author 15060769
 */
public class TRESS18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tree trMiArbol = new Tree(new Nodo(100));

        try {
            trMiArbol.agregarNodo(trMiArbol.getnRoot(), new Nodo(90));
            trMiArbol.agregarNodo(trMiArbol.getnRoot(), new Nodo(101));
            trMiArbol.agregarNodo(trMiArbol.getnRoot(), new Nodo(92));
            trMiArbol.agregarNodo(trMiArbol.getnRoot(), new Nodo(80));
            trMiArbol.agregarNodo(trMiArbol.getnRoot(), new Nodo(110));
            trMiArbol.agregarNodo(trMiArbol.getnRoot(), new Nodo(105));
            //trMiArbol.agregarNodo(trMiArbol.getnRoot(),new Nodo(90));
            System.out.println("PRE-ORDER");
            trMiArbol.preOrder();
            System.out.println("\nPOST-ORDER");
            trMiArbol.postOrder();
            System.out.println("\nIN-ORDER");
            trMiArbol.inOR();
        } catch (Exception ex) {
            Logger.getLogger(TRESS18.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("");
        //System.out.println("¿EL valor 105 esta en el arbol? " + trMiArbol.buscarValor(105));
    }

}

class Nodo {

    private int iVal;
    private Nodo nIzq;
    private Nodo nDer;

    public Nodo(int iVal) {
        this.iVal = iVal;
        nIzq = null;
        nDer = null;
    }

    public Nodo() {
        iVal = 0;
        nIzq = null;
        nDer = null;
    }

    public int getiVal() {
        return iVal;
    }

    public void setiVal(int iVal) {
        this.iVal = iVal;
    }

    public Nodo getnIzq() {
        return nIzq;
    }

    public void setnIzq(Nodo nIzq) {
        this.nIzq = nIzq;
    }

    public Nodo getnDer() {
        return nDer;
    }

    public void setnDer(Nodo nDer) {
        this.nDer = nDer;
    }

}

class Tree {

    //SIMILAR A UN ALISTA
    private Nodo nRoot;//PRIMER NODO

    public Tree() {
        nRoot = null;
    }

    public Tree(Nodo nNodo) {
        nRoot = nNodo;
    }

    public Nodo getnRoot() {
        return nRoot;
    }

    public void agregarNodo(Nodo nActual, Nodo nNodo) throws Exception {
        if (nRoot == null) {//CUANDO ESTA VACIA
            nRoot = nNodo;
        } else {//NO ESTA VACIA LA LISTA
            if (nNodo.getiVal() < nActual.getiVal()) {//SI ES MENOR-------A LA IZQUIERDA
                if (nActual.getnIzq() == null) {//AQUI VA NUESTRO NODO
                    nActual.setnIzq(nNodo);
                } else {//NO ESTA VACIO EL NODO
                    agregarNodo(nActual.getnIzq(), nNodo);//LLAMADA RECURSIVA
                }
            } else if (nNodo.getiVal() > nActual.getiVal()) {//SI ES MAYOR------DERECHA
                if (nActual.getnDer() == null) {//AQUI VA NUESTRO NODO
                    nActual.setnDer(nNodo);
                } else {//NO ESTA VACIO EL NODO
                    agregarNodo(nActual.getnDer(), nNodo);//LLAMADA RECURSIVA
                }
            } else {//SI ES IGUAL
                throw new Exception("NO PUEDE HABER VALORES REPETIDOS");
            }
        }
    }

    public void preOrder() {
        pOT(nRoot);//METODO QUE RESIVE EL PRIMER ORDEN
    }

    private void pOT(Nodo nActual) {//PREORDEN ES PRIVADO PORQUE YA SE DICE CUAL ES EL NODO INICIAL
        if (nActual != null) {
            System.out.print(nActual.getiVal() + " - ");//VISITA EL NODO
            pOT(nActual.getnIzq());//RECORREMOS EL LADO IZQUIERDO
            pOT(nActual.getnDer());//RECORREMOS EL LADO DERECHO
        }
    }

    public void postOrder() {
        pOR(nRoot);
    }

    private void pOR(Nodo nActual) {
        if (nActual != null) {
            pOR(nActual.getnIzq());
            pOR(nActual.getnDer());
            System.out.print(nActual.getiVal() + " - ");
        }
    }

    public void inOR() {
        iOR(nRoot);
    }

    private void iOR(Nodo nActual) {
        if (nActual != null) {
            iOR(nActual.getnIzq());
            System.out.print(nActual.getiVal() + " - ");
            iOR(nActual.getnDer());
        }
    }

   /* public boolean buscarValor(int iValor) {//, Nodo nActual) {
        Nodo nTemp = nRoot;
        //Nodo nTemp=nActual;
        while (nTemp != null) {
            if (iValor == nTemp.getiVal()) {
                return true;
            } else if (iValor < nTemp.getiVal()) {
                nTemp = nTemp.getnIzq();
            } else if (iValor > nTemp.getiVal()) {
                nTemp = nTemp.getnDer();
            }
        }
        return false;
    }*/

}
