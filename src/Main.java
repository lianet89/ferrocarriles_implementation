import controller.EstacionDeTrenes;
import model.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <EquipoDeTraccion> lineaPrincipal = new ArrayList<EquipoDeTraccion>();
        ArrayList <EquipoDeTraccion> lineaSecundaria = new ArrayList<EquipoDeTraccion>();
        ArrayList <Viaje> viajes = new ArrayList<Viaje>();
        EstacionDeTrenes estacion = new EstacionDeTrenes(viajes, lineaPrincipal, lineaSecundaria);

        Itinerario itinerario1 = new Itinerario(1, 300, 20,"La Habana", "Sancti Spiritus");
        Itinerario itinerario2 = new Itinerario(2, 500, 2,"Matanzas", "Las Tunas");
        Itinerario itinerario3 = new Itinerario(3, 850, 10,"Pinar del Río", "Camagûey");
        Itinerario itinerario4 = new Itinerario(4, 148, 12,"Pinar del Río", "La Habana");

        EquipoDeTraccion locomotora1 = new Locomotora(1111, 940,3500, "SD50");
        EquipoDeTraccion locomotora2 = new Locomotora(2222, 600,4500, "DF76");
        EquipoDeTraccion locomotora3 = new Locomotora(3333, 1030, 2000, "SD00");
        EquipoDeTraccion cocheMotor1 = new CocheMotor(4444, 2500, 4000, true);
        EquipoDeTraccion cocheMotor2 = new CocheMotor(5555, 555, 5300, false);
        EquipoDeTraccion cocheMotor3 = new CocheMotor(6666, 4850,3000, true);

        //Llenar la lista lineaPrincipal
        lineaPrincipal.add(locomotora1);
        lineaPrincipal.add(locomotora2);
        lineaPrincipal.add(cocheMotor1);
        lineaPrincipal.add(cocheMotor2);
        lineaPrincipal.add(cocheMotor3);

        try {
            estacion.adicionarEquipoDeTraccion(locomotora3);
            estacion.adicionarViaje(itinerario1);
            estacion.adicionarViaje(itinerario2);
            estacion.adicionarViaje(itinerario3);
            estacion.adicionarViaje(itinerario4);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}