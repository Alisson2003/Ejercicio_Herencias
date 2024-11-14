public class Gato extends Mascota{
    String color;
    String nombre;
    String tipo;

    public Gato() {

    }

    public Gato(String raza, int num_patas, String color, String nombre, String tipo) {
        super(raza, num_patas);
        this.color = color;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void infoGato(){
        System.out.println("--- Caracteristicas de mascota Gato ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Color: " + color);
        System.out.println("Tipo: " + tipo);
    }

}
