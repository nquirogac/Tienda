package Data;

public class PersonajeStarWars extends PersonajeDisney {
    
    private String[] peliculas;
    private int a�oDeAparicion;
    private String hogar;
    private String especie;
           
    public PersonajeStarWars(String nombre, int edad, String tipo, String genero, String[] peliculas, int a�o, String hogar, String especie){
        super(nombre, edad, tipo, genero);
        this.a�oDeAparicion = a�o;
        this.peliculas = peliculas;
        this.hogar = hogar;
        this.especie = especie;
    }       
    @Override
    final public void presentarSeccion() {
        System.out.println("****Usted se encuentra en la secci�n Star Wars*****");
    }
    public void presentarPersonaje(){
        System.out.println("Hola soy un personaje de Star Wars");
    }

    public String[] getPeliculas() {
        return this.peliculas;
    }

    public void setPeliculas(String[] peliculas) {
        this.peliculas = peliculas;
    }

    public int getA�oDeAparicion() {
        return this.a�oDeAparicion;
    }

    public void setA�oDeAparicion(int a�oDeAparicion) {
        this.a�oDeCreacion = a�oDeAparicion;
    }

    public String getHogar() {
        return this.hogar;
    }

    public void setHogar(String hogar) {
        this.hogar = hogar;
    }

    public String getEspecie() {
        return this.especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
}
