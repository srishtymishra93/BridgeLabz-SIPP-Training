class Chef extends Worker {
    Chef(String name, int id) {
        super(name, id);
    }

    @Override
    void performDuties() {
        System.out.println(name + " is cooking food.");
    }
}
