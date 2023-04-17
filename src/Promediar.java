public class Promediar {
    public void getPromedio(double [] calificacion, String [] nombres){
        Truncar truncar = new Truncar();
        int size = calificacion.length;
        double pro = 0;
        for (int i = 0; i < size; i++) {
            pro += calificacion[i] / size;
            System.out.println("Nombre de materia: " + nombres[i] + " Calificación de parcial: " + calificacion[i]);
        }
        System.out.println("El promedio del parcial es: " + truncar.truncar(pro));
    }
}
