import java.util.Scanner;
class Main

{

public static void main(String args[])
{  
Scanner sc = new Scanner(System.in);
System.out.println("enter your number");
int n = sc.nextInt();
   
 int f = 0;
 int s = 1;
 for(int i =0; i<=n; i++)
 {

   System.out.println(f);
   int t = f+s;
   
     f = s;
     s = t;


  }
     



}
}
