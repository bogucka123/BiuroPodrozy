public class Agency {

    private Client[] clients;
    public Agency()
    {

    }
    public void handleClientDataCollection()
    {
        System.out.println("Wpisz dane klienta");
        System.out.print("Imie: ");
    }
    public void handleClientCreation(String name, String surname, String email, String pesel, Adress adress)
    {
        Client client = new Client(name, surname, email, pesel, adress);
    }
}
