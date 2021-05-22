import Calculator.Calculadora;
import Character.Player;
import FactoryEnemigos.Azotamentes.Azotamentes;
import FactoryEnemigos.Huargo.Huargo;
import FactoryEnemigos.Kobold.Kobold;
import FactoryMundos.AltoBosque;
import FactoryMundos.EnemyFactory;
import Strategy.Huargo.HuargoEstrategiaATQ;


public class App {
    public static void main(String[] args) throws Exception {
        Player persojane = new Player();
        EnemyFactory factory = new AltoBosque();
        Kobold kobold = factory.creaKobold();

        int a = kobold.getVida();
        int b = persojane.getVida();

        System.out.println(kobold.getArmadura());

        Calculadora.instance();
        /*System.out.println(kobold.getVida());
        while (a==kobold.getVida()){
            Calculadora.ataque1(persojane,kobold);
        }
        System.out.println(kobold.getVida());

        System.out.println(persojane.getVida());
        while (b==persojane.getVida()){
            Calculadora.ataque1(kobold,persojane);
        }

        System.out.println(persojane.getVida());*/

        Huargo huargo = factory.creaHuargo();

        huargo.setEstrategia(new HuargoEstrategiaATQ());

        System.out.println(huargo.getAtaque2().getNombre());

    }
}
