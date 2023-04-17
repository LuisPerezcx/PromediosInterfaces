import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Maps {
    Promediar promediar = new Promediar();
    ObtenerCalificacion obtenerCalificacion = new ObtenerCalificacion();
    ObtenerMateria obtenerMateria = new ObtenerMateria();
    public void ingresarMap(Scanner scanner) {
        Map<String, Double> miMap = new TreeMap<>();
        System.out.println("cuantos registros quieres hacer");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i=0;i<n;i++){
            System.out.println("ingresa materia y calificacion:");
            miMap.put(scanner.next(),scanner.nextDouble());
        }
        getCalfYmat(miMap);
    }
    private void getCalfYmat(Map<String, Double> miMap){
        double[] calf = obtenerCalificacion.getCalf3(miMap);
        String[] nombres = obtenerMateria.obtenerNombreMateria3(miMap);
        promediar.getPromedio(calf,nombres);
    }
}
