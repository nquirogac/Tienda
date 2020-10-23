package Data;

public class PersonajePixar extends PersonajeDisney {
    
    private String[] peliculas;
    private int añoDeCreacion;
    private String hogar;
    private String especie;
           
    public PersonajePixar(String nombre,int edad, String tipo, String genero, String[] peliculas,  int año, String hogar,  String especie){
        super(nombre, edad, tipo, genero);
        this.añoDeCreacion = año;
        this.peliculas = peliculas;
        this.hogar = hogar;
        this.especie = especie;
    }       
    @Override
    final public void presentarSeccion() {
        System.out.println("****Usted se encuentra en la sección Pixar*****");
    }
    @Override
    public void presentarPersonaje(){
        System.out.println("Hola soy un personaje de Pixar");
    }

    public String[] getPeliculas() {
        return this.peliculas;
    }

    public void setPeliculas(String[] peliculas) {
        this.peliculas = peliculas;
    }

    public int getAñoDeCreacion() {
        return this.añoDeCreacion;
    }

    public void setAñoDeCreacion(int añoDeCreacion) {
        this.añoDeCreacion = añoDeCreacion;
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
