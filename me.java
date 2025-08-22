import java.util.Scanner;
class Main

{

public static void main(String args[])

 {
 
     string_palindrom();




}

void string_palindrom( )
{

  String s = new String("madam");

char arr[] = s.toCharArray();

String copy ="";

for(int i=arr.length-1; i>=0; i--)
 {

         
        
        copy = copy+arr[i];  



}


if(copy.equals(s))
 {


  System.out.println("String palindrom");


}

}






/*

String s = new String("radha");
 
char arr[] = s.toCharArray();//[r,a,d,h,a]

 
char first_min = Character.MAX_VALUE;
char second_min = Character.MAX_VALUE;


for(int x=0;x<arr.length; x++)
{


     if(arr[x] < first_min)
     {
       
         second_min = first_min;
        first_min = arr[x];


    }

  else if(arr[x]>first_min && arr[x] <second_min)
        {

        second_min= arr[x];



      }




}
System.out.println(second_min);
  


*/





/*

//duplicate values in the array s tring

   String  s = "radha"; 
     char[] arr = s.toCharArray();
    String copy = "";
     
     //int arr[] = {1,1,2,3,3};
     boolean b[] = new boolean [arr.length];
   
    for(int i=0;i<arr.length;i++)
   {
     
     if(b[i] == true)
        continue;        
   
      int count=1;
     for(int j=i+1; j<arr.length; j++)
   {


              if(arr[i] == arr[j])
                {
                   count++; 
                  b[j]= true;
                  

                 }


   }

   if(count>1)
  {


    copy=copy+arr[i];

   System.out.println(copy);
  }




}
     


*/
















  
/*
       String s = new String("abcdHFT");
    
       char[] ch =s.toCharArray(); //[a,b,c,d,H,f,T]

   String copy = " ";
    

   for(int  x=0; x<ch.length-1; x++) 
     {

      for(int y=x+1 ; y<ch.length; y++)
     {

            if(ch[x] > ch[y])
            {
                 // do swap
               char temp = ch[x];
               ch[x] = ch[y];
               ch[y] = temp;

    
            }  

 

     }
   
          
            
   }
 
  for(char t : ch)
{
  System.out.println(t);

}



*/
      
  /*
 int b [] = new int[ch.length]; // 97 98 99 100 72 70 84
   
    

             for(int j=0;j<ch.length;j++){

                  b[j] = ch[j];  //stroting values
               
                // System.out.println(b[j]);

                 } 

            // apply to sort 

           for(int i=0; i<b.length-1 ; i++)
          // fix the elemnts
          {
  
                   
                for(int j=i+1; j<b.length-1 ; j++)
               {


                    if( b[i] >b[j])
                     {

                         int temp = b[i];
                         b[j] = b[i];
                         b[i] = temp;
                        

                     }   


               }


           } 

          for(int temp : b)
            {
             System.out.println(temp);
        }
         
     
    
 

*/








/*
    String s = new String("abcdHFT");
    
       char[] ch =s.toCharArray();
 
      String copy = "";

  for(int i=0; i<ch.length; i++)
   {
        

       int min = i;
     for(int j= i+1; j<ch.length; j++)
   {

           if(ch[j]>ch[min])
            {
                 
               min =j;

           }
             
          
            char temp = ch[min];
             ch[min] = ch[j];
             ch[j] = temp;
  }

    

   }
for(char temp : ch)

  {
System.out.println(temp);


}
 

*/








/*
       String s = new String("Hi HOW radha");

       char[]ch =s.toCharArray();
     
      String copy = "";
    int vowel=0,consont=0;
  
    for(int i=0; i<ch.length; i++)
    {

       if(ch[i] == 'a' || ch[i] == 'e' || ch[i] =='i' || ch[i] == 'o' || ch[i] == 'u')

        {


           System.out.println(ch[i]);
          vowel++;
         
          copy = copy+ch[i];

          }   
   
        else 
             consont++;



   }   
 System.out.println("this is string:  "+copy);
 System.out.println(vowel +"<===vowel" + consont + "<===consonent");      


*/






/*
  String s = new String("hi you");

  char[]ch =s.toCharArray();
   String copy = "";

   for(int i=ch.length-1;i>=0; i--)
   {
   
        System.out.println(ch[i]);

        copy = copy+ ch[i];

    }
System.out.println(copy);


*/








/*
 String s = new String("hllo");
 char[] ch = s.toCharArray();//['h','l','l','o']
  int cap=0,small=0,n=0,symbol=0;

for(int i=0;i<ch.length;i++)
 {
  if( ch[i] > 'A' && ch[i] <'Z')
  {

     cap++;
  }
 else if( ch[i] > 'a' && ch[i] < 'z')
{

    small++;
}
else if( ch[i] > 0  && ch[i] < 9)
   {

     n++;

  }

else 
{
    symbol++;

}
   
}
System.out.println( cap + "<==cpatial "+ small + "<==small "+  n + "<-- numbers " + symbol + "<==otherspaces");

*/




/*
  String s = "radha";

  System.out.println(s.length());

*/




/*
 int a [] [] = new int[][]{{1,1,1},{1,1,1}};
 int b [] [] = new int[][]{{2,2,2},{2,2,2}};

 int[][] c  = new int[2][3];

for(int i=0; i<a.length; i++)
{

 for(int j=0; j<a[i].length;j++)
 {

       c[i][j] = a[i][j]+b[i][j];
      System.out.print(c[i][j] + " ");

}
System.out.println();

}


*/




/*

//count no of prime in the array

int arr[][] = new int [][]{{1,2,3},{1,2,3}};

int n =0;
for(int i=0; i<arr.length; i++)
{

      for(int j=0; j<arr[i].length;j++)
      {
 
         

          n = arr[i][j]; int count=0;
        for(int k=2; k<=n/2; k++)
       {

         if(n%k==0)
         {
         count++;
          }
       }
      if(count==0)
      {
       System.out.println("prime:->"+n);
      }


                           
      } 

}


*/
 
  
 




/*  both diagnols in the sd array.
int arr[] [] = new int [][]{{1,2,3},{1,2,4},{1,2,4}};


     int sum=0,sum1=0;
    for(int j=0,g=arr.length-1; j<arr.length; j++,g--)
      {

        sum +=arr[j][j];
        sum1 +=arr[j][g];


     }
     System.out.println(sum + " <===>"+ sum1 );


*/















// print the sum of rows
/*
  int arr[][] = new int[][]{{1,1,1},{2,2,2},{3,3,3}};
 
 for(int x=0;x<arr.length; x++) //0
  {
      int sum=0;

     for(int y=0; y<arr[x].length; y++)//
     {

          sum +=arr[x][y];
          
      }

        System.out.println("the sum of elemnts imn rows:-> " +sum);
 }



*/




/*
 // calculate the sum of all elemnts in the array

  int arr[][] =new int[][] {{1,2,3},{2,3,4},{1,2,4}};
   int sum=0;

  for(int x=0; x<arr.length; x++)
  {

    for(int y=0;y<arr[x].length; y++)
     {
          //System.out.println(arr[x][y]);
      
           sum += arr[x][y];   
     } 




 }
System.out.println(sum);
  


*/












