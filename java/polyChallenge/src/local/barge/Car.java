package local.barge;

public class Car {

    protected int maxSpeed = 80;
    protected int minSpeed = 0;
    protected int brakeInterval = 10;

    private boolean isRunning;
    private int cylinders;
    private int wheels;
    private String name;
    private int currentSpeed;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        wheels=4;
        isRunning=false;
        currentSpeed=0;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String getName() {
        return name;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void startEngine() {
        isRunning=true;
    }

    public void accelerate(int mph) {
        if (isRunning) {
            if (mph > maxSpeed) {
                System.out.println("Vehicle can't exceed " + maxSpeed + "mph");
                currentSpeed = maxSpeed;
            }
            else if (mph < currentSpeed) {
                System.out.println("Can't accelerate to a slower speed dingus");
            }
            else {
                currentSpeed = mph;
            }
        }

        else {
            System.out.println("Vehicle is not running (try turning the key)");
        }

    }

    public void brake() {
        if ((currentSpeed - brakeInterval) < 0) {
            currentSpeed = 0;
        }
        currentSpeed -= brakeInterval;
    }

    @Override
    public String toString() {
        return "Car{" +
                "maxSpeed=" + maxSpeed +
                ", minSpeed=" + minSpeed +
                ", brakeInterval=" + brakeInterval +
                ", isRunning=" + isRunning +
                ", cylinders=" + cylinders +
                ", wheels=" + wheels +
                ", name='" + name + '\'' +
                ", currentSpeed=" + currentSpeed +
                '}';
    }
}
