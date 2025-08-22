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
