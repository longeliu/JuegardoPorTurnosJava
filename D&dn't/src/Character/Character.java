package Character;

import DecoratorAtaque.Ataque;

public interface Character {//Interfaz padre de todos los personajes, tanto jugador como NPC,contiene todos los getters y setters necesarios para el combate


    public void setVida(int vida);
    public void setArmadura(int armadura);
    public int getVida();
    public int getArmadura();
    public int getFuerza();
    public int getDestreza();
    public int getInteligencia();
    public String getNombre();

    public Ataque getAtaque1();
    public Ataque getAtaque2();
    public int getDefensa();



}
