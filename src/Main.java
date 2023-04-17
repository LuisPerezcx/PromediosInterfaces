import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menus menus = new Menus();
        SetCalf setCalf = new SetCalf();
        Scanner scanner = new Scanner(System.in);
        ObtenerCalificacion obtenerCalificacion = new ObtenerCalificacion();
        ObtenerMateria obtenerMateria = new ObtenerMateria();
        Promediar promediar = new Promediar();
        ArrayList arrayList = new ArrayList();
        HashMaps hashMaps = new HashMaps();
        Vectors vectors = new Vectors();
        Maps maps = new Maps();

        int opc = 0;

        while (opc!=6){
            opc = menus.menu(scanner);
            switch (opc){
                case 1:
                    System.out.println("- ARRAY -");
                    String[] materiaCalf = new String[menus.setTamArreglo(scanner)];
                    setCalf.ingresarCalf(materiaCalf,scanner);
                    double[] calf = obtenerCalificacion.getCalf(materiaCalf);
                    String[] nombres = obtenerMateria.obtenerNombreMateria(materiaCalf);
                    promediar.getPromedio(calf,nombres);
                    break;
                case 2:
                    System.out.println("- ARRAY LIST -");
                    arrayList.arrayListIngresar();
                break;
                case 3:
                    System.out.println("- MAPS -");
                    maps.ingresarMap(scanner);
                    break;
                case 4:
                    System.out.println("- HASH MAPS -");
                    hashMaps.ingresarHashMap(scanner);
                    break;
                case 5:
                    System.out.println("- VECTOR -");
                    vectors.vectorIngresar(scanner);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + opc);
            }
        }
    }

}