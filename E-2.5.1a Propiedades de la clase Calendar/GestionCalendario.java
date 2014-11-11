import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class GestionCalendario {

	public static void main(String args[]) {
		Calendar calendario = Calendar.getInstance();
		//Incrementa la hora obtenida en dos horas, usando el método add
		calendario.add(Calendar.HOUR_OF_DAY, 2);
		//Cambia los minutos, asignando el valor 30 con el método set
		calendario.set(Calendar.MINUTE, 30);
		//Cambia la fecha a "11/12/2013"
		calendario.set(2013, Calendar.DECEMBER, 11);
		//Muestra la fecha resultante con el formato: dd-mm-aa y la hora como hh:mm:ss
		//	extrayendo el valor de cada campo
		String fecha = "";
		fecha += calendario.get(Calendar.DAY_OF_MONTH);
		fecha += "-";
		fecha += calendario.get(Calendar.MONTH)+1;
		fecha += "-";
		fecha += calendario.get(Calendar.YEAR);
		fecha += " ";
		fecha += calendario.get(Calendar.HOUR_OF_DAY);
		fecha += ":";
		fecha += calendario.get(Calendar.MINUTE);
		fecha += ":";
		fecha += calendario.get(Calendar.SECOND);
		System.out.println(fecha);
		//Muestra también la fecha resultante usando la clase DateFormat con el formato FULL
		DateFormat formatoFecha = DateFormat.getDateInstance(DateFormat.FULL);		
		System.out.println(formatoFecha.format(calendario.getTime()));
		//Usando la clase SimpleDateFormat para mostrar con un formato personalizado
		SimpleDateFormat formatoFecha2 = new SimpleDateFormat(
			"'Son las 'HH' horas y 'mm' minutos del día 'dd' del mes de 'MMMM' del año 'yyyy");
		System.out.println(formatoFecha2.format(calendario.getTime()));
	}
}