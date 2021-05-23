package FactoryEnemigos.Kobold;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.AtaqueSinArma;
import Strategy.EstrategiaEnemigo;

public class KoboldMarLunar extends Kobold {
    private int fuerza=3;
    private int destreza=3;
    private int inteligencia=3;
    private int vida=5;
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
        return estrategia.getAtaque2(2);
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
