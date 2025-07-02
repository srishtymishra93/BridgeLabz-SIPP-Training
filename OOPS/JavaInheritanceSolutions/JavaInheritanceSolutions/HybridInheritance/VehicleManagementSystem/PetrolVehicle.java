class PetrolVehicle extends Vehicle {
    Refuelable refuelable;

    PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
        this.refuelable = new Refuelable() {
            @Override
            void refuel() {
                System.out.println(model + " is refueling.");
            }
        };
    }

    void refuel() {
        refuelable.refuel();
    }
}
