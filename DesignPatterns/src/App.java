package DesignPatterns.src;

import java.util.ArrayList;
import java.util.List;

import DesignPatterns.src.Bike.BikeBuilder;

public class App {

    public static void main(String[] args) {

        // List<Animal> zoo = new ArrayList<>();
        // AnimalFactory factory = new AnimalFactory();

        // zoo.add(factory.getAnimal("Kuche"));
        // zoo.add(factory.getAnimal("Kotka"));
        // zoo.add(factory.getAnimal("Kuche"));
        // zoo.add(factory.getAnimal("Kotka"));

        // for(Animal a : zoo){
        // System.out.println(a.name);
        // }

        BikeBuilder builder = new BikeBuilder();
        Bike myBike = builder.withBrand("TREK")
                .withModel("PRO CALIBER")
                .withFrameSize('M')
                .withFrameMaterial("Carbon")
                .withWheelSize(29)
                .build();

        System.out.println(myBike.toString());

    }

}
