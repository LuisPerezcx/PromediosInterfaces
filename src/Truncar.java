import java.text.DecimalFormat;

public class Truncar {
    public String truncar(double numero) {
        DecimalFormat df = new DecimalFormat("#.0");
        return df.format(numero);
    }
}
