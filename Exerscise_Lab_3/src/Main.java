public class Main {
    public static void main(String[] args) {

        Vehicles[] trains = { new Train(), new Car(), new Train(), new Train(), new Train(), new Car() };

        for (Vehicles c : trains) {
            c.refuel();
            c.goToLocation("Burgas");
            System.out.println(c);
        }

    }

}