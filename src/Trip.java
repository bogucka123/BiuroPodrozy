public class Trip {
    private Date startDate;
    private Date endDate;
    private Date purchaseDate;
    private String description;

    public Trip(Date startDate, Date endDate, String description) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
        this.purchaseDate = Date.now();
    }

    public String getStatus() {
        Date current = Date.now();
        boolean beforeStart = compare(current, startDate) < 0;
        boolean afterEnd = compare(current, endDate) > 0;
        if (beforeStart) {
            return "oczekuje";
        } else if (afterEnd) {
            return "zakończona";
        } else {
            return "trwa";
        }
    }

    private int compare(Date d1, Date d2) {
        if(d1.getYear() != d2.getYear()) return d1.getYear() - d2.getYear();
        if(d1.getMonth() != d2.getMonth()) return d1.getMonth() - d2.getMonth();
        if(d1.getDay() != d2.getDay()) return d1.getDay() - d2.getDay();
        if(d1.getHour() != d2.getHour()) return d1.getHour() - d2.getHour();
        return d1.getMinute() - d2.getMinute();
    }

    public String toString() {
        return "Wycieczka: " + description
                + "\nPoczątek: " + startDate
                + "\nKoniec: " + endDate
                + "\nData zakupu: " + purchaseDate
                + "\nStatus: " + getStatus();
    }
}