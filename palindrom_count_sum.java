import java.util.Scanner;
class Main

{

public static void main(String args[])
{
//palindrom range

int count=0,sum=0;


for(int i =1; i<=100; i++)

{
int temp=0;
int n = i,copy=n;

  while(n!=0)
  {
   temp =temp*10+(n%10);
   
   n/=10;
  }
  if(temp==copy)
  {
   System.out.println("amstrong :- "+temp);
   count++;
   sum=sum+i;
  }

}
System.out.println(count);
System.out.println(sum);



}
}
