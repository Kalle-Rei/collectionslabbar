package se.kalle;
// Uppgift:
// Skapa en ARRAY i kod med INTS 12 ,55, 32, 9, 34.   
// Ta fram vilket som är det STÖRSTA och MINSTA talet i arrayen
public class Lab1 {
    
    public void run(){
        int[] nummer = {12, 55, 32, 9, 34};
        int min = nummer[0]; 
        int max = nummer[0];
        for (int i : nummer) {
            if(i>max) max = i;
            if(i<min) min = i;
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

    }
}
