package Data;

final public class VillanoMarvel extends PersonajeMarvel{
    
    private String[] enemigo; 
    private String objetivo;
    private String[] poderes;
    final long precio = 90000; 
    private String creador;
    public VillanoMarvel(String nombre,int edad, String tipo, String genero, String[] peliculas,
            int año, String hogar,  String especie,String creador, String[] enemigo, String objetivo, String[] habilidades){
        super(nombre, edad, tipo, genero, peliculas, año, hogar, especie);
        this.enemigo = enemigo;
        this.poderes = habilidades;
        this.objetivo = objetivo;
        this.creador = creador;
        
    }
    public void presentarSeccion1(){
        System.out.println("\tVillanos de Marvel");
    }
    @Override   
    public void presentarPersonaje(){
        System.out.println("Hola soy "+this.getNombre() + " villano de una pelicula de Marvel");
    }

    public String[] getEnemigo() {
        return this.enemigo;
    }

    public void setEnemigo(String[] enemigo) {
        this.enemigo = enemigo;
    }
    public String getCreador() {
        return this.creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String[] getPoderes() {
        return this.poderes;
    }

    public void setPoderes(String[] habilidades) {
        this.poderes = habilidades;
    }

    @Override
    public String toString() {
        String cadena1 = "";
        String cadena2 = "";
        String cadena3 = "";
        for (String pelicula : this.getPeliculas()) {
            cadena1 +=" - "+pelicula;
        }
        for (String habilidad : this.getPoderes()) {
            cadena2 +=" - "+habilidad;
        }
        for (String enemigos : this.getEnemigo()) {
            cadena3 += " - "+enemigos;
        }
        return ("Nombre: "+ this.getNombre()+"\nEdad: "+this.getEdad()+"\nTipo: "+this.getTipo()+"\nGenero: "+this.getGenero()+"\nCreador(es): "+this.getCreador()+
                "\nPeliculas: "+cadena1+"\nAño: "+this.getAñoDeAparicion()+
                "\nHogar: "+this.getOrigen()+"\nEspecie: "+this.getEspecie()+"\nEnemigos: "+cadena3+
                "\nObjetivo: "+this.getObjetivo()+"\nPoderes: "+cadena2+"\nPrecio: $"+this.precio);
    }
}    
