public class ElectricVehicle extends Vehicle {
    private double batteryCapacity;
    private int range;

    // Constructor con batería y autonomía
    public ElectricVehicle(String brand, String model, double price, double batteryCapacity, int range) {
        super(brand, model, price); // Llamada al constructor de la clase base
        this.batteryCapacity = batteryCapacity;
        this.range = range;
    }

    // Sobrescribir displayInfo para incluir la capacidad de la batería
    @Override
    public void displayInfo() {
        super.displayInfo(); // Llamar al método displayInfo de la clase base
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Range: " + range + " km");
    }

    // Método adicional para mostrar la autonomía
    public void displayRange() {
        System.out.println("Range: " + range + " km");
    }
}