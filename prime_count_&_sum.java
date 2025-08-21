import java.util.Scanner;
class Main

{

public static void main(String args[])
{
int count1=0,sum=0;
 for(int j=2; j<=100;j++)
 {
 
   int n = 13,count=0;
   for(int i =1; i<=j; i++)   //2<6 //3<6 //4<6
   {
 
        if(j%i==0)    //12%2==0// 
        {
     
           count++; //1
        }
   }
   if(count==2)
   {
   System.out.println("prime:-"+j);

     sum = sum+j;
    count1++;
    }
 }
  System.out.println(count1);
  System.out.println(sum);

}
}
