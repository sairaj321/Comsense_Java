package TBC.AnimalFamily;

class Tiger extends Animal{
    @Override
    void eat() {
        System.out.println("Tiger eating.");
    }

    @Override
    void sound() {
        System.out.println("Tiger growls.");
    }
}