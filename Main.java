package Logic;
import Data.AntagonistaPixar;
//import Data.PersonajeDisney;
//import Data.PersonajePixar;
import Data.ProtagonistaPixar;
import Data.HeroeMarvel;
import Data.VillanoMarvel;
import Data.HeroeStarWars;
import Data.VillanoStarWars;
import IU.Interfaz;

public class Main {
        static boolean cerrar=true;
        static boolean cerrar2=true;
    public static String OpcionEscoger(int opcion){
        String clase;
        switch (opcion){
            case 1:
                clase="Pixar";
            break;
            case 2:
                clase="Marvel";
            break;
            case 3:
                clase="Star wars";
            break;
            default:
                clase="Error";
        }
        return clase;
    }
    public static void main(String[] args){
        
        String ProtPix[] = {"Nemo","Mike Wazowski","Buzz Lightyear"};
        String AntPix[] = {"Darla","Randall","Sid"};
        
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
        
        String pThor[]={"Thor","Thor: The dark world","Thor: Ragnarok","Iron Man 2","The Avengers",
            "Avengers: Age of Ultron","Doctor Strange","Avengers: Infinity War","Avengers: Endgame"};
        String eThor[]={"Loki", "Surtur", "Hela", "Ultron", "Doctor Doom", "Galactus", "Thanos"};
        String poThor[]={"Fuerza sobrehumana","Velocidad","Resistencia","Manipulacion del trueno"};
        String pStrange[]={"Captain America: The Winter Soldier","Doctor Strange","Thor: Ragnarok","Avengers: Infinity War","Avengers: Endgame"};
        String eStrange[]={"Dormammu", "Kaecilius", "Baron Mordo", "Beyonder", "Thanos"};
        String poStrange[]={"Control de la magia","Esperanza de vida prolongada por el Ankh de la vida","Dueño del Ojo de Agamotto"};
        String pAraña[]={"Iron Man 2","Ant-Man","Captain America: Civil War","Spider-Man: Homecoming","Avengers: Infinity War","Avengers: Endgame","Spider-Man: Far From Home"};
        String eAraña[]={"Duende Verde","Doctor Octopus","Doctor Doom","Galactus", "Thanos"};
        String poAraña[]={"Fuerza sobrehumana", "Velocidad", "Agilidad", "Resistencia", "Equilibrio","Sentido arácnido","Trepar por paredes"};
     
        HeroeMarvel thor = new HeroeMarvel("Thor",1500,"Live-Action","Masculino",pThor,1962,"Asgard","Asgardiano",eThor,poThor);
        HeroeMarvel strange = new HeroeMarvel("Doctor Strange",90,"Live-Action","Maculino",pStrange,1963,"La tierra","Humano",eStrange,poStrange);
        HeroeMarvel araña = new HeroeMarvel("Spiderman",17,"Animado y Live-Action","Masculino",pAraña,1962,"La tierra","Humano",eAraña,poAraña);
        
        String heroMar[]={thor.getNombre(),strange.getNombre(),araña.getNombre()};
        
        String pLoki[]={"Thor","The Avengers","Thor: The dark world","Thor: Ragnarok","Avengers: Infinity War","Avengers: Endgame"};
        String eLoki[]={"Thor", "Odín", "Iron Man", "Hulk", "Los Vengadores", "Nick Fury", "Thanos"};
        String poLoki[]={"Inteligencia sobrehumana", "fuerza", "longevidad", "magia que incluye proyecciones astrales", "vuelo","teleportación dimensional","telepatía"};
        String pThanos[]={"The Avengers","Guardians of the Galaxy","Avengers: Age of Ultron","Thor: Ragnarok","Avengers: Infinity War","Avengers: Endgame"};
        String eThanos[]={"Los Vengadores", "Guardianes de la Galaxia", "Galactus"};
        String poThanos[]={"Inmortalidad","Inteligencia sobrehumana","Proyección y absorción de energía","Inmunidad a ataques psíquicos","Inmunidad a todas las enfermedades","Manipulación de la materia"};
        String pUltron[]={"Avengers: Age of Ultron"};
        String eUltron[]={"Los VengadoresLos","Los 4 Fantásticos"};
        String poUltron[]={"Fuerza sobrehumana","Inteligencia artificial con cuerpo robótico","Resistencia extrema","Proyección de energía","Sus habilidades varían con cada diseño","Vuelo"};
        
        VillanoMarvel loki= new VillanoMarvel("Loki",1052,"Live-Action","Masculino",pLoki,1962,"Asgard","Gigante de Hielo","Stan Lee, Larry Lieber y Jack Kirby",eLoki,"Ser rey de Asgard y expulsar a Thor",poLoki);
        VillanoMarvel thanos= new VillanoMarvel("Thanos",1000,"Live-Action","Masculino",pThanos,1973,"Titan","Titan","Jim Starlin",eThanos,"Restablecer el balance del universo",poThanos);
        VillanoMarvel ultron= new VillanoMarvel("Ultron",0,"Live-Action","Masculino",pUltron,1963,"La Tierra","Robot",
        "Roy Thomas y John Buscema",eUltron,"Destruir a la humanidad debido a que la consideraba un peligro para si misma",poUltron);
        
        String villMar[]={loki.getNombre(),thanos.getNombre(),"Ultron"};
            
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
        
        HeroeStarWars han = new HeroeStarWars("Han Solo",29,"Live-Action","Masculino",pHan,1977,"Corellia","Humano",eHan,"", haHan);
        HeroeStarWars luke = new HeroeStarWars("Luke Skywalker",19,"Live-Action","Maculino",pLuke,1977,"Tatooine","Humano",eLuke,"Proteger el lado luminoso de la Fuerza",haLuke);
        HeroeStarWars leia = new HeroeStarWars("Leia Organa",19,"Live-Action","Femenino",pLeia,1977,"Alderaan","Humana",eLeia,"",haLeia);
        
        String pDarth[]={"IV: Una nueva esperanza", "V: El Imperio contraataca", "VI: El retorno del jedi", "VII: El despertar de la fuerza", "IX: El ascenso de Skywalker", "Han Solo: una historia de Star Wars"};
        String eDarth[]={"Alianza Rebelde", "Jedi"};
        String haDarth[]={"Telequinesis", "Crear campo de Fuerza", "Encubrimiento de Fuerza", "Destrucción de Fuerza", "Pies magnéticos", "Sinergia robóica", "Respirar bajo el agua"};
        String pJabba[]={"Star Wars: Episodio IV - Una nueva esperanza", "Star Wars: Episodio VI - El Regreso del Jedi", "Star Wars: Episodio I - La amenaza fantasma"};
        String eJabba[]={"Han Solo", "Luke Skywalker", "Leia Organa", "Alianza Rebelde"};
        String haJabba[]={"Narcotraficante", "Operar y dirigir un imperio criminal", "Apetito insaciable"};
        String pKylo[]={"Star Wars Episodio VII: El Despertar de la Fuerza", "Star Wars: Episodio VIII - Los últimos Jedi", "Star Wars: Episodio IX - El ascenso de Skywalker"};
        String eKylo[]={"Resistencia"};
        String haKylo[]={"Telequinesis", "Telepatía", "Persuasión de Fuerza", "Jalar y empujar con la Fuerza", "Detectar perturbaciones en la Fuerza"};
        
        VillanoStarWars darth = new VillanoStarWars("Darth Vader",45,"Live-Action","Masculino",pDarth,1983,"Tatooine","Cyborg-Humano",eDarth,"Cazar a todos aquellos que eran sensibles a la Fuerza en toda la galaxia",haDarth);
        VillanoStarWars jabba = new VillanoStarWars("Jabba Desilijic Tiure",600,"Live-Action","Maculino",pJabba,1977,"Nal Hutta","Hutt",eJabba,"",haJabba);
        VillanoStarWars kylo = new VillanoStarWars("Kylo Ren",29,"Live-Action","Masculino",pKylo,2015,"Chandrila","Crandilano",eKylo,"Destrucción de todo residuo de la doctrina Jedi",haKylo);
        
        HashMap<String,PersonajePixar> protagonistaspixar = new HashMap<String, PersonajePixar>();
        TreeMap<String,PersonajePixar> antagonistaspixar = new TreeMap<String, PersonajePixar >();
        
        protagonistaspixar.put("Nemo", nemo);
        protagonistaspixar.put("Mike", mike);
        protagonistaspixar.put("Buzz", buzz);
        

        antagonistaspixar.put("Darla", darla);
        antagonistaspixar.put("Randall", randall);
        antagonistaspixar.put("Sid", sid);    
            
        Interfaz.iniciar();
        while (cerrar){
            Interfaz.preguntarSeccion();
            int opcion1;
            int opcion2;
            int opcion3;
            int opcion4;
            int[] opcion5;
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
                        Interfaz.preguntarPersonaje(OpcionEscoger(opcion1));
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
                                    for(PersonajePixar p: protagonistaspixar.values())
                                    {
                                	p.presentarPersonaje();
                                    }
                                    Interfaz.preguntarPPixar();
                                    opcion3 = Interfaz.responder();
                                    if (opcion3 == 4){
                                        break;
                                    }
                                    if (opcion3 == 5){
                                        cerrar = false;
                                        cerrar2 = false;
                                        break;
                                    }
                                    if (opcion3==1){
                                        Interfaz.preguntarProta(OpcionEscoger(opcion1),propix);
                                        opcion5 = Interfaz.responderp(1);
                                        if(opcion5[0]==1){
                                            System.out.println(protagonistaspixar.get("Nemo"));
                                            Interfaz.preguntar();
                                            opcion4=Interfaz.responder();
                                            if(opcion4==1){break;}
                                            if (opcion4==2){
                                                cerrar = false;
                                                cerrar2 = false;
                                                break;}
                                        }
                                        if(opcion5[0]==2){
                                            System.out.println(protagonistaspixar.get("Mike"));
                                            Interfaz.preguntar();
                                            opcion4=Interfaz.responder();
                                            if(opcion4==1){break;}
                                            if (opcion4==2){
                                                cerrar = false;
                                                cerrar2 = false;
                                                break;}
                                        }
                                        if(opcion5[0]==3){
                                            System.out.println(protagonistaspixar.get("Buzz"));
                                            Interfaz.preguntar();
                                            opcion4=Interfaz.responder();
                                            if(opcion4==1){break;}
                                            if (opcion4==2){
                                                cerrar = false;
                                                cerrar2 = false;
                                                break;}
                                        }
                                        else{System.out.println("Error");break;}
                                    }
                                    if(opcion3==2){
                                        Interfaz.preguntarProta(OpcionEscoger(opcion1),propix);
                                        opcion5 = Interfaz.responderp(2);
                                        for(int i : opcion5){
                                            if(i==1){
                                                System.out.println(protagonistaspixar.get("Nemo")+"\n");
                                                continue;
                                            }
                                            if(i==2){
                                                System.out.println(protagonistaspixar.get("Mike")+"\n");
                                                continue;
                                            }
                                            if(i==3){
                                                System.out.println(protagonistaspixar.get("Buzz")+"\n");
                                            }
                                            else{
                                                System.out.println(i);
                                                System.out.println("Error");
                                            }
                                            
                                        }
                                        Interfaz.preguntar();
                                        opcion4=Interfaz.responder();
                                        if(opcion4==1){break;}
                                        if (opcion4==2){
                                            cerrar = false;
                                            cerrar2 = false;
                                            break;}
                                    }
                                    if(opcion3==3){
                                        System.out.println(protagonistaspixar.get("Nemo")+"\n");
                                        System.out.println(protagonistaspixar.get("Mike")+"\n");
                                        System.out.println(protagonistaspixar.get("Buzz")+"\n");
                                        Interfaz.preguntar();
                                        opcion4=Interfaz.responder();
                                        if(opcion4==1){break;}
                                        if (opcion4==2){
                                            cerrar = false;
                                            cerrar2 = false;
                                            break;}
                                    }
                                break;    
                           case 2:
                                    darla.presentarSeccion();
                                    antagonistaspixar.values().forEach((p) -> {
                                        p.presentarPersonaje();});
                                    Interfaz.preguntarPPixar();
                                    opcion3 = Interfaz.responder();
                                    if (opcion3 == 4){
                                        break;
                                    }
                                    if (opcion3 == 5){
                                        cerrar = false;
                                        cerrar2 = false;
                                        break;
                                    }
                                    if (opcion3==1){
                                        Interfaz.preguntarAnt(OpcionEscoger(opcion1),antpix);
                                        opcion5 = Interfaz.responderp(1);
                                        if(opcion5[0]==1){
                                            System.out.println(antagonistaspixar.get("Darla"));
                                            Interfaz.preguntar();
                                            opcion4=Interfaz.responder();
                                            if(opcion4==1){break;}
                                            if (opcion4==2){
                                                cerrar = false;
                                                cerrar2 = false;
                                                break;}
                                        }
                                        if(opcion5[0]==2){
                                            System.out.println(antagonistaspixar.get("Randall"));
                                            Interfaz.preguntar();
                                            opcion4=Interfaz.responder();
                                            if(opcion4==1){break;}
                                            if (opcion4==2){
                                                cerrar = false;
                                                cerrar2 = false;
                                                break;}
                                        }
                                        if(opcion5[0]==3){
                                            System.out.println(antagonistaspixar.get("Sid"));
                                            Interfaz.preguntar();
                                            opcion4=Interfaz.responder();
                                            if(opcion4==1){break;}
                                            if (opcion4==2){
                                                cerrar = false;
                                                cerrar2 = false;
                                                break;}
                                        }
                                        else{System.out.println("Error");break;}
                                    }
                                    if(opcion3==2){
                                        Interfaz.preguntarAnt(OpcionEscoger(opcion1),antpix);
                                        opcion5 = Interfaz.responderp(2);
                                        for(int i : opcion5){
                                            if(i==1){
                                                System.out.println(antagonistaspixar.get("Darla")+"\n");
                                                continue;
                                            }
                                            if(i==2){
                                                System.out.println(antagonistaspixar.get("Randall")+"\n");
                                                continue;
                                            }
                                            if(i==3){
                                                System.out.println(antagonistaspixar.get("Sid")+"\n");
                                            }
                                            else{
                                                System.out.println(i);
                                                System.out.println("Error");
                                            }
                                            
                                        }
                                        Interfaz.preguntar();
                                        opcion4=Interfaz.responder();
                                        if(opcion4==1){break;}
                                        if (opcion4==2){
                                            cerrar = false;
                                            cerrar2 = false;
                                            break;}
                                    }
                                    if(opcion3==3){
                                        System.out.println(antagonistaspixar.get("Darla")+"\n");
                                        System.out.println(antagonistaspixar.get("Randall")+"\n");
                                        System.out.println(antagonistaspixar.get("Sid")+"\n");
                                        Interfaz.preguntar();
                                        opcion4=Interfaz.responder();
                                        if(opcion4==1){break;}
                                        if (opcion4==2){
                                            cerrar = false;
                                            cerrar2 = false;
                                            break;}
                                    }
                                break;      
                            }
                    case 2:
                        thor.presentarSeccion();
                        Interfaz.preguntarPersonaje(OpcionEscoger(opcion1));
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
                                    Interfaz.preguntarProta(OpcionEscoger(opcion1),heroMar);
                                    opcion3 = Interfaz.responder();
                                    if (opcion3 == 1){
                                        thor.presentarPersonaje();
                                        System.out.println(thor);
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
                                        strange.presentarPersonaje();
                                        System.out.println(strange);
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
                                        araña.presentarPersonaje();
                                        System.out.println(araña);
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
                                    loki.presentarSeccion();
                                    Interfaz.preguntarAnt(OpcionEscoger(opcion1),villMar);
                                    opcion3 = Interfaz.responder();
                                    if (opcion3 == 1){
                                        loki.presentarPersonaje();
                                        System.out.println(loki);
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
                                        thanos.presentarPersonaje();
                                        System.out.println(thanos);
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
                                        ultron.presentarPersonaje();
                                        System.out.println(ultron);
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
                    case 3: //Star Wars
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
