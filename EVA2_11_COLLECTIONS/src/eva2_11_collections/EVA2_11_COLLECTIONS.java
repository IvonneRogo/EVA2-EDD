/*FILA, COLAS, YA EN JAVA
 */
package eva2_11_collections;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author 15060769
 */
public class EVA2_11_COLLECTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //<DATOS GENERICOS>
        ArrayList<Integer> alMiArregloLista = new ArrayList();//ARREGLO DINAMICO, PUEDE CRECER
        //AGREGAR NODOS
        alMiArregloLista.add((int) (Math.random() * 100) + 1);
        alMiArregloLista.add((int) (Math.random() * 100) + 1);
        alMiArregloLista.add((int) (Math.random() * 100) + 1);
        alMiArregloLista.add((int) (Math.random() * 100) + 1);
        alMiArregloLista.add((int) (Math.random() * 100) + 1);
        for (Integer alMiArregloLista1 : alMiArregloLista) {
            System.out.print(alMiArregloLista1 + " - ");
        }

        //INSERTAR UN VALOR EN MEDIO
        alMiArregloLista.add(2, 9999);
        System.out.println("");
        for (Integer alMiArregloLista1 : alMiArregloLista) {
            System.out.print(alMiArregloLista1 + " - ");
        }

        //SE PUEDE RECORRER CON UNA CLASE ESPECIAL
        //EL ITERATOR RECORRE LA LISTA
        System.out.println("\nRECORRIDO CON EL ITERATOR");
        Iterator itRecorreArray;
        itRecorreArray = alMiArregloLista.iterator();//MI LISTA TIENE UN OBJETO DE TIPO ITERATOR
        while (itRecorreArray.hasNext()) {//HASNEXT=HAY NODO SIGUIENTE, SI HAY CUMPLE SI NO SE TERMINO
            System.out.print(itRecorreArray.next() + " - ");//NEXT=FUNCION, NEXT SE MUEVE 
        }
    }

}
