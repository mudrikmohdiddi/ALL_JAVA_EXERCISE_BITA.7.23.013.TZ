public class ProductionWorkerTest {
    public static void main(String[] args) {
        ProductionWorker worker1 = new ProductionWorker("MUDRIK IDDI", 1, 1, 50000);
        ProductionWorker worker2 = new ProductionWorker("AKRAM IDDI", 2, 2, 90000);
        System.out.println(worker1.toString());
        System.out.println(worker2.toString());
    }
}
