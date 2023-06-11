package model;

public class Locomotora extends EquipoDeTraccion{
    private  String marcaFabricante;

    public Locomotora(int numeroIdentificacion, int kilometrajeRecorrido, int potenciaMotor, String marcaFabricante) {
        super(numeroIdentificacion, kilometrajeRecorrido, potenciaMotor);
        this.marcaFabricante = marcaFabricante;
    }

    public String getMarcaFabricante() {
        return marcaFabricante;
    }

    public void setMarcaFabricante(String marcaFabricante) {
        this.marcaFabricante = marcaFabricante;
    }

    @Override
    public int cantidadMaxCoches() {
        int i;
        if (marcaFabricante.equalsIgnoreCase("SD50")){
            i=10;
        } else if (marcaFabricante.equalsIgnoreCase("DF76")) {
            i= 15;
        } else if (marcaFabricante.equalsIgnoreCase("MLW")) {
            i=20;
        } else {
            i=0;
        }
        return i;
    }
}
