package State;

class PersonajeQuemado implements EstadoPersonaje {
    @Override
    public EstadoPersonaje siguienteEstado() {
        return new PersonajeCongelado();
    }

    @Override
    public String queEstadoSoy() {
        return "Tienes calor";
    }
}
