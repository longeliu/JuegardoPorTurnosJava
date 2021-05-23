import java.util.ArrayList;
import java.util.Scanner;

import Calculator.Calculadora;
import Character.Enemigo;
import FactoryMundos.AltoBosque;
import FactoryMundos.CostaDeLaEspada;
import FactoryMundos.EnemyFactory;
import FactoryMundos.MarLunar;
import FactoryMundos.ValleVientohelado;
import Strategy.Azotamentes.AzotamentesEstrategiaATQ;
import Strategy.Azotamentes.AzotamentesEstrategiaDEF;
import Strategy.Azotamentes.AzotamentesEstrategiaSUPP;
import Strategy.Gigante.GiganteEstrategiaATQ;
import Strategy.Gigante.GiganteEstrategiaDEF;
import Strategy.Gigante.GiganteEstrategiaSUPP;
import Strategy.Huargo.HuargoEstrategiaATQ;
import Strategy.Huargo.HuargoEstrategiaDEF;
import Strategy.Huargo.HuargoEstrategiaSUPP;
import Strategy.Kobold.KoboldEstrategiaATQ;
import Strategy.Kobold.KoboldEstrategiaDEF;
import Strategy.Kobold.KoboldEstrategiaSUPP;
import Character.Player;
import FactoryEnemigos.Gigante.Gigante;
import FactoryEnemigos.Huargo.Huargo;
import FactoryEnemigos.Kobold.Kobold;

public class GameManager {
    
    private static Enemigo spawner(EnemyFactory factoria){//metodo que randomiza el spawn enemigo entre las 4 razas
        int rand = Calculadora.getDado().nextInt(4);
        if (rand == 0) {
            return factoria.creaKobold();
        }else if(rand == 1){
            return factoria.creaAzotamentes();
        }else if(rand == 2){
            return factoria.creaGigante();
        }else{
            return factoria.creaHuargo();
        }
    }

    private static int seleccionadorEnemigos(ArrayList<Enemigo> enemigos){//metodo que printea todos los enemigos presentes en el combate junto a su vida para que el jugador pueda elegir un objetivo
        Scanner entrada = new Scanner(System.in);
        int num = enemigos.size() + 1;
        do{
            for (int i = 0; i < enemigos.size(); i++) {
                System.out.printf("%d - %s - HP %d\n", (i + 1), enemigos.get(i).getNombre(),enemigos.get(i).getVida());
            }
            num = entrada.nextInt() - 1;
        }while(num > enemigos.size() || num < 0);

        return num;
    }

    private static void turnoJugador(Player personajeP, ArrayList<Enemigo> enemigos){//turno del jugador
        personajeP.setArmadura(16+personajeP.getDestreza());//resetea la armadura por si se ha utilizado defensa en el turno anterior
        Scanner entrada = new Scanner(System.in);
        System.out.println("Es tu turno, tienes " + personajeP.getVida() +  " de vida, puedes hacer lo siguiente: ");
        System.out.println("1- " + personajeP.getAtaque1().getNombre() +"\n2- " + personajeP.getAtaque2().getNombre() +"\n3- Defensa\n4- Rendirte");//muestra las acciones disponibles
        int comprobarInput = 0;
        int objetivo = 0;
        do {
            comprobarInput = 0;
            int seleccion = entrada.nextInt();
            switch (seleccion) {
                case 1:

                    System.out.printf("A quien quieres atacar? con %s: \n", personajeP.getAtaque1().getNombre());
                    objetivo = seleccionadorEnemigos(enemigos);// llama a seleccionador enemigos para mostrar los objetivos
                    Calculadora.ataque1(personajeP, enemigos.get(objetivo));//llama a calculadora para hacer ataque 1
                    break;
                case 2://igual que el anterior pero con ataque 2

                    System.out.printf("A quien quieres atacar? con %s: \n", personajeP.getAtaque2().getNombre());
                    objetivo = seleccionadorEnemigos(enemigos);
                    Calculadora.ataque2(personajeP, enemigos.get(objetivo));
                    break;
                case 3://

                    System.out.println("Defensa Activada!");
                    Calculadora.defensa(personajeP);//llama a calculadora para utilizar defensa sobre si mismo
                    break;
                case 4:

                    personajeP.setVida(0);//vida a 0 por lo que fuerza un game over
                    break;
                default:
                    comprobarInput = 1;
                    break;
        }
        } while (comprobarInput == 1);
    }

    private static int comprobarEnemigos(ArrayList<Enemigo> enemigos){//comprueba la vida de todos lo enmigos y si alguno ha perdido toda su vida lo borra de la lista de enemigos
        for(int i = 0; i < enemigos.size(); i++){
            if (enemigos.get(i).getVida() <= 0) {
                enemigos.remove(i);
                return i;
            }
        }
        return -1;
    }

    private static boolean comprobarJugador(Player personajeP) {//comprueba si el jugador sigue vivo
        if (personajeP.getVida() <= 0) {
            return true;
        }
        else{
            return false;
        }
    }
    
