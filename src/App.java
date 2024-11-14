import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        // clase scanner que nos permite que el usuario escriba
        Scanner scanner = new Scanner(System.in);

        // Declaraciones y asignaciones
        String palabraSecreta = "programador";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        // Arreglos:
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        // Estructura de control iterativa(Bucle)
        for(int i = 0; i < letrasAdivinadas.length; i++){
            letrasAdivinadas[i] = '_';
            //System.out.print(letrasAdivinadas[i]);
        }
        // Estructura de control: iterativa(Bucle)

        while(!palabraAdivinada && intentos < intentosMaximos){
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + "  (" + palabraSecreta.length() + " letras)");

            System.out.println("Introduce una letra, por favor");

            // Usamos la clase scanner para pedir una letra
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;

            // Estructura de control iterativa (Bucle)
            for(int i = 0; i < palabraSecreta.length(); i++){
                // Estructura de control condicional
                if(palabraSecreta.charAt(i) == letra){
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;

                }
            }

            if(!letraCorrecta){
                intentos++;
                System.out.println("¡Incorrecto! Te Quedan " + (intentosMaximos - intentos) + " intentos.");
            }
            
            if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                palabraAdivinada = true;
                System.out.println("¡Felicidades! Has adivinado la palabra secreta: " + palabraSecreta); 
            }
        }
        
        if(!palabraAdivinada){
            System.out.println("¡Qué pena te has quedado sin intentos! GAME OVER");
        }

        scanner.close();
    }
}
