public class Perro extends Mascota{
    String nombre;
    String color;
    int edad;

    public Perro(){

    }

    public Perro(String raza, int num_patas, String nombre, String color, int edad) {
        super(raza, num_patas);
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void infoPerro(){
        System.out.println("--- Caracteristicas de mascota Perro ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Color: " + color);
        System.out.println("Edad: " + edad);
    }
}
