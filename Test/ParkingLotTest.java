import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {

    @Test
    void addParkingSpot() {
        ParkingLot parkingLot = new ParkingLot();
        ParkingSpot parkingSpot = new ParkingSpot("1"); // prep
        boolean result = parkingLot.addParkingSpot(parkingSpot);// call
        assert result == true;

    }
}