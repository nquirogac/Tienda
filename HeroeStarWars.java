package Data;
final public class HeroeStarWars extends PersonajeStarWars{
    
    private String[] enemigo; 
    private String mision;
    private String[] habilidades;
    final long precio = 70000; 
    
    public ProtagonistaStarWars(String nombre, int edad, String tipo, String genero, String[] peliculas,
            int año, String hogar, String especie, String[] enemigo, String mision, String[] habilidades){
        super(nombre, edad, tipo, genero, peliculas, año, hogar,  especie);
        this.enemigo = enemigo;
        this.poderes = poderes;
        this.mision = mision;
        
    }
    public void presentarSeccion1(){
        System.out.println("\tHeroes de Star Wars");
    }
    @Override   
    public void presentarPersonaje(){
        System.out.println("Hola soy "+this.getNombre() + " el heroe de una pelicula de Star Wars");
    }

    public String[] getEnemigo() {
        return this.enemigo;
    }

    public void setEnemigo(String[] enemigo) {
        this.enemigo = enemigo;
    }

    public String getMision() {
        return this.mision;
    }

    public void setMision(String mision) {
        this.mision = mision;
    }

    public String[] getHabilidades() {
        return this.habilidades;
    }

    public void setHabilidades(String[] habilidades) {
        this.habilidades = habilidades;
    }
    @Override
    public String toString() {
        String cadena1 = "";
        String cadena2 = "";
        String cadena3 = "";
        for (String pelicula : this.getPeliculas()) {
            cadena1 +=" - "+pelicula;
        }
        for (String habilidades : this.getHabiliades()) {
            cadena2 +=" - "+habilidades;
        }
        for (String enemigos : this.getEnemigo()) {
            cadena3 +=" - "+enemigos;
        }
        return ("Nombre: "+ this.getNombre()+"\nEdad: "+this.getEdad()+"\nTipo: "+this.getTipo()+"\nGenero: "+this.getGenero()+
                "\nPeliculas: "+cadena1+"\nAño: "+this.getAñoDeAparicion()+
                "\nHogar: "+this.getHogar()+"\nEspecie: "+this.getEspecie()+"\nEnemigo: "+cadena3+
                "\nMisión: "+this.getMision()+"\nHabilidades: "+cadena2+"\nPrecio: $"+this.precio);
    }
}

