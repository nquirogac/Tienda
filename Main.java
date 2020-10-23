package Logic;

import Data.AntagonistaPixar;
import Data.PersonajeDisney;
import Data.ProtagonistaPixar;
import Data.HeroeMarvel;
import Data.HeroeStarWars;
import Data.PersonajeMarvel;
import Data.PersonajePixar;
import Data.PersonajeStarWars;
import Data.VillanoMarvel;
import Data.VillanoStarWars;

import IU.Interfaz;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Iterator;
public class Main {

    static boolean cerrar = true;
    static boolean cerrar2 = true;
    static boolean cerrar3 = true;
    static boolean cerrar4 = true;
    public static void MostrarS2(PersonajeDisney p,int o1){
        p.presentarSeccion();
        Interfaz.preguntarPersonaje(OpcionEscoger(o1));
    }
    public static void MostrarSP3(String tipo,PersonajeDisney p,int o1,String[] lista){
        p.presentarSeccion();
        Interfaz.preguntarProta(tipo,OpcionEscoger(o1),lista);
    }
    public static void MostrarSP4(PersonajeDisney p){
        p.presentarPersonaje();
        System.out.println(p);
        Interfaz.preguntar();
    }
    public static String OpcionEscoger(int opcion) {
        String clase;
        switch (opcion) {
            case 1:clase = "Pixar";
                break;
            case 2:clase = "Marvel";
                break;
            case 3:clase = "Star wars";
                break;
            default:clase = "Error";
        }
        return clase;
    }
    
