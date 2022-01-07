package HomeDo;

import java.util.Scanner;

public class Homework {




  //1 *Q6: String -- Sort Letters and Numbers from alphanumeric String: Given alphanumeric String, we need to split the string into substrings         of  consecutive letters or numbers, sort the individual string and append them back together Ex: Input: "DC501GCCCA098911" OutPut:       "CD015ACCCG011899"
        /*Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        String str2 = "";
        for(int i = 0; i < str.length(); i++) {
           str2 += str.charAt(i);
            if(Character.isAlphabetic(str.charAt(i)) && i < str.length()-1 ) {
                if(Character.isDigit(str.charAt(i+1)) ) {
                    str2 +=",";
                }
            }

            if(Character.isDigit(str.charAt(i)) && i < str.length()-1) {
                if(Character.isAlphabetic(str.charAt(i+1))) {
                    str2 +=",";
                }
            }
        }
        String[] arr = str2.split(",");
        str ="";
        for(String each: arr) {
            char[] chars=each.toCharArray();
            Arrays.sort(chars);
            for(char eachChar: chars){
                str +=""+eachChar;
            }
        }
        System.out.println(str);

         */
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println(countLetters(in.next()));
        }

        public static String countLetters(String str){

            String letter = "";

            for(int i = 0; i < str.length(); i++){
                if(letter.contains( "" + str.charAt(i))){
                    letter += str.charAt(i);

                }
            }
            String finalWord = "";

            for(int i = 0; i <letter.length(); i++){
                int count = 0;
                for(int j = 0; j < str.length(); j++){
                    if(letter.charAt(i) == str.charAt(i)){
                        count++;
                    }
                }
                finalWord += letter.charAt(i) + count;

            }

            return finalWord;
        }
    }






