package InheritanceChallenge;

public class Car extends Vehicle {

    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;



    // at first you need make the constructor compatible with the parent class... (Vehicle)
    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {

        //SUPER calls the variable from the parent class...
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

   public void changeVelocity(int speed, int direction){
        move(speed, direction);
       System.out.println("Car.changeVelocity()> velocidade desse carro eh: " + getCurrentVelocity());

   }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Current gear change to " + this.currentGear + " gear.");
    }

    public void stopCar(){
        changeVelocity(0,0);
        changeGear(1);
    }

}
