package FactoryEnemigos.Kobold;

import DecoratorAtaque.Ataque;
import FactoryEnemigos.Huargo.Huargo;

public class KoboldMarLunar extends Kobold {

    private int vida;
    private int armadura;
    private Ataque ataque1;
    private Ataque ataque2;
    private int defensa;
    private String extra;

    @Override
    public void setVida(int vida) {

    }

    @Override
    public void setArmadura(int armadura) {

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
