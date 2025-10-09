// b05_kontrollstruktur
// d_if
public class Bewertung
{ 
    public static void main (String[] args) 
    {
       int punkte;
       punkte = 100;
    
         // eine "bedingte verarbeitung" wird mit dem 
         // schluesselwort if und einer bedingung eingeleitet.
         // nur wenn die bedingung erfuellt ist , wird der 
         // nachfolgende rumpf ausgefuehrt.   

       if(punkte >= 50)
       {
          System.out.println("Bestanden!");
       }

         // wenn zwei werte auf gleichheit gerpreufrt weden sollen,
         //  muss das dopperlte gleichheitszeichen benutzt werden.

       if(punkte == 100)
       {  
          System.out.println("Hervorrangen!");
       }  
    }
}
