import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ObtenerCalificacion {
    public double[] getCalf(String[] arr) {
        int size = arr.length;
        double[] cal = new double[size];
        for (int i = 0; i < size; i++) {
            int p1 = arr[i].indexOf(" ");
            String c = arr[i].substring(p1 + 1);
            cal[i] = Double.parseDouble(c);
        }
        return cal;
    }
    public double[] getCalf1(ArrayList<String> arrList) {
        int size = arrList.size();
        double[] cal = new double[size];
        for (int i = 0; i < size; i++) {
            int p1 = arrList.get(i).indexOf(" ");
            String c = arrList.get(i).substring(p1 + 1);
            cal[i] = Double.parseDouble(c);
        }
        return cal;
    }
    public double[] getCalf2(HashMap<String, Double> miMap) {
        int size = miMap.size();
        double[] cal = new double[size];
        Double[] calificaciones = new Double[size];
        calificaciones = miMap.values().toArray(calificaciones);
        int x=0;
        for (Map.Entry<String, Double> i : miMap.entrySet()) {
            calificaciones[x] = i.getValue();
            cal[x] = calificaciones[x].doubleValue();
            x++;
        }
        return cal;
    }
    public double[] getCalf3(Map<String, Double> miMap) {
        int size = miMap.size();
        double[] cal = new double[size];
        Double[] calificaciones = new Double[size];
        calificaciones = miMap.values().toArray(calificaciones);
        int x=0;
        for (Map.Entry<String, Double> i : miMap.entrySet()) {
            calificaciones[x] = i.getValue();
            cal[x] = calificaciones[x].doubleValue();
            x++;
        }
        return cal;
    }

}
