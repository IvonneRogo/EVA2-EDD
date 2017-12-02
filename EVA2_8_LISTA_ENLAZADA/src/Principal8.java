
import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 15060769
 */
public class Principal8 {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        Lista miLista = new Lista();
        miLista.imprimirLista();
        //System.out.println("La lista esta vacia = " + miLista.listaVacia());
        miLista.agregarNodo(new Nodo(100));//SE USA EL OTRO CONSTRUCTOR
        miLista.agregarNodo(new Nodo(200));
        miLista.agregarNodo(new Nodo(300));
        miLista.agregarNodo(new Nodo(400));
        miLista.agregarNodo(new Nodo(500));
        miLista.imprimirLista();
        miLista.eliminarValor(400);
        miLista.buscarValor(300);
        miLista.imprimirLista();
        System.out.println(miLista.valorEn(3));
        System.out.println("La lista esta vacia = " + miLista.listaVacia());
        miLista.vaciarLista();
        System.out.println("La lista esta vacia = " + miLista.listaVacia());

        System.out.println("LLENADO ALEATORIO");
        for (int i = 0; i < 10; i++) {
            miLista.agregarNodo(new Nodo((int) (Math.random() * 1000) + 1));
        }
        miLista.imprimirLista();
        miLista.insertarEn(0, new Nodo(999));
        miLista.imprimirLista();
        try {
            System.out.println("\nEl valor en la posicion 9 es " + miLista.valorEn(9));
        } catch (Exception ex) {
            Logger.getLogger(Principal8.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Tamaño de la lista: " + miLista.tamanoLista());
        miLista.insertarEn(11, new Nodo(444));
        miLista.imprimirLista();
        miLista.insertarEn(6, new Nodo(111));
        miLista.imprimirLista();
        miLista.buscarValor(11);
        /*
        miLista.eliminarValor(300);
        System.out.println("");
        miLista.imprimirLista();
        System.out.println(miLista.valorEn(3));
        //miLista.buscarValor(300);
        miLista.imprimirLista();
        /* System.out.println("La lista esta vacia = " + miLista.listaVacia());
        //VACIAR LISTA
        miLista.vaciarLista();
        miLista.imprimirLista();
        //LLENA ALEATORIAMENTE , CONTAR NODOS
        for (int i = 0; i < 10; i++) {
            miLista.agregarNodo(new Nodo((int) (Math.random() * 1000) + 1));
        }
        System.out.println("La lista tiene " + miLista.tamanoLista() + " de nodos");
        miLista.imprimirLista();
        System.out.println("");
        try {
            System.out.println("\nEl valor en la posicion 9 es " + miLista.valorEn(9));
        } catch (Exception ex) {
            Logger.getLogger(Principal8.class.getName()).log(Level.SEVERE, null, ex);
        }
        //AGREGAR UN NODO AL INICIO
        miLista.insertarEn(0, new Nodo(333));
        System.out.println("");
        miLista.imprimirLista();
        //AGREGAR NODO AL FINAL
        miLista.insertarEn(miLista.tamanoLista(), new Nodo(777));
        System.out.println("");
        miLista.imprimirLista();
        //AGREGAR NODO EN MEDIO DE LA LISTA
        miLista.insertarEn(8, new Nodo(234));
        System.out.println("");
        miLista.imprimirLista();*/
    }

}

class Nodo {

    private int iVal;
    private Nodo nSig;

    public Nodo() {
        iVal = 0;
        nSig = null;
    }

    public Nodo(int iValor) {
        iVal = iValor;
        nSig = null;
    }

    public Nodo(int iValor, Nodo nNodo) {
        iVal = iValor;
        nSig = nNodo;
    }

    public int getiVal() {
        return iVal;
    }

    public void setiVal(int iVal) {
        this.iVal = iVal;
    }

    public Nodo getnSig() {
        return nSig;
    }

    public void setnSig(Nodo nSig) {
        this.nSig = nSig;
    }

}

class Lista {

    private Nodo nIni;
    private Nodo nFin;

    public Lista() {
        nIni = null;
        nFin = null;
    }

    public Lista(Nodo nNodo) {
        nIni = nNodo;
        nFin = nNodo;
    }

    /*//AGREGAR NODOS--- NO FUNCIONA CUANDO SON VALORES MAYORES---TARDA MAS TIEMPO
    public void agregarNodo(Nodo nNodo) {//AGREGAR AL FINAL EL NUEVO NODO -EVITARLO COMO LA PESTE
        if (nIni == null) {
            nIni = nNodo;//CUANDO LA LISTA ESTA VACIA
        } else {//NO ESTA VACIA LA LISTA
            Nodo nTemp = nIni;
            while (nTemp.getnSig() != null) {
                nTemp = nTemp.getnSig();//MOVER nTemp HASTA QUE LLEGUE AL NODO FINAL
            }
            nTemp.setnSig(nNodo);//IGUAL AL NUEVO NODO
        }//REALIZABA LA OPERACION LA CANTIDAD DE VECES QUE SE AGREGABRA NODOS
    }*/
    //AGREGAR NODOS AL FINAL DE LA LISTA
    public void agregarNodo(Nodo nNodo) {
        if (nIni == null) {//INSERTA CUANDO LA LISTA ESTA VACIA
            nIni = nNodo;
            nFin = nNodo;
        } else {//CUANDO YA HAY NODOS
            nFin.setnSig(nNodo);//SE CAMBIA LA REFERENCIA DE SIG POR LA DIRECCION DEL NUEVO NODO
            nFin = nNodo;//CAMBIAMOS EL NODO FINAL POR EL QUE SE AGREGO
        }
    }

