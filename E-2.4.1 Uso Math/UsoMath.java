public class UsoMath {

    public static void main(String[] args) {
        //Obtener un valor aleatorio entre -100 y 100
        double valor = Math.random()*200-100;
        double resultado;
        
        //Crear el objeto que permite dar formato a los valores
        NumberFormat formateador = NumberFormat.getNumberInstance();
        formateador.setMaximumFractionDigits(3);
        
        //Mostrar el valor generado
        System.out.println("Valor generado: "+formateador.format(valor));
        
        //Calcular y mostrar el valor absoluto
        resultado = Math.abs(valor);
        System.out.println("Valor absoluto: "+formateador.format(resultado));
        
        //Calcular y mostrar el entero posterior
        resultado = Math.ceil(valor);
        System.out.println("Valor entero posterior: "+formateador.format(resultado));
        
        //Calcular y mostrar el entero anterior
        resultado = Math.floor(valor);
        System.out.println("Valor entero anterior: "+formateador.format(resultado));
        
        //Calcular y mostrar el valor redondeado al entero más cercano
        resultado = Math.round(valor);
        System.out.println("Valor redondeado: "+formateador.format(resultado));
        
        //Calcular y mostrar el resultado del coseno
        resultado = Math.cos(valor);
        System.out.println("Coseno: "+formateador.format(resultado));
        
        //Calcular y mostrar el resultado del seno
        resultado = Math.sin(valor);
        System.out.println("Seno: "+formateador.format(resultado));
        
        //Calcular y mostrar el resultado de la tangente
        resultado = Math.tan(valor);
        System.out.println("Tangente: "+formateador.format(resultado));
    }
}