package State;

class TurnoAccion implements EstadoTurno{
    @Override
    public EstadoTurno siguienteEstado() {
        return new TurnoBonus();
    }

    @Override
    public int queTurnoSoy() {
        return 0;
    }
}
