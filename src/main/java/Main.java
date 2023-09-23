import Service.ClientCrudService;
import Service.PlanetCrudService;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Database db = new Database();
        db.init();

        testClient();
        testPlanet();
    }

    public static void testClient(){
        ClientCrudService clientService = new ClientCrudService();

        List allClient = clientService.listAll();
        System.out.println("All Clients: ");
        System.out.println(allClient);

        clientService.updateById(2, "Bobo");

        allClient = clientService.listAll();
        System.out.println("All Clients: ");
        System.out.println(allClient);

    }

    public static void testPlanet(){
        PlanetCrudService planetService = new PlanetCrudService();

        List allPlanets = planetService.listAll();
        System.out.println("All Planets: ");
        System.out.println(allPlanets);

        planetService.create("MAR2","Mars");

        allPlanets = planetService.listAll();
        System.out.println("All Planets: ");
        System.out.println(allPlanets);

        planetService.deleteById("PLU");
    }
}
