package Classes;

public class Person {
    int edad;
    String nombre;

    public Person(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + ")";
    }
}