    private static void rellenarEstrategiaKobold(Enemigo enemigo){//asigna una estrategia aleatoria al kobold
        int randomEstrat = Calculadora.getDado().nextInt(3);
        switch (randomEstrat) {
            case 0:
                enemigo.setEstrategia(new KoboldEstrategiaATQ());
                break;
            case 1:
                enemigo.setEstrategia(new KoboldEstrategiaDEF());
                break;
            case 2:
                enemigo.setEstrategia(new KoboldEstrategiaSUPP());
                break;
            default:
                break;
        }
    }
    private static void rellenarEstrategiaHuargo(Enemigo enemigo){//asigna una estrategia aleatoria al huargo
        int randomEstrat = Calculadora.getDado().nextInt(3);
        switch (randomEstrat) {
            case 0:
                enemigo.setEstrategia(new HuargoEstrategiaATQ());
                break;
            case 1:
                enemigo.setEstrategia(new HuargoEstrategiaSUPP());
                break;
            case 2:
                enemigo.setEstrategia(new HuargoEstrategiaDEF());
                break;
            default:
                break;
        } 
    }
    private static void rellenarEstrategiaGigante(Enemigo enemigo){//asigna una estrategia aleatoria al gigante
        int randomEstrat = Calculadora.getDado().nextInt(3);
        switch (randomEstrat) {
            case 0:
                enemigo.setEstrategia(new GiganteEstrategiaATQ());
                break;
            case 1:
                enemigo.setEstrategia(new GiganteEstrategiaDEF());
                break;
            case 2:
                enemigo.setEstrategia(new GiganteEstrategiaSUPP());
                break;
            default:
                break;
        } 
    }
    private static void rellenarEstrategiaAzotamentes(Enemigo enemigo){//asigna una estrategia aleatoria al azotamentes
        int randomEstrat = Calculadora.getDado().nextInt(3);
        switch (randomEstrat) {
            case 0:
                enemigo.setEstrategia(new AzotamentesEstrategiaATQ());
                break;
            case 1:
                enemigo.setEstrategia(new AzotamentesEstrategiaDEF());
                break;
            case 2:
                enemigo.setEstrategia(new AzotamentesEstrategiaSUPP());
                break;
            default:
                break;
        } 
    }

    private static void setEstrategiaPorRaza(ArrayList<Enemigo> enemigos){//busca el tipo de raza de la lista de enemigos para asignarle su estrategia apropiada
        for (int i = 0; i < enemigos.size(); i++) {
            if(enemigos.get(i) instanceof Kobold){
                rellenarEstrategiaKobold(enemigos.get(i));
            }else if(enemigos.get(i) instanceof Huargo){
                rellenarEstrategiaHuargo(enemigos.get(i));
            }else if(enemigos.get(i) instanceof Gigante){
                rellenarEstrategiaGigante(enemigos.get(i));
            }else{//Azotamentes
                rellenarEstrategiaAzotamentes(enemigos.get(i));
            }   
        }
    }

