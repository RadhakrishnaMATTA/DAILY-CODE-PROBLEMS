import java.util.Scanner;
class Main

{

public static void main(String args[])
{


for(int j=1;j<=100;j++)
{
int n = j,temp=0,copy=n,count=0;

 while(n!=0)
 {
 
   temp = temp*10+(n%10);   //reverse

    n/=10;

  }
  if(copy == temp) //plindrom heck
    {
   //System.out.println("plindrom:"+temp);
   
  
  
  for(int  i =2; i<=temp/2; i++) //loop for check prime

   {

       if(temp%i==0)
         {
          
            count++; 
         }
       

    }
    if(count==0)
      {

       System.out.println("this is the palindromlic prime number:"+temp);

      }
  
  }

}



}
}
