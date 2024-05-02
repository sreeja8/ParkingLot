import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParkingLotManager {
//    private List<Boolean> slotList;
//    private int total_slots;
    private ParkingLot parkingLot;

    public ParkingLotManager(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public Ticket park(Vehicle vehicle) {
        ArrayList<ParkingSpot> emptySlotsList = parkingLot.getEmptySlots();
        if(emptySlotsList.size() == 0){
            throw new RuntimeException("No Parking Spot available!!");
        }
        ParkingSpot parkingSpot = emptySlotsList.get(0);
        parkingLot.occupy(parkingSpot);
        Ticket ticket = new Ticket(vehicle, parkingSpot);
        return ticket;
    }



    public void unpark(Ticket ticket1) {
        ParkingSpot occupiedSlot = ticket1.getSlot();
        parkingLot.free(occupiedSlot);
        ticket1 = null;
        System.out.println("Next available slot"+ parkingLot.getEmptySlots());
    }
}
