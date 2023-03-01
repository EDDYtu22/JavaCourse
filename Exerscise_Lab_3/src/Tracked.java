public abstract class Tracked extends Vehicles {

    @Override
    public void refuel() {
        // System.out.println("Refueling tracked vehicle!");
        this.refueled = true;
    }

    @Override
    public void goToLocation(String location) {
        // System.out.println("Going to location with tracked vehicle!");
        this.location = location;
    }

}
