import java.util.*;
import java.io.*;
class isomor
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
String s1=sc.next();
String s2=sc.next();
String s3=s2;
for(int i=0;i<s1.length();i++)
  {
   for(int j=0;j<s2.length();j++)
     {
          if(s1.indexOf(i)==s2.indexOf(j))
       {
           System.out.println(s1.charAt(i)+":::"+s2.charAt(j));  
         s2.replace(s2.charAt(j),s1.charAt(i));
          
        }

      }

  }
 if(s2.equals(s1))
   {
     System.out.println("true");
   }
else
  System.out.println("false");
}
}
