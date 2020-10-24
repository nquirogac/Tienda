package IU;
import java.util.Scanner;
import java.util.ArrayList;

public class Interfaz {
    
    public static void iniciar(){
        System.out.println("\tBienvenido a la tienda de personajes de Disney");
    }
    public static void preguntarSeccion(){
        System.out.println("\nEscoja la opción que desea ver:\n1. Personajes de Pixar\n2. Personajes de Marvel\n3. Personajes de Star wars\n4. Salir de la tienda");
    }
    public static int responder(){
        Scanner x=new Scanner(System.in);
	int opcion = x.nextInt();
	return opcion;
    }
    public static ArrayList<Integer> responderp(){
        Scanner x=new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        System.out.println("Que productos desea escoger(elija el 0 para terminar su lista):");
        int i = -1;
        while(i!=0)
        {
            i = x.nextInt();
            if (i==0)break;
            a.add(i); 
        }
        return a;
    }
    public static void preguntarPersonaje(String clase){
        System.out.printf("\nEscoja que tipo de personaje de %s desea ver:\n1. Protagonistas de %s\n2. Antagonistas de %s\n3. Volver a la sección anterior\n4. Salir de la tienda\n",clase,clase,clase);
    }
    public static void preguntarProta(String tipo,String clase,String protagonistas[]){
        System.out.printf("\nEscoja que %s de %s desea ver:\n1. %s\n2. %s\n3. %s\n4. Si desea ver mas de 1 personaje seleccione esta opcion\n5. Volver a la sección anterior\n6. Salir de la tienda\n",tipo,clase,protagonistas[0],protagonistas[1],protagonistas[2]);
    }
    public static void preguntar(){
        System.out.println("\nEscoja una opción:\n1. Volver a la sección anterior\n2. Salir de la tienda");
    }
    
}
