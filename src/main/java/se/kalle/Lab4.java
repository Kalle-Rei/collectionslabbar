package se.kalle;
import java.util.Arrays;
import java.util.ArrayList;
// Uppgift:
// Skapa en ArrayList med några stängar tex
// "abc", "xyz", "aba", "1221"
// Loopa igenom och räkna hur många som
// - är minst två tecken OCH det första och det sista tecknet är detsamma  (aba)
public class Lab4 {

    public void run(){
        ArrayList<String> myList = new ArrayList<>(Arrays.asList("abc","xyz","aba","1221"));
        int counter = 0;
        for (String string : myList) {
            if((string.length() >= 1) && (string.charAt(0) == string.charAt(string.length()-1))) counter++;
        }
        System.out.println(counter);
    }
    
}
