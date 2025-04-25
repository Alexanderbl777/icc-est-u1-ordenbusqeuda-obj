package models;

public class Persona {
    
    private String Nombre;
    private int edad;
    private Direccion direccion;

    public Persona(String nombre, int edad, Direccion direccion) {
        Nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public int getCoddigoDireccion(){
        return direccion.getCodigo();
    }

    public boolean compareCodigoDireccion(Persona persona){
        return getCoddigoDireccion() > persona.getCoddigoDireccion();
    }

    public boolean compareCodigoDireccion(int codigo){
        return getCoddigoDireccion() > codigo;
    }

    public boolean equalsByCodigoDireccion(int codigo){
        return getCoddigoDireccion() == codigo;
    }

    @Override
    public String toString() {
        return "Persona [Nombre=" + Nombre + ", edad=" + edad + ", direccion=" + direccion + "]";
    }
    
    
}
