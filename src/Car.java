public class Car extends Vehicle { // extends Object

    private int speed;

    public Car() {
        super();
        speed = 0;
    }

    public Car(String color, String make) {
        setColor(color);
        setMake(make);
    }

    // methods that return a string indicating each task the car is performing
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getSpeed() {
        return "The " + getColor() + getMake() + getModel() + " is going " + speed + " mph";
    }

    public String startEngine() {
        return "The " + getColor() + getMake() + getModel() + " is starting";
    }

    public String accelerate() {
        return "The " + getColor() + getMake() + getModel() + " is accelerating";
    }

    public String hasStopped() {
        return "The " + getColor() + getMake() + getModel() + " has stopped to have its emissions checked";
    }

    public String passTest() {
        return "The " + getColor() + getMake() + getModel() + " passes its emission test";
    }

    public String slowDown() {
        return "The " + getColor() + getMake() + getModel() + " is breaking";
    }

    public String isStopped() {
        return "The " + getColor() + getMake() + getModel() + " is stopped";
    }

    public String passCar(Vehicle vehicle, Vehicle vehicle2) {
        return "The " + vehicle.getColor() + vehicle.getMake() + vehicle.getModel() + " just passed the " + vehicle2.getColor() + vehicle2.getMake() + vehicle2.getModel();
    }

    public String getDescription(){
        return "The car you entered is a " + getYear() + " " + getColor() + " " + getMake() + " " + getModel() + " ";

    }

}

