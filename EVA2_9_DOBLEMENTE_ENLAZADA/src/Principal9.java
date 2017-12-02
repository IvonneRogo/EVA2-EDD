
/**
 *
 * @author 15060769
 */
public class Principal9 {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        ListaDE miLista = new ListaDE();
        miLista.imprimirNodos();
        miLista.imprimirNodosInv();
        miLista.agregarNodos(new Nodo(100));
        miLista.agregarNodos(new Nodo(200));
        miLista.agregarNodos(new Nodo(300));
        miLista.agregarNodos(new Nodo(400));
        miLista.agregarNodos(new Nodo(500));
        miLista.imprimirNodos();
        System.out.println("");
        System.out.println(miLista.tamanoLista());
        miLista.insertarEn(5, new Nodo(111));
        miLista.imprimirNodos();
        System.out.println("");
        System.out.println("La lista esta vacia: " + miLista.listaVacia());
        System.out.println("Valor en la posicion 3 es " + miLista.valorEn(3));
        miLista.buscarValor(111);
        System.out.println("");
        miLista.eliminarValor(500);
        miLista.imprimirNodos();
        System.out.println("");
        miLista.buscarValor(500);

        miLista.vaciarLista();
        System.out.println("La lista esta vacia: " + miLista.listaVacia());
        for (int i = 0; i < 10; i++) {
            miLista.agregarNodos(new Nodo((int) (Math.random() * 10) + 1));
        }
        System.out.println("Nodos en la lista " + miLista.tamanoLista());
        
        System.out.println("");
        miLista.imprimirNodos();
        System.out.println("");
        miLista.imprimirNodosInv();
        System.out.println("");
        miLista.vaciarLista();
        miLista.imprimirNodos();
        
    }

}

class Nodo {

    private int iValor;
    private Nodo nPrev;
    private Nodo nSig;

    public Nodo() {
        iValor = 0;
        nPrev = null;
        nSig = null;
    }

    public Nodo(int iVal) {
        iValor = iVal;
        nPrev = null;
        nSig = null;
    }

    public int getiValor() {
        return iValor;
    }

    public void setiValor(int iValor) {
        this.iValor = iValor;
    }

    public Nodo getnPrev() {
        return nPrev;
    }

    public void setnPrev(Nodo nPre) {
        this.nPrev = nPre;
    }

    public Nodo getnSig() {
        return nSig;
    }

    public void setnSig(Nodo nSig) {
        this.nSig = nSig;
    }
}

class ListaDE {

    private Nodo nIni;
    private Nodo nFin;

    public ListaDE() {
        nIni = null;
        nFin = null;
    }

    public void ListaDE(Nodo nNodo) {
        nIni = nNodo;
        nFin = nNodo;
    }

    //AGREGA AL FINAL DE LA LISTA
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

    //IMPRIMIR LISTA
    public void imprimirNodos() {
        if (nIni == null) {
            System.out.println("LISTA VACIA");
        } else {
            Nodo nTemp = nIni;
            while (nTemp != null) {
                System.out.print(nTemp.getiValor() + " - ");
                nTemp = nTemp.getnSig();
            }
        }
    }

    public void imprimirNodosInv() {
        if (nIni == null) {
            System.out.println("LISTA VACIA");
        } else {
            Nodo nTemp = nFin;
            while (nTemp != null) {
                System.out.print(nTemp.getiValor() + " - ");
                nTemp = nTemp.getnPrev();
            }
        }
    }

    //CONTAR NODOS----TAMAÑO DE LA LISTA
    public int tamanoLista() {//contarNodos()
        int iCont;
        if (nIni == null) {//LISTA VACIA
            iCont = 0;
        } else {//LISTA NO VACIA
            iCont = 0;
            Nodo nTemp = nIni;//VARIABLE AUXILIAR
            while (nTemp != null) {
                iCont++;
                nTemp = nTemp.getnSig();//SE MOVERA HASTA EL NODO FINAL
            }
        }
        return iCont;
    }

