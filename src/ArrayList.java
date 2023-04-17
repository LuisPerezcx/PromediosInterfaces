import java.util.Scanner;

public class ArrayList {
    Promediar promediar = new Promediar();
    ObtenerCalificacion obtenerCalificacion = new ObtenerCalificacion();
    ObtenerMateria obtenerMateria = new ObtenerMateria();
    Scanner scanner = new Scanner(System.in);

    public void arrayListIngresar(){
        java.util.ArrayList<String> matYcalf = new java.util.ArrayList<>();
        System.out.println("cuantos registros quieres hacer");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i=0;i<n;i++){
            System.out.println("ingresa materia y calificacion");
            matYcalf.add(scanner.nextLine());
        }
        getCalfYmat (matYcalf);
    }
    private void getCalfYmat(java.util.ArrayList<String> matYcalf){
        double[] calf = obtenerCalificacion.getCalf1(matYcalf);
        String[] nombres = obtenerMateria.obtenerNombreMateria1(matYcalf);
        promediar.getPromedio(calf,nombres);
    }
}