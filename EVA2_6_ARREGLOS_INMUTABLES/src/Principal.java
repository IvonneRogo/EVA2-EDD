/*CUANDO SE QUIERE HACER MAS GRANDE UN ARREGLO, PERO SE TIENE QUE CREAR UNA COPIA PARA QUE LOS VALORES SE SALVEN
Y VOLVER A GUARDAR EN EL ARREGLO ORIGINAL
4
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
        int[] aiDatos = new int[3];
        aiDatos[0] = 100;
        aiDatos[1] = 200;
        aiDatos[2] = 300;
        for (int aiDato : aiDatos) {
            System.out.print(aiDato + " - ");
        }
        System.out.println("");
        int[] aiCopia = new int[3];//RESPALDAR DATOS
        for (int i = 0; i < aiDatos.length; i++) {
            aiCopia[i] = aiDatos[i];
        }
        aiDatos = new int[4];
        //RESTAURAMOS LOS DATOS
        for (int i = 0; i < aiCopia.length; i++) {
            aiDatos[i] = aiCopia[i];
        }
        for (int aiDato : aiDatos) {
            System.out.print(aiDato + " - ");
        }
    }

}
