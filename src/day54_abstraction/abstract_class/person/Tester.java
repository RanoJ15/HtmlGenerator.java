package day54_abstraction.abstract_class.person;

public class Tester extends Employee{

    @Override
    public void work() {
        System.out.println("Run Test cases");
    }

    @Override
    public void sleep(int minute) {
        System.out.println("Sleeping " +minute + " while tests run automatically  ");

    }
}
