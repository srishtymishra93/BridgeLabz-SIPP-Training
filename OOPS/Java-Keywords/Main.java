public class Main {
    public static void main(String[] args) {
        // BankAccount
        BankAccount account1 = new BankAccount("Alice", 1001);
        BankAccount account2 = new BankAccount("Bob", 1002);
        account1.displayDetails();
        account2.displayDetails();
        BankAccount.getTotalAccounts();

        System.out.println();

        // Book
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");
        Book book2 = new Book("1984", "George Orwell", "9780451524935");
        book1.displayBookDetails();
        book2.displayBookDetails();
        Book.displayLibraryName();

        System.out.println();

        // Employee
        Employee emp1 = new Employee("John Doe", 101, "Manager");
        Employee emp2 = new Employee("Jane Smith", 102, "Developer");
        emp1.displayDetails();
        emp2.displayDetails();
        Employee.displayTotalEmployees();

        System.out.println();

        // Patient
        Patient patient1 = new Patient("Michael", 45, "Flu", 201);
        Patient patient2 = new Patient("Sarah", 30, "Cold", 202);
        patient1.displayPatient();
        patient2.displayPatient();
        Patient.getTotalPatients();

        System.out.println();

        // Product
        Product product1 = new Product("P001", "Laptop", 75000.0, 5);
        Product product2 = new Product("P002", "Smartphone", 35000.0, 10);
        product1.displayProduct();
        product2.displayProduct();
        Product.updateDiscount(15.0);
        System.out.println("Updated Discount:");
        product1.displayProduct();

        System.out.println();

        // Student
        Student student1 = new Student("Emma", 301, "A");
        Student student2 = new Student("Liam", 302, "B");
        student1.displayStudent();
        student2.displayStudent();
        Student.displayTotalStudents();

        System.out.println();

        // Vehicle
        Vehicle vehicle1 = new Vehicle("David", "Car", "MH12AB1234");
        Vehicle vehicle2 = new Vehicle("Sophia", "Bike", "MH12XY5678");
        vehicle1.displayVehicle();
        vehicle2.displayVehicle();
        Vehicle.updateRegistrationFee(6000.0);
        System.out.println("Updated Registration Fee:");
        vehicle1.displayVehicle();
    }
}
