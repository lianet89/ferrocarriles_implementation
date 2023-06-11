package model;

public class CocheMotor extends EquipoDeTraccion{
    private boolean climatizado;

    public CocheMotor(int numeroIdentificacion, int kilometrajeRecorrido, int potenciaMotor, boolean climatizado) {
        super(numeroIdentificacion, kilometrajeRecorrido, potenciaMotor);
        this.climatizado = climatizado;
    }

    public boolean isClimatizado() {
        return climatizado;
    }

    public void setClimatizado(boolean climatizado) {
        this.climatizado = climatizado;
    }

    @Override
    public int cantidadMaxCoches() {
        int i=0;
        if (potenciaMotor<4000){
            i=1;
        } else if (potenciaMotor>=4000) {
            i=2;
        }
        return i;
    }
}
