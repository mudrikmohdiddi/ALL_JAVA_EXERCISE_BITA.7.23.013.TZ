public class MotorBoat {
    private double fuelCapacity;
    private double currentFuel;
    private double maxSpeed;
    private double currentSpeed;
    private double efficiency;
    private double distanceTraveled;

    public MotorBoat(double fuelCapacity, double maxSpeed, double efficiency) {
        this.fuelCapacity = fuelCapacity;
        this.currentFuel = fuelCapacity;
        this.maxSpeed = maxSpeed;
        this.efficiency = efficiency;
        this.currentSpeed = 0;
        this.distanceTraveled = 0;
    }

    public void changeSpeed(double speed) {
        if (speed <= maxSpeed) {
            currentSpeed = speed;
        } else {
            System.out.println("Speed exceeds maximum limit!");
        }
    }

    public void operate(double time) {
        double fuelUsed = efficiency * Math.pow(currentSpeed, 2) * time;
        if (fuelUsed <= currentFuel) {
            currentFuel -= fuelUsed;
            distanceTraveled += currentSpeed * time;
        } else {
            System.out.println("Not enough fuel!");
        }
    }

    public void refuel(double fuel) {
        currentFuel = Math.min(fuelCapacity, currentFuel + fuel);
    }

    public double getFuel() {
        return currentFuel;
    }

    public double getDistanceTraveled() {
        return distanceTraveled;
    }
    public static void main(String[] args) {
        MotorBoat boat = new MotorBoat(50, 100, 0.05);

        boat.changeSpeed(50);
        boat.operate(2);
        System.out.println("Fuel left: " + boat.getFuel());
        System.out.println("Distance traveled: " + boat.getDistanceTraveled());
    }

}
