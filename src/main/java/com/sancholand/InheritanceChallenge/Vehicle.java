package InheritanceChallenge;

public class Vehicle {



    private String name;
    private String size;
    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    // What direction in degres our steering wheel is at moment.
    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer() --> Vehicle steer is at  " + currentDirection + " degress.");
    }

    public void move(int velo, int direction){
        this.currentVelocity = velo;
        currentDirection = direction;

        System.out.println("Vehicle.move() --> Vehicle is moving at " + currentVelocity + " in direction " + currentDirection);
    }

    public void stopCar(){
        this.currentVelocity = 0;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public void setCurrentVelocity(int currentVelocity) {
        this.currentVelocity = currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }
}
