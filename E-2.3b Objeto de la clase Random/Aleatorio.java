import java.util.Random;
 
public class Aleatorio {
	public static void main(String args[]) {
		Random generadorNum = new Random();
	   
		double numeroDouble = generadorNum.nextDouble();
		System.out.println("Numero double: "+numeroDouble);
	   
		System.out.println("Numero int: "+generadorNum.nextInt());
	   
		int numero0a10 = generadorNum.nextInt(11);             
		System.out.println("Numero int 0 a 10: "+numero0a10);
	   
		//int numero33a126 = generadorNum.nextInt(94);
		//numero33a126 += 33;
		//System.out.println("Numero int 33 a 126: "+numero33a126);
		System.out.print("Numero int 33 a 126: ");
		System.out.println(generadorNum.nextInt(94)+33);

		System.out.print("Caracter codigo 33 a 126: ");
		System.out.println((char)(generadorNum.nextInt(94)+33));
	   
		String mensaje = (generadorNum.nextBoolean()) ? "Cara" : "Cruz";
		System.out.println("Valor booleano: "+mensaje);
	}      
}