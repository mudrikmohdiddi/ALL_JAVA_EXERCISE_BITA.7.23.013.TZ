public class MyOwnAutoShop {
    public static void main(String[] args) {
        Car car = new Car(200, 30000, "black");
        System.out.println("Car price "+car.doublegetSalePrice());
        Sedan sedan = new Sedan(40, 40000, "Black", 40);
        System.out.println("Sedan car price"+sedan.doublegetSalePrice());
    }
}
