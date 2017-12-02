/*ORDENAR OBJETOS, DAMOS LOS PARAMETROS PARA EL ORDENAMIENTO
*EDAD, SALARIO, APELLIDO-EDAD, APELLIDO (TODAS LAS LETRAS)
*
*SI REGRESA NEGATIVO LA EDAD DEL OBJETO 2 ES MAYOR AL 1
*SI REGRESA POSITIVO LA EDAD DEL OBJETO 1 ES MAYOR
*REGRESA NEUTRO SON IGUALES
 */
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 *
 * @author 15060769
 */
public class Principal17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<Persona> listaPersona = new LinkedList();
        listaPersona.add(new Persona("Ivonne", "Rogo", 20, 900, false));
        listaPersona.add(new Persona("Clarita", "Porras", 23, 500, false));
        listaPersona.add(new Persona("Sandra", "Silva", 30, 3000, false));
        listaPersona.add(new Persona("Alan", "Silvia", 20, 0.0, true));
        listaPersona.add(new Persona("Francisco", "Roeyes", 22, 2000, true));
        for (Persona listaPer : listaPersona) {
            System.out.println("Nombre: " + listaPer.getsNombre() + "\n"
                    + "Apellido: " + listaPer.getsApellido() + "\n"
                    + "Edad: " + listaPer.getiEdad() + "\n"
                    + "Salario: " + listaPer.getdSalario() + "\n"
                    + "Sexo: " + listaPer.isbSexo() + "\n");
        }

        //ORDENAR POR EDAD
        System.out.println("------------------------ORDENAR POR EDAD------------------------");
        Comparator cMiOrdenPer = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Persona p1, p2;
                p1 = (Persona) o1;
                p2 = (Persona) o2;
                //ORDENAR POR EDAD
                int iEd1, iEd2;
                iEd1 = p1.getiEdad();
                iEd2 = p2.getiEdad();
                return iEd1 - iEd2;
            }
        };
        Collections.sort(listaPersona, cMiOrdenPer);
        for (Persona llListaPer1 : listaPersona) {
            System.out.println("Nombre: " + llListaPer1.getsNombre() + "\n"
                    + "Apellido: " + llListaPer1.getsApellido() + "\n"
                    + "Edad: " + llListaPer1.getiEdad() + "\n"
                    + "Salario: " + llListaPer1.getdSalario() + "\n"
                    + "Sexo: " + llListaPer1.isbSexo() + "\n");
        }
        //TERMINA POR EDAD

        //ORDENAR POR SALARIO
        System.out.println("------------------------ORDENAR POR SALARIO------------------------");
        Comparator cMiOrdenPerSa = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Persona p1, p2;
                p1 = (Persona) o1;
                p2 = (Persona) o2;
                //ORDENAR POR SALARIO
                double iEd1, iEd2;
                iEd1 = p1.getdSalario();
                iEd2 = p2.getdSalario();
                return (int) (iEd1 - iEd2);
            }
        };
        Collections.sort(listaPersona, cMiOrdenPerSa);
        for (Persona llListaPer1 : listaPersona) {
            System.out.println("Nombre: " + llListaPer1.getsNombre() + "\n"
                    + "Apellido: " + llListaPer1.getsApellido() + "\n"
                    + "Edad: " + llListaPer1.getiEdad() + "\n"
                    + "Salario: " + llListaPer1.getdSalario() + "\n"
                    + "Sexo: " + llListaPer1.isbSexo() + "\n");
        }
        //TERMINA POR SALARIO

        //ORDENAR POR APELLIDO Y EDAD
        System.out.println("------------------------ORDENAR POR APELLIDO Y EDAD------------------------");
        Comparator cOrdeApeEdad = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Persona p1, p2;
                p1 = (Persona) o1;
                p2 = (Persona) o2;
                //ORDENAR POR EDAD
                char c1, c2;
                c1 = p1.getsApellido().charAt(0);
                c2 = p2.getsApellido().charAt(0);
                int Ape = c1 - c2;
                if (Ape == 0) {
                    int iEd1, iEd2;
                    iEd1 = p1.getiEdad();
                    iEd2 = p2.getiEdad();
                    return iEd1 - iEd2;
                } else {
                    return Ape;
                }
            }
        };
        Collections.sort(listaPersona, cOrdeApeEdad);
        for (Persona llListaPer1 : listaPersona) {
            System.out.println("Nombre: " + llListaPer1.getsNombre() + "\n"
                    + "Apellido: " + llListaPer1.getsApellido() + "\n"
                    + "Edad: " + llListaPer1.getiEdad() + "\n"
                    + "Salario: " + llListaPer1.getdSalario() + "\n"
                    + "Sexo: " + llListaPer1.isbSexo() + "\n");
        }
        //TERMINA POR APELLIDO Y EDAD

        //ORDENAR POR APELLIDO LETRA POR LETRA
        System.out.println("------------------------ORDENAR POR APELLIDO LETRA POR LETRA------------------------");
        Comparator cOrdeApelliLeXLe = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Persona p1, p2;
                p1 = (Persona) o1;
                p2 = (Persona) o2;
                //GUARDA LAS LETRAS
                char c1, c2;
                c1 = p1.getsApellido().charAt(0);
                c2 = p2.getsApellido().charAt(0);

                int Ape = c1 - c2;

                if (Ape == 0) {
                    int i = 1;
                    while (Ape == 0) {
                        c1 = p1.getsApellido().charAt(i);
                        c2 = p2.getsApellido().charAt(i);
                        i++;
                        Ape = c1 - c2;
                    }
                    return Ape;
                } else {
                    return Ape;
                }
            }
        };
        Collections.sort(listaPersona, cOrdeApelliLeXLe);
        for (Persona llListaPer1 : listaPersona) {
            System.out.println("Nombre: " + llListaPer1.getsNombre() + "\n"
                    + "Apellido: " + llListaPer1.getsApellido() + "\n"
                    + "Edad: " + llListaPer1.getiEdad() + "\n"
                    + "Salario: " + llListaPer1.getdSalario() + "\n"
                    + "Sexo: " + llListaPer1.isbSexo() + "\n");
        }
    }

}

class Persona {

    private String sNombre;
    private String sApellido;
    private int iEdad;
    private double dSalario;
    private boolean bSexo;

    public Persona(String sNom, String sApe, int iEd, double dSal, boolean bSex) {
        sNombre = sNom;
        sApellido = sApe;
        iEdad = iEd;
        dSalario = dSal;
        bSexo = bSex;
    }

    public Persona() {
        sNombre = "";
        sApellido = "";
        iEdad = 0;
        dSalario = 0;
        bSexo = false;
    }

    public String getsNombre() {
        return sNombre;
    }

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public String getsApellido() {
        return sApellido;
    }

    public void setsApellido(String sApellido) {
        this.sApellido = sApellido;
    }

    public int getiEdad() {
        return iEdad;
    }

    public void setiEdad(int iEdad) {
        this.iEdad = iEdad;
    }

    public double getdSalario() {
        return dSalario;
    }

    public void setdSalario(double dSalario) {
        this.dSalario = dSalario;
    }

    public boolean isbSexo() {
        return bSexo;
    }

    public void setbSexo(boolean bSexo) {
        this.bSexo = bSexo;
    }

}
