import java.util.Scanner;
import java.util.regex.*;

public class JavaMethod {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a phrase: ");
        String str = input.nextLine();

        System.out.print("Number of words are: " + countWords(str) + "\n");
        System.out.print("Number of vowels are: " + countVowels(str) + "\n");



    }

    static int countWords(String phrase) {
        Pattern pattern = Pattern.compile(" ");
        Matcher matcher = pattern.matcher(phrase);

        int count = 0;
        while (matcher.find())
            count++;

        return ++count;
    }

    static int countVowels(String phrase2) {
        Pattern pattern = Pattern.compile("[aeiouAEIOU]");
        Matcher matcher = pattern.matcher(phrase2);

        int count2 = 0;
        while (matcher.find())
            count2++;

        return count2;
    }

}
