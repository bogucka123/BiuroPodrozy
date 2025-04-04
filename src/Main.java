public class Main {
    public static void main(String[] args) {
        Agency agency = new Agency();

        // Create some addresses
        Adress addr1 = new Adress("ParkAve", "CityOne", "11111", "10");
        Adress addr2 = new Adress("MainSt", "CityTwo", "22222", "20");
        Adress addr3 = new Adress("LakeRd", "CityThree", "33333", "30");
        Adress addr4 = new Adress("HillWay", "CityFour", "44444", "40");

        // Create clients (two adults, two minors)
        Client adult1 = new Client("Adam", "Smith", "adam.smith@test.com", "12345678901", addr1,
                new Date(1990, 5, 12, 0, 0));
        Client adult2 = new Client("Eve", "Johnson", "eve.johnson@test.com", "98765432109", addr2,
                new Date(1995, 8, 21, 0, 0));
        Client minor1 = new Client("Tom", "Brown", "tom.brown@test.com", "11111111111", addr3,
                new Date(2010, 10, 5, 0, 0));
        Client minor2 = new Client("Ann", "Watts", "ann.watts@test.com", "22222222222", addr4,
                new Date(2009, 7, 15, 0, 0));

        // Assign guardians for minors
        minor1.setGuardian(adult1);
        minor2.setGuardian(adult2);

        // Add clients to agency
        agency.addClient(adult1);
        agency.addClient(adult2);
        agency.addClient(minor1);
        agency.addClient(minor2);

        // Create some trips (past, current, future)
        Trip trip1 = new Trip(new Date(2022, 5, 10, 8, 0), new Date(2022, 5, 15, 18, 0), "Historic Tour");
        Trip trip2 = new Trip(new Date(2022, 12, 1, 10, 0), new Date(2022, 12, 5, 20, 0), "Winter Adventure");
        Trip trip3 = new Trip(new Date(2023, 1, 1, 9, 0), new Date(2023, 1, 2, 17, 0), "City Break");
        Trip trip4 = new Trip(new Date(2023, 10, 1, 9, 0), new Date(2023, 10, 5, 15, 0), "Mountains Hike");
        Trip trip5 = new Trip(new Date(2024, 1, 5, 7, 0), new Date(2024, 1, 10, 19, 0), "Desert Safari");
        Trip trip6 = new Trip(new Date(2024, 3, 12, 6, 0), new Date(2024, 3, 18, 22, 0), "Beach Holiday");
        Trip trip7 = new Trip(new Date(2024, 12, 25, 5, 0), new Date(2025, 1, 2, 23, 0), "New Year Cruise");

        // Add trips to agency
        agency.addTrip(trip1);
        agency.addTrip(trip2);
        agency.addTrip(trip3);
        agency.addTrip(trip4);
        agency.addTrip(trip5);
        agency.addTrip(trip6);
        agency.addTrip(trip7);

        // Show clients and trips
        System.out.println("Klienci:");
        agency.showClients();
        System.out.println();
        System.out.println("Wycieczki:");
        agency.showTrips();
    }
}