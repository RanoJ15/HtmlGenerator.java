package day58_exeptions.item;

public class Eragon extends Book{

    public Eragon(){
        super("Eragon");
    }

    @Override
    public void use(){
        System.out.println("Reading Eragon");
    }
    public void sell(){
        System.out.println("Selling Eragon books");
    }
}
