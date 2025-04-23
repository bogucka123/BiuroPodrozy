public class Client {
    private String name;
    private String surname;
    private String email;
    private String pesel;
    private Adress adress;
    private Date birthDate;
    private Client guardian;

    public Client(String name, String surname, String email, String pesel,
                  Adress adress, Date birthDate) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.pesel = pesel;
        this.adress = adress;
        this.birthDate = birthDate;
    }

    public void setGuardian(Client guardian) {
        this.guardian = guardian;
    }

    public String toString() {
        String info = "Klient: " + name + " " + surname + "\nData urodzenia: " + birthDate + "\nEmail: " + email + "\nPesel: " + pesel + "\nAdres: " + adress;
        if (guardian != null) {
            info += "\nOpiekun: " + guardian.name + " " + guardian.surname;
        }
        return info;
    }
}