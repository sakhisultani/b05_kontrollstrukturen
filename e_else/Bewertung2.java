public class Bewertung2
{ 
    public static void main (String[] args) 
    {
      int punkte;
      punkte = 49;
    
      // eine alternativ (verzweigung) wird mit dem 
      // schleusselwort if und einer bedingung eingeleitet.
      // wenn die bedingung erfeullt ist, wird der
      // nachfolgende rumpf ausgefeuhrt  (dann- zweig).
      // sonst wird der block ausgefeuhrt der dem 
      // schluesselwort else folgt "sonst-zweig": 

      if(punkte >= 50)
      {
         System.out.println("Bestanden");
      }
      else
      {
         System.out.println("Nicht bestanden");
      }
    }
}
