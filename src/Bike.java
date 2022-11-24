public class Bike implements Vehicle {
    private String vehicleNumber;
    public Bike(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    @Override
    public String getNumber(){
        return this.vehicleNumber;
    }
}
