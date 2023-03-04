package DesignPatterns.src;

import java.util.ArrayList;
import java.util.List;

import DesignPatterns.src.Bike.BikeBuilder;

public class App {

    public static void main(String[] args) {

        Logger console = Logger.getInstance();

        // List<Animal> zoo = new ArrayList<>(45);
        // //console.log(zoo.size());
        // AnimalFactory factory = new AnimalFactory();
        // Animal infAnimal;

        // for(int i = 0; i < 10; i++){
        // if (i%2 == 0 ){
        // zoo.add(infAnimal = factory.getAnimal("Kuche"));
        // } else {
        // zoo.add(infAnimal = factory.getAnimal("KoTkA"));
        // }
        // console.infoLog(infAnimal.getClass() + " added to zoo list");
        // }

        // System.out.println(zoo);

        // for(Animal a : zoo){
        // System.out.println(a.name);
        // }

        // BikeBuilder builder = new BikeBuilder();
        // Bike myBike = builder.withBrand("TREK")
        // .withModel("PRO CALIBER")
        // .withFrameSize('M')
        // .withFrameMaterial("Carbon")
        // .withWheelSize(29)
        // .build();

        // System.out.println(myBike.toString());

        // System.err.println("eho");

        console.emergencyLog("Emergency exit");
        
        Weekday day = Weekday.FRIDAY;
        System.out.println(day.isWeekDay());
        System.out.println(day.isHoliday());

        

    }

}
