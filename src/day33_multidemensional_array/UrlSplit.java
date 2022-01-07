package day33_multidemensional_array;

import java.util.Arrays;

public class UrlSplit {
    public static void main(String[] args) {

        String url = "https://learn.cybertekscool.com/courses/130";
        String [] parts = url.split("/");
        System.out.println(Arrays.toString(parts));

        Arrays.sort(parts);

        System.out.println(Arrays.toString(parts));

    }
}
