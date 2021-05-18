package DecoratorAtaque;

public class Espada extends DecoratorAtack{

    public Espada(Ataque ataque) {
        super(ataque);
    }

    @Override
    public String getTipoataque() {
        return "Fuerza";
    }

    @Override
    public int getDamage() {
        return 0;
    }

    @Override
    public String getNombre() {
        return "Ataque con Espada";
    }
}
