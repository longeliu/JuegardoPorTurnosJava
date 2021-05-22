import Calculator.Calculadora;
import Character.Player;
import FactoryEnemigos.Azotamentes.Azotamentes;
import FactoryEnemigos.Huargo.Huargo;
import FactoryEnemigos.Kobold.Kobold;
import FactoryMundos.AltoBosque;
import FactoryMundos.EnemyFactory;
import Character.Enemigo;
import Strategy.Huargo.HuargoEstrategiaATQ;
import Strategy.Kobold.KoboldEstrategiaATQ;
import Strategy.Kobold.KoboldEstrategiaDEF;

import java.util.ArrayList;


public class App {
    public static void main(String[] args) throws Exception {
        Player persojane = new Player();
        EnemyFactory factory = new AltoBosque();
        Kobold kobold = factory.creaKobold();
        Kobold kobold2 = factory.creaKobold();

        int a = kobold.getVida();
        int b = persojane.getVida();

        System.out.println(kobold.getArmadura());

        Calculadora.instance();

        kobold.setEstrategia(new KoboldEstrategiaATQ());
        kobold2.setEstrategia(new KoboldEstrategiaDEF());



        ArrayList<Enemigo> listaEnemigos = new ArrayList<Enemigo>();
        listaEnemigos.add(kobold);
        listaEnemigos.add(kobold2);

        listaEnemigos.get(0).templateEnemigo(persojane);
        listaEnemigos.get(1).templateEnemigo(persojane);



    }
}
