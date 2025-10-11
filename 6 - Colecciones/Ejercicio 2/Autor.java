package ejer2;
public class Autor {
    private String id;
    private String nombre;
    private String nacionalidad;

    //Contructor
    public Autor(String id, String nombre, String nacionalidad){
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
    
    //Getters
    public String getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getNacionalidad() {
        return this.nacionalidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    //Metodo para mostrar la informacion
    public void mostrarInfo(){
        System.out.println("------------------------------");
        //System.out.println("     INFORMACION DEL AUTOR    ");
        System.out.println("ID: "+this.id);
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Nacionalidad: "+this.nacionalidad);
        System.out.println("------------------------------");
    }
    
    // Sobrescrito para facilitar la impresión
    @Override
    public String toString() {
        return "ID: " + this.id + '\'' +
               ", nombre='" + this.nombre + '\'' +
               ", nacionalidad=" + this.nacionalidad +
               '}';
    }

}
