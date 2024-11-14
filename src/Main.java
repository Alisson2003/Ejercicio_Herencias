//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Perro perro = new Perro();
        perro.mostrarDatos();
        perro.infoPerro();

        System.out.println();

        Gato gato = new Gato("Fold escocés",4,"Cafe","Michi","persa");
        gato.mostrarDatos();

        System.out.println();

        Conejo conejo = new Conejo("Mini Rex",4,"Peludito","Toy","Blanco");
        conejo.infoConejo();

        System.out.println();

        Tortuga tortuga = new Tortuga("Tortuga Laúd",4,"Lora","Chelsie","Tortuga Laúd");
        tortuga.mostrarDatos();
        tortuga.infoTortu();

        System.out.println();

        Pato pato = new Pato();

        pato.setNombre("Señor pato");
        pato.setTipo("Merganetta armata");
        pato.setRaza("Pato pekin americano");
        pato.setNum_patas(4);

        pato.mostrarDatos();
        pato.infoPato();
    }
}