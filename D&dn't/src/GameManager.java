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
    
    private static Enemigo spawner(EnemyFactory factoria){
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

    private static int seleccionadorEnemigos(ArrayList<Enemigo> enemigos){
        Scanner entrada = new Scanner(System.in);
        int num = enemigos.size() + 1;
        do{
            for (int i = 0; i < enemigos.size(); i++) {
                System.out.printf("%d - %s", (i + 1), enemigos.get(i).getNombre());
            }
            num = entrada.nextInt() - 1;
        }while(num > enemigos.size() || num < 0);
        entrada.close();
        return num;
    }

    private static void turnoJugador(Player personajeP, ArrayList<Enemigo> enemigos){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Es tu turno, puedes hacer lo siguiente: ");
        System.out.println("1- Ataque1\n2- Ataque2\n3- Defensa\n4- Rendirte");
        int comprobarInput = 0;
        int objetivo = 0;
        do {
            comprobarInput = 0;
            int seleccion = entrada.nextInt();
            switch (seleccion) {
                case 1:
                    entrada.close();
                    System.out.printf("A quien quieres atacar? con %s: \n", personajeP.getAtaque1().getNombre());
                    objetivo = seleccionadorEnemigos(enemigos);
                    Calculadora.ataque1(personajeP, enemigos.get(objetivo));
                    break;
                case 2:
                    entrada.close();
                    System.out.printf("A quien quieres atacar? con %s: \n", personajeP.getAtaque2().getNombre());
                    objetivo = seleccionadorEnemigos(enemigos);
                    Calculadora.ataque2(personajeP, enemigos.get(objetivo));
                    break;
                case 3:
                    entrada.close();
                    System.out.println("Defensa Activada!");
                    Calculadora.defensa(personajeP);
                    break;
                case 4:
                    entrada.close();
                    personajeP.setVida(0);
                    break;
                default:
                    comprobarInput = 1;
                    break;
        }
        } while (comprobarInput == 1);
    }

    private static void comprobarEnemigos(ArrayList<Enemigo> enemigos){
        for(int i = 0; i < enemigos.size(); i++){
            if (enemigos.get(i).getVida() <= 0) {
                enemigos.remove(i);
            }
        }
    }

    private static boolean comprobarJugador(Player personajeP) {
        if (personajeP.getVida() <= 0) {
            return true;
        }
        else{
            return false;
        }
    }
    
    private static void rellenarEstrategiaKobold(Enemigo enemigo){
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
    private static void rellenarEstrategiaHuargo(Enemigo enemigo){
        int randomEstrat = Calculadora.getDado().nextInt(3);
        switch (randomEstrat) {
            case 0:
                enemigo.setEstrategia(new HuargoEstrategiaATQ());
                break;
            case 1:
                enemigo.setEstrategia(new HuargoEstrategiaDEF());
                break;
            case 2:
                enemigo.setEstrategia(new HuargoEstrategiaSUPP());
                break;
            default:
                break;
        } 
    }
    private static void rellenarEstrategiaGigante(Enemigo enemigo){
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
    private static void rellenarEstrategiaAzotamentes(Enemigo enemigo){
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

    private static void setEstrategiaPorRaza(ArrayList<Enemigo> enemigos){
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

    public static int ronda(Player personajeP, int n_rondas) {
        if (n_rondas < 10) {
            EnemyFactory factoria = new AltoBosque();
            ArrayList<Enemigo> enemigos = new ArrayList<>();
            //Crea enemigos
            for(int i = 0; i <= n_rondas; i += 2){
                enemigos.add(spawner(factoria));
            }
            setEstrategiaPorRaza(enemigos);
            int posicionjugador = Calculadora.getDado().nextInt(enemigos.size() + 1);

            while(enemigos.size() > 0){
                for(int i = 0; i <= (enemigos.size() + 1); i++){
                    if(i < posicionjugador){
                        //TODO resetear armadura
                        enemigos.get(i).templateEnemigo(personajeP, enemigos);
                    }else if(i == posicionjugador){
                        //TODO resetear armadura
                        turnoJugador(personajeP,enemigos);
                    }else{
                        //TODO resetear armadura
                        enemigos.get(i - 1).templateEnemigo(personajeP, enemigos);
                    }
                    comprobarEnemigos(enemigos);
                    if (comprobarJugador(personajeP)) {
                        return 0;
                    }
                }
            }
            
        }else if(n_rondas < 20){
            EnemyFactory factoria = new CostaDeLaEspada();
            ArrayList<Enemigo> enemigos = new ArrayList<>();
            //Crea enemigos
            for(int i = 0; i <= n_rondas; i += 2){
                enemigos.add(spawner(factoria));
            }
            setEstrategiaPorRaza(enemigos);
            int posicionjugador = Calculadora.getDado().nextInt(enemigos.size() + 1);

            while(enemigos.size() > 0){
                for(int i = 0; i <= (enemigos.size() + 1); i++){
                    if(i <= posicionjugador){
                        //TODO resetear armadura
                        enemigos.get(i).templateEnemigo(personajeP, enemigos);
                    }else if(i == posicionjugador){
                        //TODO resetar armadura
                        turnoJugador(personajeP, enemigos);
                    }else{
                        //TODO resetear armadura
                        enemigos.get(i - 1).templateEnemigo(personajeP, enemigos);
                    }
                    comprobarEnemigos(enemigos);
                    if (comprobarJugador(personajeP)) {
                        return 0;
                    }
                }
            }
        }else if(n_rondas < 30){
            EnemyFactory factoria = new MarLunar();
            ArrayList<Enemigo> enemigos = new ArrayList<>();
            //Crea enemigos
            for(int i = 0; i <= n_rondas; i += 2){
                enemigos.add(spawner(factoria));
            }
            setEstrategiaPorRaza(enemigos);
            int posicionjugador = Calculadora.getDado().nextInt(enemigos.size() + 1);

            while(enemigos.size() > 0){
                for(int i = 0; i <= (enemigos.size() + 1); i++){
                    if(i <= posicionjugador){
                        //TODO resetear armadura
                        enemigos.get(i).templateEnemigo(personajeP, enemigos);
                    }else if(i == posicionjugador){
                        //TODO resetear armadura
                        turnoJugador(personajeP, enemigos);
                    }else{
                        //TODO resetear armadura
                        enemigos.get(i - 1).templateEnemigo(personajeP, enemigos);
                    }
                    comprobarEnemigos(enemigos);
                    if (comprobarJugador(personajeP)) {
                        return 0;
                    }
                }
            }
        }else{
            EnemyFactory factoria = new ValleVientohelado();
            ArrayList<Enemigo> enemigos = new ArrayList<>();
            //Crea enemigos
            for(int i = 0; i <= n_rondas; i += 2){
                enemigos.add(spawner(factoria));
            }
            setEstrategiaPorRaza(enemigos);
            int posicionjugador = Calculadora.getDado().nextInt(enemigos.size() + 1);

            while(enemigos.size() > 0){
                for(int i = 0; i <= (enemigos.size() + 1); i++){
                    if(i <= posicionjugador){
                        //TODO resetear armadura
                        enemigos.get(i).templateEnemigo(personajeP, enemigos);
                    }else if(i == posicionjugador){
                        //TODO resetear armadura
                        turnoJugador(personajeP, enemigos);
                    }else{
                        //TODO resetear armadura
                        enemigos.get(i - 1).templateEnemigo(personajeP, enemigos);
                    }
                    comprobarEnemigos(enemigos);
                    if (comprobarJugador(personajeP)) {
                        return 0;
                    }
                }
            }
        }
        return 1;
    }
}