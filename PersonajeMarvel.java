package Data;

public class PersonajeMarvel extends PersonajeDisney {
    
    private String[] peliculas;
    private int añoDeAparicion;
    private String origen;
    private String especie;
    
           
    public PersonajeMarvel(String nombre,int edad, String tipo, String genero, String[] peliculas,  int año, String hogar,  String especie){
        super(nombre, edad, tipo, genero);
        this.añoDeAparicion = año;
        this.peliculas = peliculas;
        this.origen = hogar;
        this.especie = especie;
    }       
    @Override
    final public void presentarSeccion() {
        System.out.println("****Usted se encuentra en la sección Marvel*****");
    }
    @Override
    public void presentarPersonaje(){
        System.out.println("Hola soy un personaje de Marvel");
    }

    public String[] getPeliculas() {
        return this.peliculas;
    }

    public void setPeliculas(String[] peliculas) {
        this.peliculas = peliculas;
    }

    public int getAñoDeAparicion() {
        return this.añoDeAparicion;
    }

    public void setAñoDeAparicion(int añoDeAparicion) {
        this.añoDeAparicion = añoDeAparicion;
    }

    public String getOrigen() {
        return this.origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getEspecie() {
        return this.especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
}
