import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Req 1
        ParkingLotManager parkingLotManager = new ParkingLotManager(10);

        //Req 2
        Vehicle car = new Car("1234");
        Ticket ticket1 = parkingLotManager.park(car);
        System.out.println(ticket1.toString());

        Vehicle bike = new Bike("3456");
        Ticket ticket2 = parkingLotManager.park((bike));
        System.out.println(ticket2.toString());

        //Un-parking car
        parkingLotManager.unpark(ticket2);
    }
}
/*
Parking Lot Requirements:
1. Create a parking lot with 'N' number of slots
2. Give a ticket to every incoming vehicle with slot number
3. Support different type of vehicles - car, truck, bike
4. Get the slot id using ticket id
5. You should be able to park and un-park the vehicle
 */