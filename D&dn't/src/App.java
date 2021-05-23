
import Character.Player;



public class App {
    public static void main(String[] args) throws Exception {
        Player personaje = new Player();//genera el personaje jugador
        int gameOver = 0;//si game over es 0 se acaba la partida
        int n_puntos = 0;//contador de puntos para pasar de mundo
        do {
            System.out.println("Tienes " + n_puntos + " puntos de experiencia.");
            gameOver = GameManager.ronda(personaje, n_puntos);
            n_puntos++;
        } while (gameOver == 1);
    }
}
