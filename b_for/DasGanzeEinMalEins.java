public class DasGanzeEinMalEins
{ 
    public static void main (String[] args)
    {
      int ergebnis = 0;

      System.out.println();
      System.out.println("EinMalEins");
      System.out.println("==========");

      // die aeussere schleife priduziert jeweils neun Zeilen
      for(int  faktor = 1; faktor <= 9; faktor++)
      {

         // die innere schleife priduziert jeweils eine zeile 
         // mit jeweils zehn zahlen. 
         for(int i = 1; i <= 10; i++)  
         {
            ergebnis = faktor * i;
            System.out.printf("%2d ", ergebnis);
         }

         System.out.println();
      }
      
    }
}
