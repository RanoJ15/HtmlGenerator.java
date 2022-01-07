package day54_abstraction.abstract_class.person;

public class Chef extends Employee{

    @Override
    public void work() {
        System.out.println("Cooking the meal");
    }

    @Override
    public void sleep(int minute) {
        System.out.println("Sleep with wooden spoon");

    }
}
