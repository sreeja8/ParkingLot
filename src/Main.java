import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Req 1
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.addParkingSpot(new ParkingSpot("1"));
        parkingLot.addParkingSpot(new ParkingSpot("2"));
        parkingLot.addParkingSpot(new ParkingSpot("3"));

        ParkingLotManager parkingLotManager = new ParkingLotManager(parkingLot);

        //Req 2
        Vehicle car1 = new Car("1234");
        Ticket ticket1 = parkingLotManager.park(car1);
        System.out.println(ticket1.toString());

        Vehicle bike = new Bike("3456");
        Ticket ticket2 = parkingLotManager.park((bike));
        System.out.println(ticket2.toString());

        Vehicle bike2 = new Bike("7891");
        Ticket ticket3 = parkingLotManager.park((bike2));
        System.out.println(ticket3.toString());

//        Vehicle bike3 = new Bike("789111");
//        Ticket ticket4 = parkingLotManager.park((bike3));
//        System.out.println(ticket4.toString());
        //Un-parking car
        parkingLotManager.unpark(ticket2);

        Vehicle bike3 = new Bike("789111");
        Ticket ticket4 = parkingLotManager.park((bike3));
        System.out.println(ticket4.toString());
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