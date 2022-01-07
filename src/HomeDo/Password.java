package HomeDo;

import java.util.ArrayList;
import java.util.Arrays;

public class Password {
    //2 *Q7:String -- Password Validation Task 1: Write a return method that can verify if a password is valid or not.
//Requirements:
// 1. Password MUST be at least have 6 characters and should not contain space.
// 2. Password should at least contain one upper case letter
// 3. Password should at least contain one lowercase letter
// 4. Password should at least contain one special characters
// 5. Password should at least contain a digit if all requirements above are met, the method returns true, otherwise returns false


    public static void getBestPassword(String input) {

        int n = input.length();
        boolean hasLower = false,
                hasUpper = false,
                hasDigit = false,
                specialChar = false;
        ArrayList<Character> set = new ArrayList<Character>(
                Arrays.asList('!', '@', '#', '$', '%', '^', '&',
                        '*', '(', ')', '-', '+'));
        for (char i : input.toCharArray())
        {
            if (Character.isLowerCase(i))
                hasLower = true;
            if (Character.isUpperCase(i))
                hasUpper = true;
            if (Character.isDigit(i))
                hasDigit = true;
            if (set.contains(i))
                specialChar = true;
        }

        if (hasDigit && hasLower && hasUpper && specialChar
                && (n <= 8)){
            System.out.print("true");
        }else{
            System.out.print("false");
    }

}

    // Driver Code
    public static void main(String[] args)
    {
        String input = "Ge!@12";
        getBestPassword(input);
    }
}
