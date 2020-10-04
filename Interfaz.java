package IU;
import Logic.Main;
import java.util.Scanner;

public class Interfaz {
    
    public static void iniciar(){
        System.out.println("\tBienvenido a la tienda de personajes de Disney");
    }
    public static void iniciarPixar(){
        System.out.println("\tBienvenido a la sección de Pixar");
    }
    public static void preguntarSeccion(){
        System.out.println("\nEscoja la opción que desea ver:\n1. Personajes de Pixar\n2. Personajes de Marvel\n3. Personajes de Star wars\n4. Salir de la tienda");
    }
    public static int responder(){
        Scanner x=new Scanner(System.in);
	int opcion = x.nextInt();
	return opcion;
    }
    public static void preguntarPersonajePixar(){
        System.out.println("\nEscoja que tipo de personaje de Pixar desea ver:\n1. Protagonistas de Pixar\n2. Antagonistas de Pixar\n3. Volver a la sección anterior\n4. Salir de la tienda");
    }
    public static void preguntarProtaPixar(){
        System.out.println("\nEscoja que protagonista de Pixar desea ver:\n1. Nemo\n2. Mike Wazowski\n3. Buzz Lightyear\n4. Volver a la sección anterior\n5. Salir de la tienda");
    }
    public static void preguntarAntPixar(){
        System.out.println("\nEscoja que antagonista de Pixar desea ver:\n1. Darla\n2. Randall\n3. Sid\n4. Volver a la sección anterior\n5. Salir de la tienda");
    }
    public static void preguntar(){
        System.out.println("\nEscoja una opción:\n1. Volver a la sección anterior\n2. Salir de la tienda");
    }
    
}
