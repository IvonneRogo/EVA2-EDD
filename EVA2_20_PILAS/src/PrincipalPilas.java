
/**
 *
 * @author 15060769
 */
public class PrincipalPilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pilas miPila = new Pilas();
        miPila.push(new Nodo(55));
        miPila.push(new Nodo(33));
        miPila.push(new Nodo(10));
        miPila.push(new Nodo(89));
        miPila.push(new Nodo(44));
        miPila.imprimirPila();
        System.out.println("Tamaño de la pila = " + miPila.tamanoPila());
        System.out.println("Ultimo Valor = " + miPila.leerUltimoNodo());
        System.out.println("elimina = " + miPila.pop());

        miPila.imprimirPila();
        System.out.println("elimina = " + miPila.pop());
        // miPila.pop();
        miPila.imprimirPila();
        System.out.println("Pila vacia: " + miPila.estadoPila());
        miPila.vaciarPila();
        System.out.println("Pila vacia: " + miPila.estadoPila());
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
        this.iValor = iNum;
        this.nSig = null;
        this.nPrev = null;
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

class Pilas {

    private Nodo nIni;
    private Nodo nFin;

    public Pilas() {
        nIni = null;
        nFin = null;
    }

    public Pilas(Nodo nNodo) {
        nIni = nNodo;
        nFin = nNodo;
    }

    public void push(Nodo nNodo) {//agregarNodos(Nodo nNodo) {
        if (nIni == null) {
            nIni = nNodo;
            nFin = nNodo;
        } else {
            nFin.setnSig(nNodo);
            nNodo.setnPrev(nFin);
            nFin = nNodo;
        }
    }

    public void imprimirPila() {
        if (nIni == null) {
            System.out.println("PILA VACIA");
        } else {
            Nodo temp = nIni;
            while (temp != null) {
                System.out.print(temp.getiValor() + " - ");
                temp = temp.getnSig();
            }
            System.out.println("");
        }
    }

    public int tamanoPila() {
        if (nIni == null) {
            return 0;
        } else {
            int c = 0;
            Nodo temp = nIni;
            while (temp != null) {
                c++;
                temp = temp.getnSig();
            }
            return c;
        }
    }

    public int leerUltimoNodo() {
        if (nIni == null) {
            //LANZAR UNA EXCEPCION!!!!!!!!!!!!!!!!!
            return 0;
        } else {
            return nFin.getiValor();
        }
    }

    public int pop() {//removerUltimoNodo
        if (nIni == null) {
            return 0;
        } else {
            int iValor = nFin.getiValor();
            //ELIMINA
            if (nIni.getnSig() == null) {
                nIni = null;
                nFin = null;
            } else {
                nFin = nFin.getnPrev();
                nFin.setnSig(null);
            }
            return iValor;
        }
    }

    public void vaciarPila() {
        nIni = null;
    }

    public boolean estadoPila() {
        return nIni == null;
    }

}
