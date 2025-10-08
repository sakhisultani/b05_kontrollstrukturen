// b05_kontrollstruktur
// C_while

import java.io.*;

public class WhileSchleife
{ 
    public static void main (String[] args) throws Exception 
    {
       InputStreamReader eingabeleser;
       BufferedReader gepufferterLeser;
       String         eingabeText = "";
       int            eigabeZahl = 0;  

       boolean test 

       eingabeleser      = new InputStreamReader( System.in);
       gepufferterLeser  = new BufferedReader(eingabeleser);

       // die while schleife enthealt in ihrem kopf eine 
       // bedingung.
       // eine bedingung ist ein ausdrukc, der einen 
       // WAHRHEITSWERT hat (ture oder false, typ : boolean)
       // diese bedingung wied vor jedem schleifendurchlauf 
       // geprueft.
       // wenn sie erfeullt ist wird der schleifenrumpf 
       // durchlaufen.
       // wenn nicht , findet keine wiederholung mehr statt.
       // != bedeutet ungleich. 

       while(eigabeZahl != 4711)
       {
          System.out.println("Bitte die PIN eingeben :");

          eingabeText = gepufferterLeser.readLine();
          eigabeZahl = Integer.parseInt(eingabeText);
       }
       
       System.out.println();
       System.out.println("Eingegeben wurde" + eigabeZahl);
    }
}
