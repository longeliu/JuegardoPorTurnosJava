package DecoratorAtaque;

public class Maza extends DecoratorAtack{

    public Maza(Ataque ataque) {
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
        return "Ataque con Maza";
    }
}
