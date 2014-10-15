import java.text.DecimalFormat;

public class FormatoNumeros {

    public static void main(String[] args) {
        DecimalFormat formatoConMilesYDecimales = new DecimalFormat("#,###.#");
        String valorConFormato = formatoConMilesYDecimales.format(398276893.23974);
        System.out.println("Muestra solo 1 decimal como maximo, con separador de miles: "+valorConFormato);
        
        DecimalFormat formatoConMoneda = new DecimalFormat("#,##0.00 €");
        valorConFormato = formatoConMoneda.format(2387.5);
        System.out.println("Formato de moneda en euros con separador de miles: "+valorConFormato);

        DecimalFormat formatoPorcentaje = new DecimalFormat("#%");
        valorConFormato = formatoPorcentaje.format(0.5);
        System.out.println("Formato de porcentaje: "+valorConFormato);
    }
}