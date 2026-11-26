public class TestVehicle {
    public static void main(String[] args) {
        System.out.println("Manufacturer: " + Vehicle.MAKE);
        System.out.println("Number of vehicles manufactured: " + Vehicle.numVehicles);

        // Soal 1f - 1l
        Vehicle vehicle1 = new Vehicle("Vision");
        System.out.println(vehicle1);

        Vehicle vehicle2 = new Vehicle("Edict");
        System.out.println(vehicle2);

        // Soal 2a & 2b: Mengubah static variable MAKE
        vehicle2.setMake("Seer");
        System.out.println(vehicle1);
        System.out.println(vehicle2);

        // Soal 4d & 4e: Membuat instance Engine vehicle3
        Vehicle.Engine vehicle3 = new Vehicle.Engine("Fortune");
        System.out.println("Vehicle number " + vehicle3.getChassisNo() +
                           " is a " + vehicle3.getModel() +
                           " model and has an engine capacity of " +
                           Vehicle.Engine.getCAPACITY() + "cc");

        System.out.println("Number of vehicles manufactured: " + Vehicle.numVehicles);
    }
}