public class Car extends Wheeled {

    public Car(){
        this.refueled = false;
        this.location = "Default";
    }
    
    @Override
    public String toString() {
        return "Car is refueled: " + refueled + " | " + " Location: " + location;
    }
}
