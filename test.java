import java.util.Scanner;
class Main{

public static void main(String args[])

{

String s = new String("RadhaA");

char arr[] = s.toCharArray();
 //bubble sort alg


for(int x=0; x<arr.length-1;x++)
 {

    for(int y=0 ;y<arr.length-1;y++)
     {

          if(arr[y] < arr[y+1])
            {
              //do swap

              char temp = arr[y];
             arr[y] = arr[y+1];
             arr[y+1] = temp;
 
               
            }
          
 
     }


 }

for(char temp : arr)
 {
   System.out.println(temp);

}









/*
 int cap=0,small=0,number=0,symbol=0;

for(int i=0; i<arr.length;i++)
 {

     if(arr[i] >= 'A' && arr[i] <= 'Z')
     {
       int x = (int) arr[i];   
   
       int y = x+32;
      char hlo = (char)y;

    System.out.println(hlo);    

      }

      else if(arr[i] >= 'a' && arr[i] <= 'z')
      {

           int x = (int) arr[i];   
   
         int y = x-32;
         char hlo = (char)y;

       System.out.println(hlo);  



      }


*/
/*     
else if ( arr[i] >=0 && arr[i] <='9')
            {
             number++;
            }

     else {


            symbol++;


          }

*/





/*
System.out.println(cap);

System.out.println(small);


System.out.println(number);


System.out.println(symbol);

*/




/*
int arr[]= {1,2,3,4,5,6,7};

int smallest = arr[0];
for(int i=1; i<arr.length; i++)
 {

   if( arr[i] < smallest)
      {

       smallest=arr[i];

      }

 }
System.out.println("first_smallest_value :"+smallest);  //0

int second_smallest =Integer.MAX_VALUE;
for(int i=0; i<arr.length;i++)//
  {

    if(arr[i]== smallest)
     {
       continue;
    
    }
   // System.out.println("hi");
    
    if(arr[i] < second_smallest)
   {
 
          second_smallest = arr[i];
   }
  
 }
System.out.println("second_smallest_value:  "+second_smallest);
 
*/


}

}