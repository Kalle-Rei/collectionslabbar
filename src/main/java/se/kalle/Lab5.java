package se.kalle;
import java.util.Arrays;
import java.util.ArrayList;
// Uppgift:
// Skapa en lista i kod med 5 stycken INTS. 12 ,-5, 32, -9, 34.   
// Det ska vara en oneliner!
// Loopa igenom listan och räkna fram hur många av alla tal som är större än 0
public class Lab5 {
    
    public void run(){
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(12,-5,32,-9,34));
        int counter = 0;
        for (Integer integer : myList) {
            if(integer > 0) counter++;
        }
        System.out.println(counter);
    }
}
