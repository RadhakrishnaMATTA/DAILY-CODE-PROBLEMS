import java.util.Scanner;
class Main{

public static void main(String args[])

{

int arr[] = {1,2,3,4,6,77,23,153};

  for(int i=0; i<arr.length; i++)
  {
 
  //System.out.println(arr[i]);

  int n = arr[i];  //1
 
  //amstong = 153 = 1*3 + 5*3 + 3*3 =153 
  int count=0,copy=n,rem=0,digit=0,sum=0;
    while(n!=0)
    {
 
    count++;    //find the count 
     n/=10;
     } 
    
  
     n=copy;
     while(n!=0)
     {

     rem = n%10;
     digit = (int)Math.pow(rem,count);
     sum = sum+digit;

     n/=10;
     }
    
       
     if(sum == arr[i])
    {

     System.out.println("this is the amstrong numner in that array"+arr[i]);
    }
   }
 


}

}