    //IMPRIMIR LISTA
    public void imprimirLista() {
        if (nIni == null) {
            System.out.println("LISTA VACIA");
        } else {//LISTA NO VACIA
            Nodo nTemp = nIni;//INICIAMOS LA VARIABLE QUE RECORRERA LA LISTA EN EL PRIMER NODO
            while (nTemp != null) {
                System.out.print(nTemp.getiVal() + " - ");
                nTemp = nTemp.getnSig();//TOMA LA REFERENCIA DEL NODO SIGUIENTE
            }
            System.out.println("");
        }
    }

    //VACIAR LISTA
    public void vaciarLista() {
        nIni = null;
    }

    //DEVULEVE TRUE SI LA LISTA NO ESTA VACIA
    public boolean listaVacia() {
        return nIni == null;
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
        iVal = nTemp.getiVal();//SE GUARDA EL VALOR EN LA VARIABLE iVal
        return iVal;
    }

    //INSERTAR UN NUEVO NODO EN MEDIO
    public void insertarEn(int iPos, Nodo nNodo) {
        //FALTA VALIDAR
        if (iPos == 0) {//AL INICIO DE LA LISTA
            nNodo.setnSig(nIni);//EL NUEVO NODO SE CONECTA AL PRIMER NODO DE LA LISTA
            nIni = nNodo;//EL NUEVO NODO ES EL PRIMERO
        } else if (iPos == tamanoLista()) {//AL FINAL DE LA LISTA
            agregarNodo(nNodo);
        } else {//EN MEDIO DE LA LISTA
            int iCont = 0;
            Nodo nTemp = nIni;
            while (iCont < (iPos - 1)) {//LA POSICIOM ANTERIOR A LA QUE SE PIDE
                nTemp = nTemp.getnSig();//MOVERNOS POR LA LISTA
                iCont++;
            }
            //SE ENCUENTRA EN LA POSICION PREVIA POR EL WHILE
            nNodo.setnSig(nTemp.getnSig());//nTemp es el 8, SE CONECTA EL NUEVO NODO DE LA POSICION EN DONDE SE QUIERE PONER
            nTemp.setnSig(nNodo);//CONECTAR DEL 32 AL 15
        }
    }

    //DEVUELVE LA POSICION DE UN VALOR QUE SE BUSCA
    public void buscarValor(int val) {
        boolean edo = false;
        Nodo Temp = nIni;
        while (Temp != null) {
            if (val == Temp.getiVal()) {
                edo = true;
            }
            Temp = Temp.getnSig();
        }

        if (edo == true) {
            int cont;
            if (nIni.getiVal() == val) {
                cont = 0;
                System.out.println("EL VALOR: " + val + " esta en la posicion: " + cont);
            } else {//if(nIni.getiVal()!=val){
                cont = 0;
                Nodo nTemp = nIni;
                while (nTemp.getiVal() != val) {
                    cont++;
                    nTemp = nTemp.getnSig();
                }
                System.out.println("EL VALOR: " + val + " esta en la posicion: " + cont);
            }
        } else {
            System.out.println("EL valor no se encuentra en la lista");
        }

    }

    //ELIMINA X (EL VALOR) DE LA LISTA SI ESTA
    public void eliminarValor(int iDato) {

        boolean edo = false;
        Nodo Temp = nIni;
        while (Temp != null) {
            if (iDato == Temp.getiVal()) {
                edo = true;
            }
            Temp = Temp.getnSig();
        }

        if (edo == true) {
            int cont;
            if (nIni.getiVal() == iDato) {//SI SE ENCUENTRA EN EL PRIMER NODO
                nIni = nIni.getnSig();
            } else if (nFin.getiVal() == iDato) {//SI SE ENCUENTRA EN EL ULTIMO NODO
                Nodo nTemp = nIni;
                for (int i = 0; i < (tamanoLista() - 2); i++) {
                    nTemp = nTemp.getnSig();
                }
                nTemp.setnSig(null);
                nFin = nTemp;
            } else {
                cont = 0;
                Nodo nTemp = nIni;
                while (nTemp.getiVal() != iDato) {
                    cont++;
                    nTemp = nTemp.getnSig();
                }
                Nodo nTemPre = nIni;
                for (int i = 0; i < cont - 1; i++) {
                    nTemPre = nTemPre.getnSig();
                }
                nTemPre.setnSig(nTemp.getnSig());
            }
        } else {
            System.out.println("El valor no se encuentra en la lista");
        }
    }
}
