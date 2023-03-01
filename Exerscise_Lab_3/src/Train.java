public class Train extends Tracked {

    public Train() {
        this.refueled = false;
        this.location = "Default";
    }

    @Override
    public String toString() {
        return "Train is refueled: " + refueled + " | " + " Location: " + location;
    }

}