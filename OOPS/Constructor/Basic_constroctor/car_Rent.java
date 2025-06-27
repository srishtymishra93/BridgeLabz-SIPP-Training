class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 1000.0;  // Default cost per day

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateTotalCost() {
        return rentalDays * costPerDay;
    }
}