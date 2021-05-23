package DecoratorAtaque;

public interface Ataque {//Define el tipo de daño para sumar bonus, el daño propio del ataque, y el nombre para mostrarlo
    String getTipoataque();
    int getDamage();
    String getNombre();


}
