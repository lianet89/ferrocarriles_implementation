import controller.EstacionDeTrenes;
import model.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <EquipoDeTraccion> lineaPrincipal = new ArrayList<EquipoDeTraccion>();
        ArrayList <EquipoDeTraccion> lineaSecundaria = new ArrayList<EquipoDeTraccion>();
        ArrayList <Viaje> viajes = new ArrayList<Viaje>();
        EstacionDeTrenes estacion = new EstacionDeTrenes(viajes, lineaPrincipal, lineaSecundaria);

        Itinerario itinerario1 = new Itinerario(1, 300, 20,"La Habana", "Sancti Spiritus"); //No existen equipos disponibles
        Itinerario itinerario2 = new Itinerario(2, 500, 2,"Matanzas", "Las Tunas"); //Coche motor con 555km recorridos
        Itinerario itinerario3 = new Itinerario(3, 850, 10,"Pinar del Río", "Camagûey"); //Locomotora con 940km recorridos
        Itinerario itinerario4 = new Itinerario(4, 148, 12,"Pinar del Río", "La Habana"); //No existen equipos disponibles

        EquipoDeTraccion locomotora1 = new Locomotora(1111, 940,3500, "SD50");
        EquipoDeTraccion locomotora2 = new Locomotora(2222, 600,4500, "DF76");
        EquipoDeTraccion locomotora3 = new Locomotora(3333, 1030, 2000, "SD50");
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
            System.out.println("La línea principal tiene "+ lineaPrincipal.size()+" equipos de tracción.\n");
            estacion.adicionarEquipoDeTraccion(locomotora3);   //Agregar nuevo equipo de tracción a la estación
            System.out.println("Después de adicionarEquipoDeTracción(locomotora3), la línea principal tiene "+ lineaPrincipal.size()+" equipos de tracción.\n");
            estacion.adicionarViaje(itinerario1);
            System.out.println("Después de adicionarViaje(itinerario1), la línea principal tiene "+ lineaPrincipal.size()+" equipos de tracción.\n");
            estacion.adicionarViaje(itinerario2);
            System.out.println("Después de adicionarViaje(itinerario2), la línea principal tiene "+ lineaPrincipal.size()+" equipos de tracción.\n");
            estacion.adicionarViaje(itinerario3);
            System.out.println("Después de adicionarViaje(itinerario3), la línea principal tiene "+ lineaPrincipal.size()+" equipos de tracción.\n");
            estacion.adicionarViaje(itinerario4);
            System.out.println("Después de adicionarViaje(itinerario4), la línea principal tiene "+ lineaPrincipal.size()+" equipos de tracción.\n");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }




    }
}