    public static void main(String[] args) {

        String ProtPix[] = {"Nemo", "Mike Wazowski", "Buzz Lightyear"};
        String AntPix[] = {"Darla", "Randall", "Sid"};

        String pNemo[] = {"Buscando a Nemo", "Buscando a Dory"};
        String hNemo[] = {"Hacerse el muerto", "Chocar s aleta"};
        String pMike[] = {"Monsters inc", "Monsters University"};
        String hMike[] = {"Comediante"};
        String pbuzz[] = {"Toy story 1", "Toy story 2", "Toy story 3", "Toy story 4"};
        String hbuzz[] = {"Caer con estilo", "Rayo lazer"};
        String hdarla[] = {"Agitar a peces hasta matarlos", "Hiperactividad"};
        String hrandal[] = {"Flexibilidad", "Camuflaje"};
        String hsid[] = {"Romper", "Quemar", "Quitar cabezas a juguetes"};

        PersonajePixar nemo = new ProtagonistaPixar("Nemo", 7, "Animación", "Masculino", pNemo, 2003,
                "Anémona", "Animal", "Darla", "Escapar de la pecera y encontrar a su padre", hNemo);
        PersonajePixar mike = new ProtagonistaPixar("Mike Wazowski", 30, "Animación", "Masculino", pMike, 2001,
                "Monstruópolis", "Monstruo", "Randall", "Devolver a la niña a su cuarto", hMike);
        PersonajePixar buzz = new ProtagonistaPixar("Buzz Lightyear", 25, "Animación", "Masculino", pbuzz, 1995,
                "El cuarto de Andy", "Juguete", "Sid", "Rescatar a Woody", hbuzz);

        PersonajePixar darla = new AntagonistaPixar("Darla", 9, "Animación", "Femenino", pNemo, 2003,
                "Sydney", "Humana", "Todos los peses", "Agitar a peces hasta matarlos", hdarla);
        PersonajePixar randall = new AntagonistaPixar("Randall", 40, "Animación", "Masculino", pMike, 2001,
                "Monstruópolis", "Monstruo", "Sullivan", "Ser el mejor montruo de la compañia", hrandal);
        PersonajePixar sid = new AntagonistaPixar("Sid", 12, "Animación", "Masculino", pbuzz, 1995,
                "Casa vecina", "Humano", "Juguetes", "Destruir juguetes", hsid);

        String pThor[] = {"Thor", "Thor: The dark world", "Thor: Ragnarok", "Iron Man 2", "The Avengers",
            "Avengers: Age of Ultron", "Doctor Strange", "Avengers: Infinity War", "Avengers: Endgame"};
        String eThor[] = {"Loki", "Surtur", "Hela", "Ultron", "Doctor Doom", "Galactus", "Thanos"};
        String poThor[] = {"Fuerza sobrehumana", "Velocidad", "Resistencia", "Manipulacion del trueno"};
        String pStrange[] = {"Captain America: The Winter Soldier", "Doctor Strange", "Thor: Ragnarok", "Avengers: Infinity War", "Avengers: Endgame"};
        String eStrange[] = {"Dormammu", "Kaecilius", "Baron Mordo", "Beyonder", "Thanos"};
        String poStrange[] = {"Control de la magia", "Esperanza de vida prolongada por el Ankh de la vida", "Dueño del Ojo de Agamotto"};
        String pAraña[] = {"Iron Man 2", "Ant-Man", "Captain America: Civil War", "Spider-Man: Homecoming", "Avengers: Infinity War", "Avengers: Endgame", "Spider-Man: Far From Home"};
        String eAraña[] = {"Duende Verde", "Doctor Octopus", "Doctor Doom", "Galactus", "Thanos"};
        String poAraña[] = {"Fuerza sobrehumana", "Velocidad", "Agilidad", "Resistencia", "Equilibrio", "Sentido arácnido", "Trepar por paredes"};

        PersonajeMarvel thor = new HeroeMarvel("Thor", 1500, "Live-Action", "Masculino", pThor, 1962, "Asgard", "Asgardiano", eThor, poThor);
        PersonajeMarvel strange = new HeroeMarvel("Doctor Strange", 90, "Live-Action", "Maculino", pStrange, 1963, "La tierra", "Humano", eStrange, poStrange);
        PersonajeMarvel araña = new HeroeMarvel("Spiderman", 17, "Animado y Live-Action", "Masculino", pAraña, 1962, "La tierra", "Humano", eAraña, poAraña);

        String heroMar[] = {thor.getNombre(), strange.getNombre(), araña.getNombre()};

        String pLoki[] = {"Thor", "The Avengers", "Thor: The dark world", "Thor: Ragnarok", "Avengers: Infinity War", "Avengers: Endgame"};
        String eLoki[] = {"Thor", "Odín", "Iron Man", "Hulk", "Los Vengadores", "Nick Fury", "Thanos"};
        String poLoki[] = {"Inteligencia sobrehumana", "fuerza", "longevidad", "magia que incluye proyecciones astrales", "vuelo", "teleportación dimensional", "telepatía"};
        String pThanos[] = {"The Avengers", "Guardians of the Galaxy", "Avengers: Age of Ultron", "Thor: Ragnarok", "Avengers: Infinity War", "Avengers: Endgame"};
        String eThanos[] = {"Los Vengadores", "Guardianes de la Galaxia", "Galactus"};
        String poThanos[] = {"Inmortalidad", "Inteligencia sobrehumana", "Proyección y absorción de energía", "Inmunidad a ataques psíquicos", "Inmunidad a todas las enfermedades", "Manipulación de la materia"};
        String pUltron[] = {"Avengers: Age of Ultron"};
        String eUltron[] = {"Los VengadoresLos", "Los 4 Fantásticos"};
        String poUltron[] = {"Fuerza sobrehumana", "Inteligencia artificial con cuerpo robótico", "Resistencia extrema", "Proyección de energía", "Sus habilidades varían con cada diseño", "Vuelo"};

        PersonajeMarvel loki = new VillanoMarvel("Loki", 1052, "Live-Action", "Masculino", pLoki, 1962, "Asgard", "Gigante de Hielo", "Stan Lee, Larry Lieber y Jack Kirby", eLoki, "Ser rey de Asgard y expulsar a Thor", poLoki);
        PersonajeMarvel thanos = new VillanoMarvel("Thanos", 1000, "Live-Action", "Masculino", pThanos, 1973, "Titan", "Titan", "Jim Starlin", eThanos, "Restablecer el balance del universo", poThanos);
        PersonajeMarvel ultron = new VillanoMarvel("Ultron", 0, "Live-Action", "Masculino", pUltron, 1963, "La Tierra", "Robot",
                "Roy Thomas y John Buscema", eUltron, "Destruir a la humanidad debido a que la consideraba un peligro para si misma", poUltron);

        String villMar[] = {loki.getNombre(), thanos.getNombre(), "Ultron"};
        
        ArrayList <PersonajeMarvel> heroemarvel = new ArrayList<>();
        LinkedList <PersonajeMarvel> villanomarvel = new LinkedList<>();
        
        heroemarvel.add(thor);
        heroemarvel.add(strange);
        heroemarvel.add(araña);
        
        villanomarvel.add(loki);
        villanomarvel.add(thanos);
        villanomarvel.add(ultron);

        HashMap<Integer, PersonajePixar> protagonistaspixar = new HashMap<>();
        TreeMap<Integer, PersonajePixar> antagonistaspixar = new TreeMap<>();

        protagonistaspixar.put(1, nemo);
        protagonistaspixar.put(2, mike);
        protagonistaspixar.put(3, buzz);

        antagonistaspixar.put(1, darla);
        antagonistaspixar.put(2, randall);
        antagonistaspixar.put(3, sid);
        
        String heroStar[] = {"Han Solo", "Luke Skywalker", "Leia Organa"};
        String villStar[] = {"Darth Vader", "Jabba Desilijic Tiure", "Kylo Ren"};
            
        String pHan[]={"IV: Una nueva esperanza", "V: El Imperio contraataca", "VI: El retorno del jedi", 
        		"VII: El despertar de la fuerza", "IX: El ascenso de Skywalker", "Han Solo: una historia de Star Wars"};
        String eHan[]={"Jabba el Hutt", "Greedo", "Darth Vader", "4-LOM", "Boba Fett", "Dengar", "IG-88", "Zuckuss", "Imperio Galáctico", "Dryden Vos"};
        String haHan[]={"Precisión al disparar con pistolas bláster", "Mecánico", "Starship pilot"};
        String pLuke[]={"Star Wars: Episodio IV - Una nueva esperanza", "Star Wars: Episodio V - El Imperio contraataca",
        		"Star Wars: Episodio VI - El Regreso del Jedi", "Star Wars: Episodio III - La venganza de los Sith", 
        		"Star Wars: Episodio VII - El despertar de la Fuerza", "Star Wars: Episodio VIII - Los últimos Jedi", "Star Wars: Episodio IX - El ascenso de Skywalker"};
        String eLuke[]={"Darth Vader", "Imperio Galáctico", "Palpatine", "Jabba el Hutt", "Boba Fett", "Primera Orden"};
        String haLuke[]={"Curar con la Fuerza", "Levitación", "Espadachín", "Generar un escudo", "Crear Ilusiones", "Telapatía", "Desviar o devolver rayos de bláster a sus enemigos con su espada láser", "Absorber y disipar energía", "Rapidez"};
        String pLeia[]={"Una Nueva Esperanza", "El Imperio Contraataca", "El Regreso del Jedi", "La Venganza de los Sith",
        		"El Despertar de la Fuerza", "Rogue One: una historia de Star Wars", "Los últimos Jedi", "El ascenso de Skywalker"};
        String eLeia[]={"Wilhuff Tarkin", "Darth Vader", "4-LOM", "Jabba el Hutt", "Boba Fett", "Dengar", "IG-88", "Zuckuss", "Imperio Galáctico", "Primera Orden", "Palpatine"};
        String haLeia[]={"Generar un escudo", "Sentido de la Fuerza", "Mediadora capaz", "Precisión con pistolas bláster", "Sabe pilotear"};
        
        PersonajeStarWars han = new HeroeStarWars("Han Solo",29,"Live-Action","Masculino",pHan,1977,"Corellia","Humano",eHan,"Enfrentarse al Imperio Galáctico", haHan);
        PersonajeStarWars luke = new HeroeStarWars("Luke Skywalker",19,"Live-Action","Maculino",pLuke,1977,"Tatooine","Humano",eLuke,"Oponerse al Imperio Galáctico y restaurar la República",haLuke);
        PersonajeStarWars leia = new HeroeStarWars("Leia Organa",19,"Live-Action","Femenino",pLeia,1977,"Alderaan","Humana",eLeia,"Oponerse al Imperio Galáctico y restaurar la República",haLeia);
        
        String pDarth[]={"IV: Una nueva esperanza", "V: El Imperio contraataca", "VI: El retorno del jedi", "VII: El despertar de la fuerza", "IX: El ascenso de Skywalker", "Han Solo: una historia de Star Wars"};
        String eDarth[]={"Alianza Rebelde", "Jedi"};
        String haDarth[]={"Telequinesis", "Crear campo de Fuerza", "Encubrimiento de Fuerza", "Destrucción de Fuerza", "Pies magnéticos", "Sinergia robóica", "Respirar bajo el agua"};
        String pJabba[]={"Star Wars: Episodio IV - Una nueva esperanza", "Star Wars: Episodio VI - El Regreso del Jedi", "Star Wars: Episodio I - La amenaza fantasma"};
        String eJabba[]={"Han Solo", "Luke Skywalker", "Leia Organa", "Alianza Rebelde"};
        String haJabba[]={"Narcotraficante", "Operar y dirigir un imperio criminal", "Apetito insaciable"};
        String pKylo[]={"Star Wars Episodio VII: El Despertar de la Fuerza", "Star Wars: Episodio VIII - Los últimos Jedi", "Star Wars: Episodio IX - El ascenso de Skywalker"};
        String eKylo[]={"Resistencia"};
        String haKylo[]={"Telequinesis", "Telepatía", "Persuasión de Fuerza", "Jalar y empujar con la Fuerza", "Detectar perturbaciones en la Fuerza"};
        
        PersonajeStarWars darth = new VillanoStarWars("Darth Vader",45,"Live-Action","Masculino",pDarth,1983,"Tatooine","Cyborg-Humano",eDarth,"Cazar a todos aquellos que eran sensibles a la Fuerza en toda la galaxia",haDarth);
        PersonajeStarWars jabba = new VillanoStarWars("Jabba Desilijic Tiure",600,"Live-Action","Maculino",pJabba,1977,"Nal Hutta","Hutt",eJabba,"Hacerse más rico",haJabba);
        PersonajeStarWars kylo = new VillanoStarWars("Kylo Ren",29,"Live-Action","Masculino",pKylo,2015,"Chandrila","Crandilano",eKylo,"Destrucción de todo residuo de la doctrina Jedi",haKylo);
        
        LinkedHashSet <PersonajeStarWars> herostar = new LinkedHashSet<>();
        HashSet <PersonajeStarWars> villstar = new HashSet<>();

        herostar.add(han);
        herostar.add(luke);
        herostar.add(leia);
          
        villstar.add(darth);
        villstar.add(jabba);
        villstar.add(kylo);
        
        Interfaz.iniciar();
        while (cerrar) {
            Interfaz.preguntarSeccion();
            int opcion1;
            int opcion2;
            int opcion3;
            int opcion4;
            ArrayList<Integer> opcion5;
            int cantidadp;
            opcion1 = Interfaz.responder();
            cerrar2 = true;
            if (opcion1 == 4){
                cerrar = false;
                cerrar2 = false;
            }
            while (cerrar2) {
                PersonajeDisney p = null;
                switch(opcion1){
                    case 1:p = nemo;
                    break;
                    case 2:p = thor;
                    break;
                    case 3:p = han;
                    break;
                    default:System.out.println("Error");
                }
                MostrarS2(p,opcion1);
                opcion2 = Interfaz.responder();
                cerrar3 = true;
                if (opcion2 == 4) {
                    cerrar = false;
                    cerrar2 = false;
                    cerrar3 = false;
                }
                if (opcion2 == 3) {
                    cerrar2 = false;
                    cerrar3 = false;
                }
                while (cerrar3){
                    switch(opcion2){
                        case 1:
                            switch(opcion1){
                                case 1:
                                    for (PersonajePixar h: protagonistaspixar.values()){
                                        h.presentarPersonaje();
                                    }
                                    System.out.println();
                                    MostrarSP3("protagonista",p,opcion1,ProtPix);
                                break;
                                case 2:
                                    for (PersonajeMarvel h:heroemarvel){
                                        h.presentarPersonaje();
                                    }
                                    System.out.println();
                                    MostrarSP3("heroe",p,opcion1,heroMar);
                                break;
                                case 3:
                                    for(Iterator<PersonajeStarWars> it=herostar.iterator();it.hasNext();){
                                        PersonajeStarWars h = it.next();
                                        h.presentarPersonaje();
                                    }
                                    System.out.println();
                                    MostrarSP3("heroe",p,opcion1,heroStar);
                                break;    
                                default:System.out.println("Error");
                            }
                        break;
                        case 2:
                            switch(opcion1){
                                case 1:
                                    p = sid;
                                    for (PersonajePixar h: antagonistaspixar.values()){
                                        h.presentarPersonaje();
                                    }
                                    System.out.println();
                                    MostrarSP3("antagonista",p,opcion1,AntPix);
                                break;
                                case 2:
                                    p = loki;
                                    for (PersonajeMarvel h:villanomarvel){
                                        h.presentarPersonaje();
                                    }
                                    System.out.println();
                                    MostrarSP3("villano",p,opcion1,villMar);
                                break;
                                case 3:
                                    p = darth;
                                    for(Iterator<PersonajeStarWars> it=villstar.iterator();it.hasNext();){
                                        PersonajeStarWars h = it.next();
                                        h.presentarPersonaje();
                                    }
                                    System.out.println();
                                    MostrarSP3("villano",p,opcion1,villStar);
                                break;   
                                default:System.out.println("Error");
                            }
                        break;
                        default:System.out.println("Error");
                    }
                    opcion3 = Interfaz.responder();
                    cerrar4 = true;
                    
                    if (opcion3 == 5){
                        cerrar3 = false;
                        cerrar4 = false;
                    }
                    if (opcion3 == 6){
                        cerrar = false;
                        cerrar2 = false;
                        cerrar3 = false;
                        cerrar4 = false;
                    }
                    while (cerrar4){
                        switch(opcion1){
                            case 1:
                                switch(opcion2){
                                    case 1:
                                        switch(opcion3){
                                            case 1:MostrarSP4(nemo);
                                            break;
                                            case 2:MostrarSP4(mike);
                                            break;
                                            case 3:MostrarSP4(buzz);
                                            break;
                                            case 4:
                                                opcion5 = Interfaz.responderp();
                                                for (Integer h:opcion5){
                                                    MostrarSP4(protagonistaspixar.get(h));
                                                }
                                            break;
                                            default:System.out.println("Error");
                                        }
                                    break;
                                    case 2:
                                        switch(opcion3){
                                            case 1:MostrarSP4(darla);
                                            break;
                                            case 2:MostrarSP4(randall);
                                            break;
                                            case 3:MostrarSP4(sid);
                                            break;
                                            case 4:
                                                opcion5 = Interfaz.responderp();
                                                for (Integer h:opcion5){
                                                    MostrarSP4(antagonistaspixar.get(h));
                                                }
                                            break;
                                            default:System.out.println("Error");
                                        }
                                }
                            break;
                            case 2:
                                switch(opcion2){
                                    case 1:
                                        switch(opcion3){
                                            case 1:MostrarSP4(thor);
                                            break;
                                            case 2:MostrarSP4(strange);
                                            break;
                                            case 3:MostrarSP4(araña);
                                            break;
                                            case 4:
                                                opcion5 = Interfaz.responderp();
                                                for (Integer h:opcion5){
                                                    MostrarSP4(heroemarvel.get(h-1));
                                                }
                                            break;
                                            default:System.out.println("Error");
                                        }
                                    break;
                                    case 2:
                                        switch(opcion3){
                                            case 1:MostrarSP4(loki);
                                            break;
                                            case 2:MostrarSP4(thanos);
                                            break;
                                            case 3:MostrarSP4(ultron);
                                            break;
                                            case 4:
                                                opcion5 = Interfaz.responderp();
                                                for (Integer h:opcion5){
                                                    MostrarSP4(villanomarvel.get(h-1));
                                                }
                                            break;
                                            default:System.out.println("Error");
                                        }
                                }
                            break;
                            case 3:
                                switch(opcion2){
                                    case 1:
                                        switch(opcion3){
                                            case 1:MostrarSP4(han);
                                            break;
                                            case 2:MostrarSP4(luke);
                                            break;
                                            case 3:MostrarSP4(leia);
                                            break;
                                            case 4:
                                                System.out.println("No esta disponible esta opcion");
                                                Interfaz.preguntar();
                                            break;    
                                            default:System.out.println("Error");
                                        }
                                    break;
                                    case 2:
                                        switch(opcion3){
                                            case 1:MostrarSP4(darth);
                                            break;
                                            case 2:MostrarSP4(jabba);
                                            break;
                                            case 3:MostrarSP4(kylo);
                                            break;
                                            case 4:
                                                System.out.println("No esta disponible esta opcion");
                                                Interfaz.preguntar();
                                            break; 
                                            default:System.out.println("Error");
                                        }
                                }
                            break;
                            default:System.out.println("Error");
                        }
                        opcion4 = Interfaz.responder();
                        if (opcion4 == 1)cerrar4 = false;
                        if (opcion4 == 2){
                            cerrar = false;
                            cerrar2 = false;
                            cerrar3 = false;
                            cerrar4 =false;
                        }
                    }
                }
            }
        }
    }
}
