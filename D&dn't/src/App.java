import Pruebas.CreacionPersonaje;
import Character.Player;
public class App {
    public static void main(String[] args) throws Exception {
        Player personaje=new Player(10,10,10);
        CreacionPersonaje prueba = new CreacionPersonaje();

        prueba.creapersonaje(personaje);

    }
}
