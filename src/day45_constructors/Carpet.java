package day45_constructors;

public class Carpet {

    double width;
    double length;
    double unitPrice;
    boolean isPersian;
    double totalPrice;

    public Carpet(double inputWidth,double inputLength,double inputPrice,boolean inputIsPersian){
        width = inputWidth;
        length = inputLength;
        unitPrice = inputPrice;
        isPersian = inputIsPersian;

        totalPrice = width * length * unitPrice;

        if(isPersian){
            totalPrice += 200;
        }

    }

    @Override
    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", totalPrice=" + totalPrice +
                '}';
    }


}

