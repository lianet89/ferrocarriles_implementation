package controller;

import model.EquipoDeTraccion;
import model.Locomotora;
import model.Viaje;

import java.util.ArrayList;

public class EstacionDeTrenes {
    private ArrayList<Viaje> viajes;
    private ArrayList<EquipoDeTraccion> lineaPrincipal;
    private ArrayList<EquipoDeTraccion> lineaSecundaria;

    public EstacionDeTrenes(ArrayList<Viaje> viajes, ArrayList<EquipoDeTraccion> lineaPrincipal, ArrayList<EquipoDeTraccion> lineaSecundaria) {
        this.viajes = viajes;
        this.lineaPrincipal = lineaPrincipal;
        this.lineaSecundaria = lineaSecundaria;
    }
    public void AdicionarEquipoDeTraccion(EquipoDeTraccion equipo){
       //implementar funcionalidad
       
    }
    public void AdicionarViaje(){
        //implementar funcionalidad
    }
}
