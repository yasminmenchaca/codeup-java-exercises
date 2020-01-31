import java.util.Date;

public class Car {
    public String make;
    public String model;
    public int year;
    public int mileage;
    private Date lastOilChange;
    public int carsOutThere = 0;
    private boolean running;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = 0;
        this.lastOilChange = new Date();
        this.running = true;
        carsOutThere++;
    }

    public String startYourEngine(String key) {
        if (key.equals("correct")) {
            return "Vroom";
        } else return "...";
    }

    public String drive() {
        if (this.running) {
            this.mileage++;
            return "Honk";
        } else return "...";
    }
}