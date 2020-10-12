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
    public static int[] responderp(int n){
        Scanner x=new Scanner(System.in);
        int a[] = new int[n];
        System.out.println("Que producto o productos desea escoger:");
        for(int i = 0; i < n; i++)
        {
            a[i] = x.nextInt();
            
        }
        return a;
    }
    public static void preguntarPersonaje(String clase){
        System.out.printf("\nEscoja que tipo de personaje de %s desea ver:\n1. Protagonistas de %s\n2. Antagonistas de %s\n3. Volver a la sección anterior\n4. Salir de la tienda\n",clase,clase,clase);
    }
    public static void preguntarProta(String clase,String protagonistas[]){
        System.out.printf("\nEscoja que protagonista de %s desea ver:\n1. %s\n2. %s\n3. %s\n4. Volver a la sección anterior\n5. Salir de la tienda\n",clase,protagonistas[0],protagonistas[1],protagonistas[2]);
    }
    public static void preguntarAnt(String clase,String antagonistas[]){
        System.out.printf("\nEscoja que antagonista de %s desea ver:\n1. %s\n2. %s\n3. %s\n4. Volver a la sección anterior\n5. Salir de la tienda\n",clase,antagonistas[0],antagonistas[1],antagonistas[2]);
    }
    public static void preguntar(){
        System.out.println("\nEscoja una opción:\n1. Volver a la sección anterior\n2. Salir de la tienda");
    }
    
}
