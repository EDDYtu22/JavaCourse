package DesignPatterns.src;

public class Bike {

    // class Bike and the nested class BikeBuilder represent the builder design pattern
    
    
    private String brand;
    private String model;
    private Float wheelSize;
    private char frameSize;
    private String frameMaterial;

    public Bike(String brand, String model, float wheelSize, char frameSize, String frameMaterial) {
        this.brand = brand;
        this.model = model;
        this.wheelSize = wheelSize;
        this.frameSize = frameSize;
        this.frameMaterial = frameMaterial;
    }

    public String toString() {
        return "Brand: " + this.brand +
                "\nModel: " + this.model +
                "\nFrame size: " + this.frameSize +
                "\nWheel size: " + this.wheelSize +
                "\nFrame material: " + this.frameMaterial;
    }

    public static class BikeBuilder {
        private String brand;
        private String model;
        private Float wheelSize;
        private char frameSize;
        private String frameMaterial;

        public BikeBuilder() {
            this.brand = null;
            this.model = null;
            this.wheelSize = null;
            this.frameSize = '-';
            this.frameMaterial = null;
        }

        public BikeBuilder withModel(String model) {
            this.model = model;
            return this;
        }

        public BikeBuilder withBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public BikeBuilder withFrameSize(char frSize) {
            this.frameSize = frSize;
            return this;
        }

        public BikeBuilder withWheelSize(float wheelSize) {
            this.wheelSize = wheelSize;
            return this;
        }

        public BikeBuilder withFrameMaterial(String frMaterial) {
            this.frameMaterial = frMaterial;
            return this;
        }

        public Bike build() {
            return new Bike(brand, model, wheelSize, frameSize, frameMaterial);
        }

    }

}
