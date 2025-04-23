public class Itinerary {
    private String scheduleDetails;

    public Itinerary(String scheduleDetails) {
        this.scheduleDetails = scheduleDetails;
    }

    public String toString() {
        return "Harmonogram: " + scheduleDetails;
    }
}