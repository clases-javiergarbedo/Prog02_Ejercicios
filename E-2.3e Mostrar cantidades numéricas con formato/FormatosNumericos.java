import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class FormatosNumericos {
	public static void main(String args[]) {
		double valor01 = 21397823.28668;
		DecimalFormat formato01 = new DecimalFormat("#.0000");
		System.out.println(formato01.format(valor01));
		
		NumberFormat formato01b = NumberFormat.getNumberInstance();
		formato01b.setMaximumFractionDigits(4);
		System.out.println(formato01b.format(valor01));
		
		double valor02 = 0.05349;
		NumberFormat formato02 = NumberFormat.getPercentInstance();
		System.out.println(formato02.format(valor02));
		
		formato02.setMinimumFractionDigits(4);
		formato02.setMaximumFractionDigits(4);
		System.out.println(formato02.format(valor02));
		
		double importeEuros = 2310.923;
		NumberFormat formatoEuro = NumberFormat.getCurrencyInstance();
		System.out.println(formatoEuro.format(importeEuros));
		//Mostrar en dólares
		double importeDolares = importeEuros * 1.3493;
		Locale inglesAmericano = new Locale("en","US");
		NumberFormat formatoDolar = NumberFormat.getCurrencyInstance(inglesAmericano);
		System.out.println(formatoDolar.format(importeDolares));
		//Mostrar en Libras
		double importeLibras = importeEuros * 0.85;
		NumberFormat formatoLibras = NumberFormat.getCurrencyInstance(new Locale("en","GB"));
		System.out.println(formatoLibras.format(importeLibras));				
	}
}