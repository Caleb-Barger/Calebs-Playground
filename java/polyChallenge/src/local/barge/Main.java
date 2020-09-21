package local.barge;

public class Main {

    public static void main(String[] args) {
        Car fordFocus = new Car(2, "Ford Focus");

        fordFocus.startEngine();
        fordFocus.accelerate(45);
        fordFocus.brake();

        System.out.println(fordFocus);


    }
}
