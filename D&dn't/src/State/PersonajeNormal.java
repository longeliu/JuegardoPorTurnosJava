package State;

class PersonajeNormal implements EstadoPersonaje {
    @Override
    public EstadoPersonaje siguienteEstado() {
        return new PersonajeQuemado();
    }

    @Override
    public String queEstadoSoy() {
        return "Estas bien.";
    }
}
