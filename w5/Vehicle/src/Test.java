public class Test {
    public static void main(String[] args) {
        Truck vehicle1 = new Truck("1", "Toyota", "Camry", 4, 2, false);
        Van vehicle2 = new Van("2", "Honda", "Odyssey", 6, "Blue");
        Van vehicle3 = new Van("2", "Honda", "Odyssey", 6, "Blue");

        Vehicle[] vehicles = {vehicle1, vehicle2, vehicle3};
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println(vehicles[i]);
        }
        System.out.println();
        System.out.println("Are the two vans equal? "
                + vehicle2.equals(vehicle3));
    }
}
