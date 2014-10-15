import java.text.NumberFormat;

public class ConvertirNumeros {
    public static void main(String args[]) {    
		// Guardar en una variable de la clase String la cadena de caracteres: "14892".
        String cadena = "14892";
		
		// Convertir el valor de la variable anterior al tipo int, y mostrar el resultado de multiplicarlo por 2.
        int valorInt = Integer.valueOf(cadena);
        System.out.println(2 * valorInt);
        
		// Guardar en una variable de la clase String la cadena de caracteres: "34795.23".
        cadena = "34795.23";
		
		// Convertir el valor de la variable anterior al tipo double, dividirlo entre 5, 
		// mostrar el resultado de la división, y mostrar ese mismo resultado en formato de moneda
        double valorDouble = Double.valueOf(cadena) / 5;
        System.out.println("Dividido entre 5: " + valorDouble);
        
        NumberFormat formatoEuro = NumberFormat.getCurrencyInstance();  
        System.out.println("En formato euro: " + formatoEuro.format(valorDouble));
        
		// Guardar en una variable de tipo double el valor 7.
        double valor7 = 7;
		
		// Convertir el valor de la variable anterior, dividido entre 3, a la clase String. 
		// Mostrar el valor obtenido, así como su longitud en caracteres
        valorDouble =  valor7 / 3;
        cadena = String.valueOf(valorDouble);
        System.out.println("Dividir 7 entre 3: "+ cadena);
        int longitudCadena = cadena.length();
        System.out.println("Tiene de longitud: "+ longitudCadena);
    }
}