package FactoryEnemigos.Azotamentes;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.AtaqueSinArma;
import Strategy.EstrategiaATQ;
import Strategy.EstrategiaEnemigo;

public class AzotamentesAltoBosque extends Azotamentes {
    private int fuerza=1;
    private int destreza=1;
    private int inteligencia=1;
    private int vida=10;
    private int armadura=15;
    private Ataque ataque1= new AtaqueSinArma();
    private Ataque ataque2;
    private int defensa;
    private String extra;
    private EstrategiaEnemigo estrategia;


    @Override
    public void setVida(int vida) {
        this.vida=vida;
    }

    @Override
    public void setArmadura(int armadura) {
        this.armadura=armadura;
    }

    @Override
    public int getVida() {
        return vida;
    }

    @Override
    public int getArmadura() {
        return armadura;
    }

    @Override
    public int getFuerza() {
        return 0;
    }

    @Override
    public int getDestreza() {
        return 0;
    }

    @Override
    public int getInteligencia() {
        return 0;
    }

    
    @Override
    public Ataque getAtaque1() {
        return this.ataque1;
    }

    @Override
    public Ataque getAtaque2() {
<<<<<<< HEAD
        return estrategia.getAtaque2(Constantes.ALTO_BOSQUE);
=======
        return estrategia.getAtaque2(0);
>>>>>>> master
    }

    @Override
    public int getDefensa() {
        return fuerza;
    }

    @Override
    public String getExtra() {
       
    }

    @Override
<<<<<<< HEAD
    public void setEstrategia(EstrategiaEnemigo strat) {
        this.estrategia = strat;
=======
    public void setEstrategia(EstrategiaEnemigo estrategia) {
        this.estrategia=estrategia;
>>>>>>> master
    }
}
