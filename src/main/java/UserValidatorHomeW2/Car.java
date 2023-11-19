package UserValidatorHomeW2;

public class Car {
    private String make;
    private String type;
    private Engine engine;

    public Car(String make,String type) {
        this.make = make;
        this.type = type;
        this.engine = new Engine();
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Engine getEngine() {
        return engine;
    }
}
