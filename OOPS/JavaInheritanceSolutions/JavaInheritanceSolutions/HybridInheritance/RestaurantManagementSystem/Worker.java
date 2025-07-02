abstract class Worker extends Person {
    Worker(String name, int id) {
        super(name, id);
    }

    abstract void performDuties();
}
