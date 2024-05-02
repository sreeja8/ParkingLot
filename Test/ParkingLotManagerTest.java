//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class ParkingLotManagerTest {
//
//    @Test
//    public void parkReturnsTicket() {
//
//        String vehicleNumber = "123";
//        Vehicle car = new Car(vehicleNumber);
//        int slot = 10;
//        ParkingLotManager parkingLotManager = new ParkingLotManager(slot);
//
//        Ticket ticket = parkingLotManager.park(car);
//
//        assert ticket.getVehicle().getNumber() == vehicleNumber;
//    }
//
//    @Test
//    void parkThrowsNoSlotException() {
////        preparation
//        Vehicle car1 = new Car("123");
//        Vehicle car2 = new Car("890");
//        ParkingLotManager parkingLotManager = new ParkingLotManager(1);
//        parkingLotManager.park(car1);
//
////        function call.
//        try{
//            parkingLotManager.park(car2);
//        } catch (RuntimeException re) {
//            assert re.getMessage() == "No empty slot found";
//        }
//
//
//    }
//}