    public void vaciarLista() {
        nIni = null;
    }

    public boolean listaVacia() {
        return nIni == null;
    }

    public void insertarEn(int iPos, Nodo nNodo) {
        if (iPos == 0) {
            nNodo.setnSig(nIni);
            nIni.setnPrev(nNodo);
            nIni = nNodo;
        } else if (iPos == tamanoLista()) {
            agregarNodos(nNodo);
        } else {
            int iCont = 0;
            Nodo nTemp = nIni;
            while (iCont < (iPos)) {//EN LA POSICION QUE SE QUIERE PONER
                //while (iCont < (iPos - 1)) {//LA POSICIOM ANTERIOR A LA QUE SE PIDE
                nTemp = nTemp.getnSig();//MOVERNOS POR LA LISTA
                iCont++;
            }
            //SE ENCUENTRA EN LA POSICION PREVIA POR EL WHILE
            /*nNodo.setnSig(nTemp.getnSig());
            nTemp.setnSig(nNodo);*/
            nNodo.setnSig(nTemp);
            nNodo.setnPrev(nTemp.getnPrev());
            nTemp.getnPrev().setnSig(nNodo);
            nTemp.setnPrev(nNodo);
        }
    }

    //MOSTRAR EL VALOR DEL NODO EN DETERMINADA POSICION
    public int valorEn(int iPos) throws Exception {
        if ((iPos < 0) || (iPos >= tamanoLista())) {
            throw new Exception("VALORES ERRONEOS, LA POSICION TIENE QUE SER"
                    + "MAYOR A CERO Y MENOR AL TAMAÑO DE LA LISTA");
        }
        int iCont = 0;
        int iVal = 0;
        Nodo nTemp = nIni;
        while (iCont < iPos) {
            nTemp = nTemp.getnSig();
            iCont++;
        }
        iVal = nTemp.getiValor();//SE GUARDA EL VALOR EN LA VARIABLE iVal
        return iVal;
    }

    //BUSCAR LA POSISION DE CIERTO VALOR
    public void buscarValor(int val) {
        boolean edo = false;
        Nodo Temp = nIni;
        while (Temp != null) {
            if (val == Temp.getiValor()) {
                edo = true;
            }
            Temp = Temp.getnSig();
        }
        if (edo == true) {
            int cont;
            if (nIni.getiValor() == val) {
                cont = 0;
                System.out.println("EL VALOR: " + val + " esta en la posicion: " + cont);
            } else {//if(nIni.getiVal()!=val){
                cont = 0;
                Nodo temp = nIni;
                while (temp.getiValor() != val) {
                    cont++;
                    temp = temp.getnSig();
                }
                System.out.println("EL VALOR: " + val + " esta en la posicion: " + cont);
            }
        } else {
            System.out.println("El valor no se encuentra en la lista");
        }
    }

    //ELIMINA X (EL VALOR) DE LA LISTA SI ESTA
    public void eliminarValor(int iDato) {

        boolean edo = false;
        Nodo Temp = nIni;
        while (Temp != null) {
            if (iDato == Temp.getiValor()) {
                edo = true;
            }
            Temp = Temp.getnSig();
        }

        if (edo == true) {
            int cont;
            if (nIni.getiValor() == iDato) {//SI SE ENCUENTRA EN EL PRIMER NODO
                nIni = nIni.getnSig();
                nIni.setnPrev(null);
            } else if (nFin.getiValor() == iDato) {//SI SE ENCUENTRA EN EL ULTIMO NODO
                System.out.println();
                nFin = nFin.getnPrev();
                nFin.setnSig(null);
            } else {
                //cont = 0;
                Nodo temp = nIni;
                while (temp.getiValor() != iDato) {
                    // cont++;
                    temp = temp.getnSig();
                }
                temp.getnSig().setnPrev(temp.getnPrev());
                temp.getnPrev().setnSig(temp.getnSig());
            }
        } else {
            System.out.println("El valor no se encuentra en la lista");
        }
    }

}
