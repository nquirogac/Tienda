package Logic;
import Data.AntagonistaPixar;
import Data.PersonajeDisney;
import Data.PersonajePixar;
import Data.ProtagonistaPixar;
import IU.Interfaz;

public class Main {
        static boolean cerrar=true;
        static boolean cerrar2=true;
    public static void main(String[] args){
        
        String pNemo[] = {"Buscando a Nemo","Buscando a Dory"};
        String hNemo[] = {"Hacerse el muerto","Chocar s aleta"};
        String pMike[] = {"Monsters inc", "Monsters University"};
        String hMike[] = {"Comediante"};
        String pbuzz[] = {"Toy story 1","Toy story 2","Toy story 3","Toy story 4"};
        String hbuzz[] = {"Caer con estilo","Rayo lazer"};
        String hdarla[] = {"Agitar a peces hasta matarlos", "Hiperactividad"};
        String hrandal[] = {"Flexibilidad","Camuflaje"};
        String hsid[] = {"Romper","Quemar","Quitar cabezas a juguetes"};
        
        ProtagonistaPixar nemo = new ProtagonistaPixar("Nemo", 7, "Animación", "Masculino", pNemo, 2003, 
                "Anémona",  "Animal", "Darla", "Escapar de la pecera y encontrar a su padre", hNemo);
        ProtagonistaPixar mike = new ProtagonistaPixar("Mike Wazowski", 30, "Animación",  "Masculino",pMike, 2001,
                "Monstruópolis", "Monstruo","Randall","Devolver a la niña a su cuarto",hMike);
        ProtagonistaPixar buzz = new ProtagonistaPixar("Buzz Lightyear",25, "Animación", "Masculino",pbuzz,1995,
                "El cuarto de Andy","Juguete","Sid","Rescatar a Woody",hbuzz);
        
        AntagonistaPixar darla = new AntagonistaPixar("Darla",9,"Animación", "Femenino", pNemo, 2003, 
                "Sydney", "Humana","Todos los peses","Agitar a peces hasta matarlos", hdarla);
        AntagonistaPixar randall = new AntagonistaPixar("Randall", 40,"Animación",  "Masculino",pMike, 2001,
                "Monstruópolis", "Monstruo","Sullivan","Ser el mejor montruo de la compañia",hrandal);
        AntagonistaPixar sid = new AntagonistaPixar("Sid", 12,"Animación", "Masculino",pbuzz,1995,
                "Casa vecina", "Humano","Juguetes","Destruir juguetes", hsid);
        
        Interfaz.iniciar();
        while (cerrar){
            Interfaz.preguntarSeccion();
            int opcion1;
            int opcion2;
            int opcion3;
            int opcion4;
            opcion1 = Interfaz.responder();
            if (opcion1 == 4){
                cerrar = false;
                break;
            }
            else{cerrar2=true;}
            while(cerrar2){
                switch (opcion1) {
                    case 1: //PIXAR
                        nemo.presentarSeccion();
                        Interfaz.preguntarPersonajePixar();
                        opcion2 = Interfaz.responder();
                        if (opcion2 == 4){
                            cerrar = false;
                            cerrar2 = false;
                            break;
                        }
                        if (opcion2 == 3){
                            cerrar2 = false;
                            break;
                        }
                        switch (opcion2) { //TIPO
                                case 1:
                                    nemo.presentarSeccion();
                                    Interfaz.preguntarProtaPixar();
                                    opcion3 = Interfaz.responder();
                                    if (opcion3 == 1){
                                        nemo.presentarPersonaje();
                                        System.out.println(nemo);
                                        Interfaz.preguntar();
                                        opcion4= Interfaz.responder();
                                        if(opcion4==1){
                                            break;
                                        }
                                        if (opcion4==2){
                                            cerrar = false;
                                            cerrar2 = false;
                                            break;
                                            }
                                    }    
                                    if (opcion3 == 2){
                                        mike.presentarPersonaje();
                                        System.out.println(mike);
                                        Interfaz.preguntar();
                                        opcion4= Interfaz.responder();
                                        if(opcion4==1){
                                            break;
                                        }
                                        if (opcion4==2){
                                            cerrar = false;
                                            cerrar2 = false;
                                            break;
                                            }
                                    }
                                    if (opcion3 == 3){
                                        buzz.presentarPersonaje();
                                        System.out.println(buzz);
                                        Interfaz.preguntar();
                                        opcion4= Interfaz.responder();
                                        if(opcion4==1){
                                            break;
                                        }
                                        if (opcion4==2){
                                            cerrar = false;
                                            cerrar2 = false;
                                            break;
                                            }    
                                    }
                                    if (opcion3 == 4){
                                        break;
                                    }
                                    if (opcion3 == 5){
                                        cerrar = false;
                                        cerrar2 = false;
                                        break;
                                    }
                                    break;
                                    
                                case 2:
                                    darla.presentarSeccion();
                                    Interfaz.preguntarAntPixar();
                                    opcion3 = Interfaz.responder();
                                    if (opcion3 == 1){
                                        darla.presentarPersonaje();
                                        System.out.println(darla);
                                        Interfaz.preguntar();
                                        opcion4= Interfaz.responder();
                                        if(opcion4==1){
                                            break;
                                        }
                                        if (opcion4==2){
                                            cerrar = false;
                                            cerrar2 = false;
                                            break;
                                            }
                                    }    
                                    if (opcion3 == 2){
                                        randall.presentarPersonaje();
                                        System.out.println(randall);
                                        Interfaz.preguntar();
                                        opcion4= Interfaz.responder();
                                        if(opcion4==1){
                                            break;
                                        }
                                        if (opcion4==2){
                                            cerrar = false;
                                            cerrar2 = false;
                                            break;
                                            }
                                    }
                                    if (opcion3 == 3){
                                        sid.presentarPersonaje();
                                        System.out.println(sid);
                                        Interfaz.preguntar();
                                        opcion4= Interfaz.responder();
                                        if(opcion4==1){
                                            break;
                                        }
                                        if (opcion4==2){
                                            cerrar = false;
                                            cerrar2 = false;
                                            break;
                                            }    
                                    }
                                    if (opcion3 == 4){
                                        break;
                                    }
                                    if (opcion3 == 5){
                                        cerrar = false;
                                        cerrar2 = false;
                                        break;
                                    }
                                break;    
                            }
                        
                    case 2:
                        break;
                    case 3:
                        
                        break;
                default: 
                    System.out.println("Error");
                    cerrar=false;
                    cerrar2=false;
                    
            } 
            
                }
                }
    }
    
}
    