    public static int ronda(Player personajeP, int n_puntos) {//gestor principal de rondas
        if (n_puntos < 6) {//divisor por puntos mundo 1 < 10 puntos, mundo 2 < 20, mundo 3 < de 30 mundo 4 > 30
            EnemyFactory factoria = new AltoBosque();//crea la factoria del mundo apropiado
            ArrayList<Enemigo> enemigos = new ArrayList<>();//crea la lista de enemigos
            for(int i = 0; i <= n_puntos; i += 2){//crea enemigos en funcion de los puntos de experiencia
                enemigos.add(spawner(factoria));
            }
            setEstrategiaPorRaza(enemigos);//reparte las estrategias a los enemigos
            System.out.println("Estas en Altobosque y te encuentras con:");
            for (int i = 0; i < enemigos.size(); i++) {//muestra los enemigos
                System.out.println(enemigos.get(i).getNombre());
            }
            System.out.println(personajeP.getEstado().getEstadoActual().queEstadoSoy());//printea el estado del personaje(cambia por mundo)
            int posicionjugador = Calculadora.getDado().nextInt(enemigos.size() + 1); //randomiza el turno del jugador

            while(enemigos.size() > 0){//divide los turnos en orden
                for(int i = 0; i < (enemigos.size() + 1); i++){
                    if(i < posicionjugador){//primero los anteriores al jugador
                        enemigos.get(i).templateEnemigo(personajeP, enemigos);//llama al template para ejecutar el turno
                    }else if(i == posicionjugador){
                        turnoJugador(personajeP,enemigos);//turno del jugador
                    }else{
                        enemigos.get(i - 1).templateEnemigo(personajeP, enemigos);//enemigos posteriores al jugador
                    }
                    int todosVivos = comprobarEnemigos(enemigos);//comprueba enemigos muertos
                    if (todosVivos != -1 && todosVivos < posicionjugador){//si muere algun enemigo cuya posicion es anterior a la del jugador se adelanta 1 posicion al jugador
                        --posicionjugador;
                    }
                    if (comprobarJugador(personajeP)) {//comprueba si el jugador esta muerto
                        return 0;
                    }
                }
            }
            
        }else if(n_puntos < 14){//igual que el anterior pero cambiando la factoria de mundo
            if(n_puntos== 6){
                personajeP.getEstado().siguienteEstado();
                personajeP.setVida(30+personajeP.getFuerza());
                System.out.println("Te has curado.");
            }
            System.out.println(personajeP.getEstado().getEstadoActual().queEstadoSoy());
            EnemyFactory factoria = new CostaDeLaEspada();
            ArrayList<Enemigo> enemigos = new ArrayList<>();
            //Crea enemigos
            for(int i = 0; i <= n_puntos -6; i += 2){
                enemigos.add(spawner(factoria));
            }
            setEstrategiaPorRaza(enemigos);
            System.out.println("Estas en Costa de la Espada y te encuentras con:");
            for (int i = 0; i < enemigos.size(); i++) {
                System.out.println(enemigos.get(i).getNombre());
            }
            int posicionjugador = Calculadora.getDado().nextInt(enemigos.size() + 1);

            while(enemigos.size() > 0){
                for(int i = 0; i < (enemigos.size() + 1); i++){
                    if(i < posicionjugador){
                        enemigos.get(i).templateEnemigo(personajeP, enemigos);
                    }else if(i == posicionjugador){
                        turnoJugador(personajeP, enemigos);
                    }else{
                        enemigos.get(i - 1).templateEnemigo(personajeP, enemigos);
                    }
                    int todosVivos = comprobarEnemigos(enemigos);
                    if (todosVivos != -1 && todosVivos < posicionjugador){
                        --posicionjugador;
                    }
                    if (comprobarJugador(personajeP)) {
                        return 0;
                    }
                }
            }
        }else if(n_puntos < 22){//igual que el anterior pero cambiando la factoria de mundo
            if(n_puntos== 14){
                personajeP.setVida(50+personajeP.getFuerza());
                System.out.println("Te has curado.");
            }
            System.out.println(personajeP.getEstado().getEstadoActual().queEstadoSoy());
            EnemyFactory factoria = new MarLunar();
            ArrayList<Enemigo> enemigos = new ArrayList<>();
            //Crea enemigos
            for(int i = 0; i <= n_puntos - 14; i += 2){
                enemigos.add(spawner(factoria));
            }
            setEstrategiaPorRaza(enemigos);
            System.out.println("Estas en Mar Lunar y te encuentras con:");
            for (int i = 0; i < enemigos.size(); i++) {
                System.out.println(enemigos.get(i).getNombre());
            }
            int posicionjugador = Calculadora.getDado().nextInt(enemigos.size() + 1);

            while(enemigos.size() > 0){
                for(int i = 0; i < (enemigos.size() + 1); i++){
                    if(i < posicionjugador){
                        enemigos.get(i).templateEnemigo(personajeP, enemigos);
                    }else if(i == posicionjugador){
                        turnoJugador(personajeP, enemigos);
                    }else{
                        enemigos.get(i - 1).templateEnemigo(personajeP, enemigos);
                    }
                    int todosVivos = comprobarEnemigos(enemigos);
                    if (todosVivos != -1 && todosVivos < posicionjugador){
                        --posicionjugador;
                    }
                    if (comprobarJugador(personajeP)) {
                        return 0;
                    }
                }
            }
        }else{//igual que el anterior pero cambiando la factoria de mundo
            if(n_puntos== 22){
                personajeP.getEstado().siguienteEstado();
                personajeP.setVida(70+personajeP.getFuerza());
                System.out.println("Te has curado.");
            }
            System.out.println(personajeP.getEstado().getEstadoActual().queEstadoSoy());
            EnemyFactory factoria = new ValleVientohelado();
            ArrayList<Enemigo> enemigos = new ArrayList<>();
            //Crea enemigos
            for(int i = 0; i <= n_puntos -22; i += 2){
                enemigos.add(spawner(factoria));
            }
            setEstrategiaPorRaza(enemigos);
            System.out.println("Estas en Valle Vientohelado y te encuentras con:");
            for (int i = 0; i < enemigos.size(); i++) {
                System.out.println(enemigos.get(i).getNombre());
            }
            int posicionjugador = Calculadora.getDado().nextInt(enemigos.size() + 1);

            while(enemigos.size() > 0){
                for(int i = 0; i < (enemigos.size() + 1); i++){
                    if(i < posicionjugador){
                        enemigos.get(i).templateEnemigo(personajeP, enemigos);
                    }else if(i == posicionjugador){
                        turnoJugador(personajeP, enemigos);
                    }else{
                        enemigos.get(i - 1).templateEnemigo(personajeP, enemigos);
                    }
                    int todosVivos = comprobarEnemigos(enemigos);
                    if (todosVivos != -1 && todosVivos < posicionjugador){
                        --posicionjugador;
                    }
                    if (comprobarJugador(personajeP)) {
                        return 0;
                    }
                }
            }
        }
        return 1;
    }
}