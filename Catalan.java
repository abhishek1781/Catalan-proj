import java.util.*;

import java.math.*;

class Catalan {
  
  public static void main(String[]args ) 
{
   
     Scanner input=new Scanner(System.in);
  
      int n=input.nextInt();
   
     BigInteger fact=BigInteger.valueOf(1);
  
      for(int i=1;i<=2*n;i++)

        fact=fact.multiply(BigInteger.valueOf(i));
   
     BigInteger w=BigInteger.valueOf(1);
  
      for(int i=1;i<=n+1;i++)
  
      w=w.multiply(BigInteger.valueOf(i));
 
       BigInteger k=BigInteger.valueOf(1);
 
       for(int i=1;i<=n;i++)
  
      k=k.multiply(BigInteger.valueOf(i));
  
      BigInteger c,d;
 
       c=w.multiply(k);
  
      d=fact.divide(c);

        System.out.print(d);

        
    }

}
