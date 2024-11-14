public class Tortuga extends Mascota {
    String tipo;
    String nombre;
    String habitad_origen;

    public Tortuga(){

    }

    public Tortuga(String raza, int num_patas, String tipo, String nombre, String habitad_origen) {
        super(raza, num_patas);
        this.tipo = tipo;
        this.nombre = nombre;
        this.habitad_origen = habitad_origen;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHabitad_origen() {
        return habitad_origen;
    }

    public void setHabitad_origen(String habitad_origen) {
        this.habitad_origen = habitad_origen;
    }

    public void infoTortu(){
        System.out.println("--- Caracteristicas de mascota Tortuga ---");
        System.out.println("Su tipo es: " + tipo);
        System.out.println("Su nombre es: " + nombre);
        System.out.println("Su habitad origen: " + habitad_origen);

    }
}
