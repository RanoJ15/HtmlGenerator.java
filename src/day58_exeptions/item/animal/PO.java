package day58_exeptions.item.animal;

public class PO extends Panda {

    @Override
    public PO getAnimal() {
        return new PO();
    }
}
