package day58_exeptions.item.animal;

public class Panda extends Animal {
    @Override
    public Panda getAnimal() {
        return new Panda();
    }
}
