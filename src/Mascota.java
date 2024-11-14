public class Mascota {
    String raza;
    int num_patas;

    public Mascota() {

    }

    public Mascota(String raza, int num_patas) {
        this.raza = raza;
        this.num_patas = num_patas;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getNum_patas() {
        return num_patas;
    }

    public void setNum_patas(int num_patas) {
        this.num_patas = num_patas;
    }

    public void mostrarDatos(){
        System.out.println("--- Caracteristicas de las mascotas ---");
        System.out.println("Raza: " + raza);
        System.out.println("Num patas: " + num_patas);
    }

}
