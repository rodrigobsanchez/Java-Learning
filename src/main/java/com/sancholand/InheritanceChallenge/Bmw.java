package InheritanceChallenge;

public class Bmw extends Car {

    private int roadService;


    // I'm implementing all inherited values inside of the Constructor.
    public Bmw(int roadService) {
        super("BMW Car", "4 people comfortable", 4, 4, 5, true);
        this.roadService = roadService;
    }

    public void accelerate(int rate){
        int newVelocity = getCurrentVelocity() + rate;

        if(newVelocity == 0){
            //dont need a reference because BMW have everything that class car have.
            stopCar();
            changeGear(1);
        }else if(newVelocity > 0 && newVelocity <= 10){
            changeGear(1);
        }else if(newVelocity > 10 && newVelocity <= 30){
            changeGear(2);
        }else if(newVelocity > 30 && newVelocity <= 80){
            changeGear(3);
        }else if(newVelocity > 80 && newVelocity <= 120 ){
            changeGear(4);
        }else if (newVelocity > 220){
            stopCar();
            changeGear(1);
            System.out.println("surpass maximum velocity...The car just broke you moron");
        }
        else {
            changeGear(5);
            System.out.println("BMW Velocity is 170km/h and incresing until 220km/h");
        }

        if(newVelocity > 0){
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }

    public int getRoadService() {
        return roadService;

    }
}
