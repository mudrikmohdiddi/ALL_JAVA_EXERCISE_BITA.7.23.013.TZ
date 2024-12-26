public class MotorBoatTest {
    public static void main(String[] args) {
        MotorBoat boat = new MotorBoat(50, 100, 0.05);

        boat.changeSpeed(50);
        boat.operate(2);
        System.out.println("Fuel left: " + boat.getFuel());
        System.out.println("Distance traveled: " + boat.getDistanceTraveled());
    }
}

