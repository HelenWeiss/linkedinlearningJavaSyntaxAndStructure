package objects;

public class CarPracticeObject {

    public static void main(String[] args) {

        String make = "Toyota";
        String model = "Camry";
        String color = "blue";
        int year = 2024;

        Car result = buildCar(make, model, year, color);
        System.out.println(result);

    }


    static Car buildCar(String make, String model, int year, String color) {
        // TODO: Your code goes here.
        Car car = new Car(make, model);

        car.setYear(year);
        car.setColor(color);

        return car;
    }

    static class Car {
        private String make;
        private String model;
        private int year;
        private String color;

        public Car(String make, String model) {
            this.make = make;
            this.model = model;
        }

        // Getters and setters
        public String getMake() {
            return make;
        }

        public void setMake(String make) {
            this.make = make;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return String.format("Car [Make: %s, Model: %s, Year: %d, Color: %s]", make, model, year, color);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Car car = (Car) obj;
            return  year == car.year &&
                    make.equals(car.make) &&
                    model.equals(car.model) &&
                    color.equals(car.color);
        }
    }


}
