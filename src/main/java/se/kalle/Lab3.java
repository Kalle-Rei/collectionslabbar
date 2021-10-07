package se.kalle;
import java.util.Arrays;
import java.util.ArrayList;
// Uppgift:
// Skapa en ArrayList  kod med 5 stycken INTS. 12 ,55, 32, 9, 34.   
// Det ska vara en oneliner!
// Loopa igenom listan och räkna fram SUMMAN av alla tal
public class Lab3 {
    
    public void run(){
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(12,55,32,9,34));
        int sum = 0;
        for (Integer integer : myList) {
            sum+=integer;
        }
        System.out.println("Summan av talen är: " + sum + ".");
    }
}
