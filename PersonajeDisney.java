package Data;

abstract public class PersonajeDisney {
    
    private String nombre;
    private int edad;
    private String tipo; //Animado o no
    private String genero;
    
    abstract public void presentarSeccion();
    abstract public void presentarPersonaje();
    public PersonajeDisney(String nombre,int edad, String tipo, String genero){
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.tipo = tipo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
}
