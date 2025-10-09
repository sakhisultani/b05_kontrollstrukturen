public class ABCAnalyse
{ 
    public static void main (String[] args) 
    {
       char prioritaet = 'X';
       if(prioritaet == 'A')
       {
          System.out.println("Hoch");
       } 
       else 
       {
          if(prioritaet == 'B')
          {
             System.out.println("Mittel"); 
          }
          else
          {
             if(prioritaet == 'c')
             {
                System.out.println("Niedrig"); 
             }
             else
             {
                System.out.println("Unzulaessing");
             }
          }
        }
     }
}
