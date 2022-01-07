package day46_constructors;

public class AccessModifier {

    public int a;
    int b;
    private int c;

    public static void main(String[] args) {
        AccessModifier obj = new AccessModifier();
        obj.a = 1;
        obj.b = 2;
        obj.c = 3;
    }
}
