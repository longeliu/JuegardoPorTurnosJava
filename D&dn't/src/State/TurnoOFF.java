package State;

class TurnoOFF implements EstadoTurno{
    @Override
    public EstadoTurno siguienteEstado() {
        return new TurnoAccion();
    }

    @Override
    public int queTurnoSoy() {
        return 2;
    }
}
