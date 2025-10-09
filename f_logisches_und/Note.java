public class Note
{ 
    public static void main (String[] args) 
    {
       int punkte = 69;

       // der logische operstor && verknuepft zwei bedingungen 
       // zu einer gesamtbedingung. diese ist genau dann true,
       // wenn beide bedingungen true sind.
       // er stellt also eine und- verkunepfung dar.

       if(punkte >= 92 && punkte <= 100)
       {
          System.out.println("Sehr gut");
       }
       if(punkte >= 81 && punkte <= 91)
       {
          System.out.println("Gut");
       }
       if(punkte >= 67 && punkte <= 80)
       {
          System.out.println("Befriedigend");
       }
       if(punkte >= 50 && punkte <= 66)
       {
          System.out.println("Ausreichend");
       }
       if(punkte >= 30 && punkte <= 49)
       {
          System.out.println("Mangelhaft");
       }
       if(punkte >= 0 && punkte <= 29)
       {
          System.out.println("Ungeneugend");
       }

       // der logische operator | |  verknupft zwei bedingungen 
       // zu einer gesamt bedingung . diese ist genau dann true ,
       // wenn mindestens eine der beiden bedingugen true ist.
       // er stellt also eine oder verknuepfung dar.

       if(punkte < 0 || punkte > 100)
       {
          System.out.println("Unzulaessige Punktzahl");
       }
    }
}
