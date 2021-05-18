package FactoryEnemigos.Gigante;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.AtaqueSinArma;

public class GiganteVientohelado extends Gigante{
    private int fuerza=1;
    private int destreza=1;
    private int inteligencia=1;
    private int vida=10;
    private int armadura=15;
    private Ataque ataque1= new AtaqueSinArma();
    private Ataque ataque2;
    private int defensa;
    private String extra;

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
        return ataque1;
    }

    @Override
    public Ataque getAtaque2() {
        return ataque2;
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
    public void setEstrategia() {

    }
}
