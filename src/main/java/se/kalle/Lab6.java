package se.kalle;
import java.util.ArrayList;
// Uppgift:
// Skriv ett program där man matar in strängar (namn på hockeyspelare) . 
// Lägg hela tiden namnn i en Lista
// Skriver man in EXIT och antalet är större eller lika med 5 så avsluta loopen
// Skriver man in EXIT och antalet är mindre med 5 så säg "Nej nej fortsätt mata in några till!!"
// När loopen avslutats. Räkna ut vilken spelare som har det LÄNGSTA namnet. Skriv ut det namnet och
// dessutom hur många tecken namnet består av

public class Lab6 {

    public void run(){
        ArrayList<String> nameList = new ArrayList<>();
        String name = "";
        String longestName = "";

        while(true){
            System.out.print("Mata in ett namn eller avsluta med \"Exit\": ");
            name = System.console().readLine();
            if(!name.equalsIgnoreCase("exit")) nameList.add(name);
            else if(name.equalsIgnoreCase("exit") && (nameList.size()<5)) System.out.println("Nej nej fortsätt mata in några till!!");
            else if(name.equalsIgnoreCase("exit") && (nameList.size()>=5)) break;
        }
        for (String string : nameList) {
            if(string.length()>=longestName.length())longestName = string;
        }
        System.out.println("Längst namn: " + longestName);
    }
    
}
