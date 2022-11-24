public class Car implements Vehicle {
    private String vehicleNumber;

    public Car(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
     @Override
    public String getNumber(){
        return this.vehicleNumber;
     }

}
