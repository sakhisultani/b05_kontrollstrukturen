public class Block
{ 
    public static void main (String[] args)
    {
         // eien veriable gilt nur in dem block, in dem deklariert wurde.
         // (eine veriable kann auch im kopf
         // eines blocks fuer diesen block deklariert werden.
        { 
        int  i = 42;
        }
 
       // System.out.println(i);   // geht nicht.
                                   // ist auserhalb des blocks 
       int j = 43;

       {
          System.out.println(j);        // geht! 
                                        // ist in einem "unterblock".
       }
    }
}
