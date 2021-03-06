package Data;
final public class ProtagonistaPixar extends PersonajePixar{
    
    private String enemigo; 
    private String mision;
    private String[] habilidades;
    final long precio = 80000; 
    
    public ProtagonistaPixar(String nombre,int edad, String tipo, String genero, String[] peliculas,
            int año, String hogar, String especie, String enemigo, String mision, String[] habilidades){
        super(nombre, edad, tipo, genero, peliculas, año, hogar,  especie);
        this.enemigo = enemigo;
        this.habilidades = habilidades;
        this.mision = mision;
        
    }
    public void presentarSeccion1(){
        System.out.println("\tProtagonistas de Pixar");
    }
    @Override   
    public void presentarPersonaje(){
        System.out.println("Hola soy "+this.getNombre() + " el protagonista de una pelicula de Pixar");
    }

    public String getEnemigo() {
        return this.enemigo;
    }

    public void setEnemigo(String enemigo) {
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
        for (String pelicula : this.getPeliculas()) {
            cadena1 += pelicula+" - ";
        }
        for (String habilidad : this.getHabilidades()) {
            cadena2 += habilidad+" - ";
        }
        return ("Nombre: "+ this.getNombre()+"\nEdad: "+this.getEdad()+"\nTipo: "+this.getTipo()+"\nGenero: "+this.getGenero()+
                "\nPeliculas: "+cadena1+"\nAño: "+this.getAñoDeCreacion()+
                "\nHogar: "+this.getHogar()+"\nEspecie: "+this.getEspecie()+"\nEnemigo: "+
                "\nMisión: "+this.getMision()+"\nHabilidades: "+cadena2+"\nPrecio: $"+this.precio);
    }
}
