package Data;
final public class HeroeMarvel extends PersonajeMarvel{
    
    private String[] enemigos; 
    final String mision="Salvar a la humanidad";
    private String[] poderes;
    final long precio = 100000; 
    final String creador = "Stan lee y Steve Ditko";
    
    public HeroeMarvel(String nombre,int edad, String tipo, String genero, String[] peliculas,
            int año, String hogar, String especie, String[] enemigo, String[] habilidades){
        super(nombre, edad, tipo, genero, peliculas, año, hogar,  especie);
        this.enemigos = enemigo;
        this.poderes = habilidades;
        
    }
    public void presentarSeccion1(){
        System.out.println("\tHeroes de Marvel");
    }
    @Override
    public void presentarPersonaje(){
        System.out.println("Hola soy "+this.getNombre() + " heroe de una pelicula de Marvel");
    }

    public String[] getEnemigos() {
        return this.enemigos;
    }

    public void setEnemigos(String[] enemigo) {
        this.enemigos = enemigo;
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
        String cadena3= "";
        for (String pelicula : this.getPeliculas()) {
            cadena1 +=" - "+pelicula;
        }
        for (String habilidad : this.getPoderes()) {
            cadena2 +=" - "+habilidad;
        }
        for (String enemigo : this.getEnemigos()) {
            cadena3 +=" - "+enemigo;
        }
        return ("Nombre: "+ this.getNombre()+"\nEdad: "+this.getEdad()+"\nTipo: "+this.getTipo()+"\nGenero: "+this.getGenero()+"\nCreadores: "+this.creador+
                "\nPeliculas: "+cadena1+"\nAño de Aparicion: "+this.getAñoDeAparicion()+
                "\nHogar: "+this.getOrigen()+"\nEspecie: "+this.getEspecie()+"\nEnemigo: "+cadena3+
                "\nMisión: "+this.mision+"\nPoderes: "+cadena2+"\nPrecio: $"+this.precio);
    }
}