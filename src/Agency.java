import java.util.ArrayList;
import java.util.List;

public class Agency {
    private List<Client> clients = new ArrayList<>();
    private List<Trip> trips = new ArrayList<>();

    public void addClient(Client client) {
        clients.add(client);
    }

    public void addTrip(Trip trip) {
        trips.add(trip);
    }

    public void showTrips() {
        for (Trip t : trips) {
            System.out.println(t + "\n");
        }
    }

    public void showClients() {
        for (Client c : clients) {
            System.out.println(c + "\n");
        }
    }

    public String toString() {
        return "To biuro wycieczkowe ma " + clients.size() + " klientów i " + trips.size() + " wycieczek.";
    }
}