
/**
 *
 * @author 15060769
 */
public class Principal10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queues filaAlsuper = new Queues();
        filaAlsuper.imprimirLista();
        filaAlsuper.agregarNodos(new Nodo(100));
        filaAlsuper.agregarNodos(new Nodo(200));
        filaAlsuper.agregarNodos(new Nodo(300));
        filaAlsuper.agregarNodos(new Nodo(400));
        filaAlsuper.agregarNodos(new Nodo(500));
        filaAlsuper.imprimirLista();
        //System.out.println("La fila esta vacia: " + filaAlsuper.listaVacia());
        //System.out.println("PRIMER NODO = " + filaAlsuper.leerPrimerNodo());
        //System.out.println("");
        System.out.println(filaAlsuper.removerPrimerNodo());
        filaAlsuper.imprimirLista();
        filaAlsuper.removerPrimerNodo();
        filaAlsuper.imprimirLista();
        System.out.println("Tamaño de la fila: " + filaAlsuper.tamanoFila());
        filaAlsuper.vaciarLista();
        System.out.println("La fila esta vacia: " + filaAlsuper.listaVacia());
        filaAlsuper.imprimirLista();

    }

}

class Nodo {

    private int iValor;
    private Nodo nSig;
    private Nodo nPrev;

    public Nodo() {
        iValor = 0;
        nSig = null;
        nPrev = null;
    }

    public Nodo(int iNum) {
        iValor = iNum;
        nSig = null;
        nPrev = null;
    }

    public int getiValor() {
        return iValor;
    }

    public void setiValor(int iValor) {
        this.iValor = iValor;
    }

    public Nodo getnSig() {
        return nSig;
    }

    public void setnSig(Nodo nSig) {
        this.nSig = nSig;
    }

    public Nodo getnPrev() {
        return nPrev;
    }

    public void setnPrev(Nodo nPrev) {
        this.nPrev = nPrev;
    }

}

class Queues {

    private Nodo nIni;
    private Nodo nFin;

    public Queues() {
        nIni = null;
        nFin = null;
    }

    public Queues(Nodo nNodo) {
        this.nIni = nNodo;
        this.nFin = nNodo;
    }

    //AGREGAR NODO AL FINAL DE LA COLA
    public void agregarNodos(Nodo nNodo) {
        if (nIni == null) {
            nIni = nNodo;
            nFin = nNodo;
        } else {
            nFin.setnSig(nNodo);
            nNodo.setnPrev(nFin);
            nFin = nNodo;
        }
    }

    //DEVUELVE EL VALOR DEL PRIMERO NODO
    public int leerPrimerNodo() {
        if (nIni == null) {//LISTA VACIA
            //LANZAR UNA EXCEPCION
            return 0;//EL CERO ES UN NUMERO VALIDO
        } else {
            return nIni.getiValor();
        }
    }

    public int removerPrimerNodo() {
        if (nIni == null) {
            return 0;
        } else {
            int iVal = nIni.getiValor();
            if (nIni.getnSig() == null) {//SI HAY UN NODO
                nIni = null;
                nFin = null;
            } else {//SI HAY MAS NODOS
                nIni = nIni.getnSig();
                nIni.setnPrev(null);
            }
            return iVal;
        }
    }

    public void imprimirLista() {
        if (nIni == null) {
            System.out.println("LISTA VACIA");
        } else {
            Nodo nTemp = nIni;
            while (nTemp != null) {
                System.out.print(nTemp.getiValor() + " - ");
                nTemp = nTemp.getnSig();
            }
            System.out.println("");
        }
    }

    public boolean listaVacia() {
        return nIni == null;
    }

    public void vaciarLista() {
        nIni = null;
    }

    public int tamanoFila() {
        if (nIni == null) {
            return 0;
        } else {
            int iCont = 0;
            Nodo temp = nIni;
            while (temp != null) {
                iCont++;
                temp = temp.getnSig();
            }
            return iCont;
        }
    }
}
