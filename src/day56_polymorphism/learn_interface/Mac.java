package day56_polymorphism.learn_interface;

public interface Mac {

    String NAME = "Mac";
    String SOFTWARE = "IOS";

    void turnOn();//public abstract method

    public static void getBand(){
        System.out.println("Apple");
    }


    }
    class Runner2{
        public static void main(String[] args) {
            Mac.getBand();
            System.out.println(Mac.NAME);
            System.out.println(Mac.SOFTWARE);
        }

    }
