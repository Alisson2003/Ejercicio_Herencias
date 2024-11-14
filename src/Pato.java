public class Pato extends Mascota{
    String nombre;
    String tipo;

    public Pato(){

    }

    public Pato(String raza, int num_patas, String nombre, String tipo) {
        super(raza, num_patas);
        this.nombre = nombre;
        this.tipo = tipo;
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

    public void infoPato(){
        System.out.println("--- Caracteristicas de mascota Pato ---");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Tipo: " + getTipo());
    }

}

