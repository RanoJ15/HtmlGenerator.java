package day52_inheritance.lyft;

public class LiftXL extends Lyft {

    @Override
    public double calculateRate(int miles){
        return super.calculateRate(miles) * 0.1;
    }

}
