package FactoryEnemigos.Kobold;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.AtaqueSinArma;
import State.Estado;
import Strategy.EstrategiaEnemigo;

public class KoboldMarLunar extends Kobold {
    private int fuerza=1;
    private int destreza=1;
    private int inteligencia=1;
    private int vida=10;
    private int armadura=15;
    private Ataque ataque1= new AtaqueSinArma();
    private Ataque ataque2;
    private int defensa;
    private String extra;
    private Estado estado;
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
    public String getExtra() {
        return extra;
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
