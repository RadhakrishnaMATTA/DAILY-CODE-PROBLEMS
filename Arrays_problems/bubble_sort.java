import java.util.Scanner;
class Main

{
public static void main(String args[])
{        //   0 1 2 3 4
  int arr[]={11,9,7,8,0};

           
 for(int j=0; j<arr.length-1; j++) // iterations 
  {

    for(int i=0; i<arr.length-1-j; i++) // this is for comparing
      {

 
           if(arr[i] > arr[i+1])
           {
             //do swap
           
             int temp = arr[i];
             arr[i] = arr[i+1];
             arr[i+1] = temp;
            
            }        


      }




 }       
           

 for(int r : arr)
  {

 System.out.println(r);
   }









}

}