 /*
 // jack array
 // which having the different element in the martix 

  int arr[][] = new int[][]{{1,2,3,4},{1,2,4},{1,2},{1}};

  for(int i=0; i<arr.length;i++)
    {

      for(int j=0;j<arr[i].length;j++)//4
       {

         System.out.print(arr[i][j]+ " ");


      }
        System.out.println();

   }


*/
















//take input the array elemnts
/*
Scanner sc = new  Scanner(System.in);
 
System.out.println("enter the elemments");

int arr[][] = new int[2][2];
for(int x=0;x<arr.length;x++)
 {

   for(int j=0; j<arr[x].length;j++)
    {

       arr[x][j] = sc.nextInt();   

     }


 }

for(int x =0; x<arr.length; x++)
 {

  for(int y=0;y<arr[x].length;y++)
  {

  System.out.print(arr[x][y]+ " ");

  }
System.out.println();
  
 }

*/









 // diagnoal of matrix
/*
 // approch
 // take 2d array
 // iterate a loop form o to arr.lenght
 // pint arr[x][x] 
 // sum the arr elements


int arr[][] = new int [][]{{1,2,3},{2,4,5},{2,3,5}};
int sum=0;
for(int x=0;x<arr.length; x++)
  {
     
     System.out.println(arr[x][x]+ "<== these are the the diganols");  
     sum += arr[x][x]; 

  }
 System.out.println(sum);
 

*/











/*  Transpose of a matrix
int arr[] []= new int[][] {{1,2,3},{4,5,6},{2,2,3}};

for(int i=0; i<arr.length; i++) //arr.length = 3
  {
 
   for(int j=0;j<arr[i].length; j++) //arr[i].leghth =4;
   {

      System.out.print(arr[j][i] + "  ");

   }
     System.out.println();

   }
*/























// print the the 2d matrix
 /*
  int arr[] [] = new int [] [] {{1,2,3},{4,5,6}};

  //this is fix the fist element arr[0],arr[1],arr[2]

  for(int i =0; i<arr.length; i++)//0 0<2
  {
    //this if for row irerarion
    for(int j=0; j<arr[i].length; j++)//j0 0<3
    {

      System.out.print(arr[i][j] + " ");//[0][0] //[0][1] //[0][2] //

    }
   System.out.println();

  }


*/




















/*


    int arr[] = {1,2,3,55};
  
    int copy = arr[0];
    for(int i=1; i<arr.length-1; i++)
   {
        
      arr[i]= arr[i+1];
      
  } 
   arr[arr.length-1]=0;

  for(int temp:arr)
   {

  
    System.out.println(temp);
 } 
  

*/






}