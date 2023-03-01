public abstract class Wheeled extends Vehicles {

    @Override
    public void refuel() {
        //System.out.println("Refueling wheeled vehicle!");
        this.refueled = true;
    }

    @Override
    public void goToLocation(String location) {
       // System.out.println("Going to location with wheeled vehicle!");
        this.location = location;
    }

    
}
