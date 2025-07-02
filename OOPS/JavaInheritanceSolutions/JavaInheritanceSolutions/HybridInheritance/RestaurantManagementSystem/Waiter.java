class Waiter extends Worker {
    Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    void performDuties() {
        System.out.println(name + " is serving customers.");
    }
}
