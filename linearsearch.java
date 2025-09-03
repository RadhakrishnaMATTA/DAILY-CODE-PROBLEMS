class Main

{

public static void main(String args[])

 {



//secod largest without sorting



int arr[]= {2,4,6,1,9};
int first_max = Integer.MAX_VALUE;//+24444
int second_max = Integer.MIN_VALUE;//-21

int l = arr[0];
//second highest

System.out.println(first_max + " " +second_max);

for(int i=0;i<arr.length;i++)
{

   if(arr[i] > second_max)
   {

      second_max=arr[i];
  
   }
    if(arr[i] < first_max)
   {

      first_max=arr[i];
  
   }




}
System.out.println(second_max);

System.out.println(first_max);


/*

int first_max = arr[0];
 
for(int i=0; i<arr.length;i++)
{

 if(arr[i] > first_max)
  {

     first_max = arr[i];

  }  
 


}
//System.out.println(first_max);

int second_max = Integer.MAX_VALUE;
System.out.println(second_max);

for(int j=0;j<arr.length; j++)
 {

   if(arr[j] == first_max)
     {

       continue;
     }

   if(arr[j] > second_max)
    {

      second_max=arr[j];
         }


}
System.out.println(second_max);
   



*/










/*

//linear search using for each loop

//binarysearch alg for desc ord sort array

//sort

int arr[] = {3,4,1,3,6,8};


for(int i=0;i<arr.length-1; i++) //0
{


  for(int j=0; j<arr.length-1; j++)
     {


      if(arr[j]<arr[j+1])
       {
        //do swap
        int temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;

       }


     }
}



int l = 0;
int r = arr.length-1;
boolean b = false;

int data = 6;

while(l<=r)
{

 int mid = (l+r)/2;

 if(data == arr[mid])
  {

  System.out.println("element found");
  b = true;

break;



   }
 
 else if( data > arr[mid])
 {


   r = mid -1;


 }

else 
{

   l = mid+1;
}



}




*/













   
}


}