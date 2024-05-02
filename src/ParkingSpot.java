public class ParkingSpot {
    String spotId;
    boolean isEmpty;

    public ParkingSpot(String spotId) {
        this.spotId = spotId;
        this.isEmpty = true;
    }

    @Override
    public String toString() {
        return "ParkingSpot{" +
                "spotId='" + spotId + '\'' +
                ", isEmpty=" + isEmpty +
                '}';
    }

    public String getSpotId() {
        return spotId;
    }

    public void setSpotId(String spotId) {
        this.spotId = spotId;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}
