import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ObtenerMateria {
    public String[] obtenerNombreMateria(String[] arr) {
        int size = arr.length;
        String[] mat = new String[size];
        for (int i = 0; i < size; i++) {
            int p1 = arr[i].indexOf(" ");
            String c = arr[i].substring(0, p1);
            mat[i] = c;
        }
        return mat;
    }
    public String[] obtenerNombreMateria1(ArrayList<String> arrList) {
        int size = arrList.size();
        String[] mat = new String[size];
        for (int i = 0; i < size; i++) {
            int p1 = arrList.get(i).indexOf(" ");
            String c = arrList.get(i).substring(0, p1);
            mat[i] = c;
        }
        return mat;
    }

    public String[] obtenerNombreMateria2(HashMap<String, Double> miMap) {
        int size = miMap.size();
        String[] materias = new String[size];
        materias = miMap.keySet().toArray(materias);
        int x=0;
        for (Map.Entry<String, Double> i : miMap.entrySet()) {
            materias[x] = String.valueOf(i.getKey());
            x++;
        }
        return materias;
    }
    public String[] obtenerNombreMateria3(Map<String, Double> miMap) {
        int size = miMap.size();
        String[] materias = new String[size];
        materias = miMap.keySet().toArray(materias);
        int x=0;
        for (Map.Entry<String, Double> i : miMap.entrySet()) {
            materias[x] = String.valueOf(i.getKey());
            x++;
        }
        return materias;
    }
}
