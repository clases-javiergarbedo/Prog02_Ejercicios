public class CadenasCaracteres {
	public static void main(String args[]) {
		String cadena = "Cadena de prueba";
		System.out.println(cadena.charAt(2));
		System.out.println(cadena.concat(" para ejercicios"));
		System.out.println(cadena.compareTo("Saludo"));
		System.out.println(cadena.equals("CADENA DE PRUEBA"));
		System.out.println(cadena.equalsIgnoreCase("CADENA DE PRUEBA"));
		System.out.println(cadena.length());
		System.out.println(cadena.replace('a','o'));
		System.out.println(cadena.substring(10,16));
		System.out.println(cadena.toUpperCase());
	}
}