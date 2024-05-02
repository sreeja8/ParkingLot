import java.util.Random;

public class Ticket {
    private int ticketId;
    private Vehicle vehicle;
    private ParkingSpot slot;

    public Ticket(Vehicle vehicle, ParkingSpot slot) {
        Random rand = new Random();
        this.ticketId = rand.nextInt();
        this.vehicle = vehicle;
        this.slot = slot;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpot getSlot() {
        return slot;
    }

    public void setSlot(ParkingSpot slot) {
        this.slot = slot;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId=" + ticketId +
                ", vehicle=" + vehicle.getNumber() +
                ", slot=" + slot +
                '}';
    }
}
