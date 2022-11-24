import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParkingLotManager {
    private List<Boolean> slotList;
    private int total_slots;

    public ParkingLotManager(int slot) {
        this.total_slots=slot;
        this.slotList = new ArrayList<>();
        for (int i = 0; i < slot; i++) {
            this.slotList.add(false);
        }
    }

    public Ticket park(Vehicle vehicle) {
        int emptySlot = getEmptySlot();
        slotList.set(emptySlot, true);
        Ticket ticket = new Ticket(vehicle, emptySlot);
        return ticket;
    }

    private int getEmptySlot() {
        int emptySlot=0;
        //System.out.printf("s: "+ this.slotList.get(0));
        for (Boolean filledSlot : slotList) {
            if (!filledSlot) {
                //System.out.println("Empty slot" + emptySlot);
                return emptySlot;
            }
            //System.out.println("Empty slot" + emptySlot);
            emptySlot++;
        }
        throw new RuntimeException("No empty slot found");
    }

    public void unpark(Ticket ticket1) {
        int free_slot = ticket1.getSlot();
        slotList.set(free_slot,false);
        ticket1 = null;
        System.out.println("Next empty slot"+ getEmptySlot());
    }
}
