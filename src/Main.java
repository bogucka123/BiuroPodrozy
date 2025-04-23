public class Main {
    public static void main(String[] args) {
        Agency agency = new Agency();

        Adress addr1 = new Adress("Aleje Jerozolimskie", "Warszawa", "00-001", "10");
        Adress addr2 = new Adress("Ulica Długa", "Kraków", "31-001", "20");
        Adress addr3 = new Adress("Ulica Krótka", "Gdańsk", "80-001", "30");
        Adress addr4 = new Adress("Ulica Szeroka", "Wrocław", "50-001", "40");

        Client adult1 = new Client("Jan", "Kowalski", "jan.kowalski@test.com", "12345678901", addr1, new Date(1990, 5, 12, 0, 0));
        Client adult2 = new Client("Anna", "Nowak", "anna.nowak@test.com", "98765432109", addr2, new Date(1995, 8, 21, 0, 0));
        Client minor1 = new Client("Tomasz", "Wiśniewski", "tomasz.wisniewski@test.com", "11111111111", addr3, new Date(2010, 10, 5, 0, 0));
        Client minor2 = new Client("Zofia", "Kowalczyk", "zofia.kowalczyk@test.com", "22222222222", addr4, new Date(2009, 7, 15, 0, 0));

        minor1.setGuardian(adult1);
        minor2.setGuardian(adult2);

        agency.addClient(adult1);
        agency.addClient(adult2);
        agency.addClient(minor1);
        agency.addClient(minor2);

        Trip trip1 = new Trip(new Date(2022, 5, 10, 8, 0), new Date(2022, 5, 15, 18, 0), "test");
        Trip trip2 = new Trip(new Date(2022, 12, 1, 10, 0), new Date(2022, 12, 5, 20, 0), "dsadsa");
        Trip trip3 = new Trip(new Date(2023, 1, 1, 9, 0), new Date(2023, 1, 2, 17, 0), "nbvnbv");
        Trip trip4 = new Trip(new Date(2023, 10, 1, 9, 0), new Date(2023, 10, 5, 15, 0), "Mgfdgdfe");
        Trip trip5 = new Trip(new Date(2024, 1, 5, 7, 0), new Date(2024, 1, 10, 19, 0), "gfdgfdgi");
        Trip trip6 = new Trip(new Date(2024, 3, 12, 6, 0), new Date(2024, 3, 18, 22, 0), "gfdggy");
        Trip trip7 = new Trip(new Date(2024, 12, 25, 5, 0), new Date(2025, 1, 2, 23, 0), "tretretr");

        agency.addTrip(trip1);
        agency.addTrip(trip2);
        agency.addTrip(trip3);
        agency.addTrip(trip4);
        agency.addTrip(trip5);
        agency.addTrip(trip6);
        agency.addTrip(trip7);

        System.out.println("Klienci:");
        agency.showClients();
        System.out.println();
        System.out.println("Wycieczki:");
        agency.showTrips();
    }
}