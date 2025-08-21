import java.util.Scanner;
class Main

{

public static void main(String args[])
{
//amstrong number are 
//153= 1*3+5*3+3*3=153

int count1=0,sum1=0;

for(int i =1; i<=1000; i++)
{

int n = i,count=0,copy=n,temp=0,sum=0,digit=0;
   while(n!=0)
   {
   
    count++;
    n/=10; //count;
   }

  n=copy;

  while(n!=0)
  {

   temp= temp*10+(n%10); //reverse
   
    
    n/=10;
   }
//System.out.println(temp);
 
   while(temp!=0)
   {
     
    int rem = temp%10;
    digit = (int)Math.pow(rem,count);    
    sum = sum+digit;
   
    temp/=10;
   }
   if(sum==copy)
    {
     count1++;
     sum1 = sum1+ i; 
    System.out.println(i); 
    
    }


}

System.out.println("total count"+count1);
System.out.println("sum of amstrong"+sum1);




}
}
