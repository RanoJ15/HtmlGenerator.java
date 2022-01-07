package day54_abstraction.abstract_class.person;

public class Developer extends Employee{

    @Override
    public void work() {
        System.out.println("Developer is creating feature");
    }

    @Override
    public void sleep(int minute) {
        System.out.println("Losing sleep because of bug");

    }
}

//Developer is a Employee
//Developer is a Person

