package Data;

final public class VillanoStarWars extends PersonajeStarWars{
    
    private String enemigo; 
    private String objetivo;
    private String[] habilidades;
    final long precio = 50000; 
    
    public AntagonistaPixar(String nombre,int edad, String tipo, String genero, String[] peliculas,
            int año, String hogar, String especie, String enemigo, String objetivo, String[] habilidades){
        super(nombre, edad, tipo, genero, peliculas, año, hogar, especie);
        this.enemigo = enemigo;
        this.habilidades = habilidades;
        this.objetivo = objetivo;
        
    }
    public void presentarSeccion1(){
        System.out.println("\tVillanos de Star Wars");
    }
    @Override   
    public void presentarPersonaje(){
        System.out.println("Hola soy "+this.getNombre() + " el villano de una pelicula de Pixar");
    }

    public String[] getEnemigo() {
        return this.enemigo;
    }

    public void setEnemigo(String[] enemigo) {
        this.enemigo = enemigo;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
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
        for (String pelicula : this.getPeliculas()) {
            cadena1 += pelicula +" - ";
        }
        for (String habilidades : this.getHabilidades()) {
            cadena2 += poderes +" - ";
        }
        for (String enemigos : this.getEnemigo()) {
            cadena3 +=" - "+enemigos;
        }
        return ("Nombre: "+ this.getNombre()+"\nEdad: "+this.getEdad()+"\nTipo: "+this.getTipo()+"\nGenero: "+this.getGenero()+
                "\nPeliculas: "+cadena1+"\nAño: "+this.getAñoDeAparicion()+
                "\nHogar: "+this.getHogar()+"\nEspecie: "+this.getEspecie()+"\nEnemigo: "+cadena3+
                "\nObjetivo: "+this.getObjetivo()+"\nHabilidades: "+cadena2+"\nPrecio: $"+this.precio);
    }
}    

