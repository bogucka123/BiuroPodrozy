public class DataVerification {
    public static boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return email.matches(emailRegex);
    }

    public static boolean isValidPesel(String pesel) {
        String peselRegex = "^[0-9]{11}$";
        return pesel.matches(peselRegex);
    }

    public static boolean isValidName(String name) {
        String nameRegex = "^[A-Z][a-z]+$";
        return name.matches(nameRegex);
    }

    public static boolean isValidSurname(String surname) {
        String surnameRegex = "^[A-Z][a-z]+$";
        return surname.matches(surnameRegex);
    }
}
