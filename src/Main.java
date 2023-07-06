/*Crear clase Persona.

 Crear variables
 las privadas edad, nombre y telefono de la clase Persona.

 Crear gets y sets de cada propiedad.

 Crear un objeto persona en el main.

 Utiliza los gets y sets para darle valores
  a las propiedades edad, nombre y telefono,
  por último muéstralas por consola*/
public class Main {
    public static void main(String[] args) {
        Persona persona=new Persona(); //instanciamos un objeto de la clase Persona(hereda sus prop)
        //prueba con inicializacion con constructor
        System.out.println(persona.getEdad());
        System.out.println(persona.getNombre());
        System.out.println(persona.getTelefono());
        //prueba de usar los setts
        persona.setEdad(30);
        persona.setNombre("Daniel Calle");
        persona.setTelefono(261);
        //prueba con prop edad,nombre,telefono modificados
        System.out.println("Modificacion de propiedades de persona");
        System.out.println(persona.getEdad());
        System.out.println(persona.getNombre());
        System.out.println(persona.getTelefono());



    }
}
 class Persona{
    public Persona(){  // funcion constructora
        setEdad(0);
        setNombre("Nombre");
        setTelefono(0.0);
    }
 private int edad;
 private String nombre;
 private double telefono;

     public void setEdad(int edad) {
         this.edad = edad;
     }

     public int getEdad() {
         return edad;
     }

     public void setNombre(String nombre){
         this.nombre=nombre;
     }

     public String getNombre() {
         return nombre;
     }

     public void setTelefono(double telefono) {
         this.telefono = telefono;
     }

     public double getTelefono() {
         return telefono;
     }

 }