package ejercicio1;

public class Ejercicio1 {

    public static void main(String[] args) {

        LT lector = new LT();
        System.out.println("Introduce un caracter: ");
        char letra = lector.leerCaracter();        

        while (letra != '.') {
            
            if (letra >= 49 && letra <= 57) { 
                int valor = Character.getNumericValue(letra);              
                valor = valor +'a';               
            
                System.out.println((char)valor);
                letra = lector.leerCaracter();
            } else {
                System.out.println(letra);
                letra = lector.leerCaracter();
            }

        }

    }
}
