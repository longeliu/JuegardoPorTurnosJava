package FactoryEnemigos.Kobold;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.AtaqueSinArma;
import Strategy.EstrategiaEnemigo;


public class KoboldCostaEspada extends Kobold {

    private int fuerza=2;
    private int destreza=2;
    private int inteligencia=2;
    private int vida=4;
    private int armadura=10+destreza;
    private Ataque ataque1= new AtaqueSinArma();
    private int defensa=fuerza;
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
        return this.fuerza;
    }

    @Override
    public int getDestreza() {
        return this.destreza;
    }

    @Override
    public int getInteligencia() {
        return this.inteligencia;
    }

    @Override
    public Ataque getAtaque1() {
        return ataque1;
    }

    @Override
    public Ataque getAtaque2() {
        return estrategia.getAtaque2(1);
    }

    @Override
    public int getDefensa() {
        return defensa;
    }

    @Override
    public void setEstrategia(EstrategiaEnemigo estrategia) {
        this.estrategia=estrategia;
    }

    @Override
    public EstrategiaEnemigo getEstrategia() {
        return this.estrategia;
    }
}
