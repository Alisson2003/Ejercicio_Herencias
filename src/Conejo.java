public class Conejo extends Mascota{
    String nombre;
    String tipo;
    String color;

    public Conejo(){

    }

    public Conejo(String raza, int num_patas, String nombre, String tipo, String color) {
        super(raza, num_patas);
        this.nombre = nombre;
        this.tipo = tipo;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void infoConejo(){
        System.out.println("--- Caracteristicas de mascota Conejo ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Color: " + color);
    }


}

