import Character.Player;


public class App {
    public static void main(String[] args) throws Exception {
        Player personaje = new Player();
        int gameOver = 0;
        int n_rondas = 0;
        do {
            System.out.println("Estas en la ronda " + n_rondas);
            gameOver = GameManager.ronda(personaje, n_rondas);    
            n_rondas++;
        } while (gameOver == 1);
        System.out.println("GAME OVER");







        /*Player persojane = new Player();
        EnemyFactory factory = new AltoBosque();
        Kobold kobold = factory.creaKobold();

        Kobold kobold2 = factory.creaKobold();

        int a = kobold.getVida();
        int b = persojane.getVida();

        System.out.println(kobold.getArmadura());

        Calculadora.instance();

        kobold.setEstrategia(new KoboldEstrategiaATQ());
        kobold2.setEstrategia(new KoboldEstrategiaSUPP());



        ArrayList<Enemigo> listaEnemigos = new ArrayList<Enemigo>();
        listaEnemigos.add(kobold);
        listaEnemigos.add(kobold2);

        listaEnemigos.get(0).templateEnemigo(persojane,listaEnemigos);
        listaEnemigos.get(1).templateEnemigo(persojane,listaEnemigos);
        Calculadora.ataque1(persojane,kobold);
        Calculadora.ataque1(persojane,kobold);
        Calculadora.ataque2(persojane,kobold);
        listaEnemigos.get(1).templateEnemigo(persojane,listaEnemigos);*/


    }
}
