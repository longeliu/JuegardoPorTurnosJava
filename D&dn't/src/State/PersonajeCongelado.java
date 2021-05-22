package State;

class PersonajeCongelado implements EstadoPersonaje {
    @Override
    public EstadoPersonaje siguienteEstado() {
        return new PersonajeNormal();
    }

    @Override
    public int queTurnoSoy() {
        return 2;
    }
}
