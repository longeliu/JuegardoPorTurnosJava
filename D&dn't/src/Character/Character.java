package Character;

import DecoratorAtaque.Ataque;

public interface Character {


    public void setVida(int vida);
    public void setArmadura(int armadura);
    public int getVida();
    public int getArmadura();
    public int getFuerza();
    public int getDestreza();
    public int getInteligencia();

    public Ataque getAtaque1();
    public Ataque getAtaque2();
    public int getDefensa();
    public String getExtra();


}
