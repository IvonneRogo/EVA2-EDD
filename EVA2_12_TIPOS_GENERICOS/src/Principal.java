/*TIPOS GENERICOS
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
        Nodo<Integer> nNodo = new Nodo(100); //SE USA LAS CLASES PARA LOS DATOS
        System.out.println(nNodo.getValor());
        nNodo.setValor(200);

        Nodo<Double> nNodo2 = new Nodo(100.67); //SE USA LAS CLASES PARA LOS DATOS
        System.out.println(nNodo2.getValor());
        nNodo2.setValor(200.56);

    }

}

class Nodo<T> {//LA CLASE SE LA DA UN TIPO DE DATO GENERICO PARA QUE PUEDA ALMACENAR CUALQUIER TIPO
    //PUEDE GUARDAR OBJETOS DE TIPO T

    private T valor;

    public Nodo(T nuevoValor) {
        valor = nuevoValor;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }
    //CUANDO ESPECIFIQUEMOS QUE TIPO DE DATO ES, TODAS LAS T SE SUSTITUYEN POR ESE VALOR
}
