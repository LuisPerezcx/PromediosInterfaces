import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

public class Vectors {
    Promediar promediar = new Promediar();
    ObtenerCalificacion obtenerCalificacion = new ObtenerCalificacion();
    ObtenerMateria obtenerMateria = new ObtenerMateria();
    public void vectorIngresar (Scanner scanner) {
        Vector<Materia> miVector = new Vector<>();
        System.out.println("cuantos registros quieres hacer");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i=0; i<n; i++) {
            System.out.println("ingresa la materia y calificacion:");
            String completo = scanner.nextLine();
            String mat = separarString(completo);
            double cal = separarCalf(completo);
            miVector.add(new Materia(mat,cal));
        }
        getCalfYmat(miVector);
    }
    private void getCalfYmat(Vector<Materia> miVector) {
        int size = miVector.size();
        String[] nombres = new String[size];
        double[] calf = new double[size];
        for (int i = 0; i < size; i++) {
            Materia materia = miVector.get(i);
            nombres[i] = materia.getNombre();
            calf[i] = materia.getCalificacion();
        }
        promediar.getPromedio(calf,nombres);
    }
    private String separarString(String s) {
        int espacio = s.indexOf(" ");
        return s.substring(0, espacio);
    }
    private double separarCalf(String s){
        int espacio = s.indexOf(" ");
        return Double.parseDouble(s.substring(espacio + 1));
    }

}
