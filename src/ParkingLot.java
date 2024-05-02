import java.util.ArrayList;

public class ParkingLot {
    ArrayList<ParkingSpot> parkingSpotList;

    public ParkingLot() {
        this.parkingSpotList = new ArrayList<>();
    }

    boolean addParkingSpot(ParkingSpot parkingSpot) // Manager will call this from Main
    {
        parkingSpotList.add(parkingSpot);
        return true;
    }

    public ArrayList<ParkingSpot> getParkingSpotList() {
        return parkingSpotList;
    }
    public ArrayList<ParkingSpot> getEmptySlots()
    {
        ArrayList<ParkingSpot> emptySlotList = new ArrayList<>();
        for(int i=0; i<parkingSpotList.size(); i++)
        {
            ParkingSpot parkingSpot = parkingSpotList.get(i);
            if(parkingSpot.isEmpty){
                emptySlotList.add(parkingSpot);
            }
        }

        return emptySlotList;
    }

    public void occupy(ParkingSpot parkingSpot) {
        for(int i=0; i<parkingSpotList.size(); i++)
        {
            ParkingSpot currentParkingSpot = parkingSpotList.get(i);
            if(currentParkingSpot == parkingSpot)
            {
                currentParkingSpot.setEmpty(false);
            }
        }
    }

    public void free(ParkingSpot occupiedSlot) {
        for(int i=0; i<parkingSpotList.size(); i++)
        {
            ParkingSpot parkingSpot = parkingSpotList.get(i);
            if(parkingSpot == occupiedSlot)
            {
                parkingSpot.setEmpty(true);
            }
        }
    }
}
