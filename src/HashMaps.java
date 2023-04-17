import java.util.HashMap;
import java.util.Scanner;

public class HashMaps {
    Promediar promediar = new Promediar();
    ObtenerCalificacion obtenerCalificacion = new ObtenerCalificacion();
    ObtenerMateria obtenerMateria = new ObtenerMateria();
    public void ingresarHashMap(Scanner scanner) {
        HashMap<String, Double> miMap = new HashMap<>();
        System.out.println("cuantos registros quieres hacer");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i=0;i<n;i++){
            System.out.println("ingresa materia y calificacion:");
            miMap.put(scanner.next(),scanner.nextDouble());
        }
        getCalfYmat(miMap);
    }
    private void getCalfYmat(HashMap<String, Double> miMap){
        double[] calf = obtenerCalificacion.getCalf2(miMap);
        String[] nombres = obtenerMateria.obtenerNombreMateria2(miMap);
        promediar.getPromedio(calf,nombres);
    }
}
