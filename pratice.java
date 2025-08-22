class Main{

public static void main(String args[])

{

//=============prime range=====


/*
for(int j=1;j<=100;j++)
{

int n = j,count=0;


for(int i=1;i<=n/2;i++)
{

 if(n%i==0)
    {  
  
     count++;
     }


}
if(count ==1)
{

System.out.println(n);

}

}
*/





//=====palindrom number===

/*

for(int j=1; j<=100; j++)
{

 int n = j,rev=0,copy=n;


     while(n!=0)
 
    {
      rev = rev*10+(n%10);
      
  
      
      n/=10;
     }
     if(copy == rev)
      {

       System.out.println(rev);

       }
     
}


*/



//=======amstrong number====
/*

for(int j=1;j<=100;j++)
{
int n = j,temp=0,count=0,copy=n;
double sum =0;

   while(n!=0)
   {
     count++;//3
     n/=10;
   }//n=0
    
    
    while(copy!=0)
     {  

       temp=copy%10;//3

       double d = Math.pow(temp,count);
       sum = sum+d;

       n/=10;
      } //n=0

       
      if(sum==copy)
        {
         System.out.println(sum);
        }
}

}


*/

//====leapyear problem==

/*

for(int i =1;i<=100; i++)

{
  int year = i;

if(year%4==0 && year%100 !=0 ||year%400 ==0)

{
    System.out.println("leap year"+year);

}

}


*/




//======multiple table===
/*

for(int i=1; i<=10; i++)
{


    for(int j=1 ;j<=10;j++)
        { 

       System.out.println(i + "x"+ j + " =" + i*j); 

        }


}


*/



/*
//largest of nnumber in digit

  int n = 123,a=0;

    while(n!=0)
   {
    
     
    temp= n%10; 
   if(a>temp)                             //112//2//a<2
      {
       
        largest =temp
          
      }
   
   
     n/10;

    }
     

*/


/*   

//========evil number========


int n = 9,temp=0,space=0,rem=0;

temp = n*n;
//System.out.println(temp);

while(temp!=0)
{
  rem = temp%10;
  space = rem +space;

   
   
 
 temp/=10;
}
   
if(n==space)
{

System.out.println("evil number");
}


*/



/*
//========= power number ==
int n = 132,sum=0,mult=1,temp=0; 
int copy = n;
while (n!=0)
    {
      
    temp = n%10;
     sum= sum+temp;
     mult= mult*temp;   
 
    n/=10;   
    } 

     if(sum==mult)
       {
      System.out.println(copy);

      }


*/



//=========busy number==========
/*

int n = 127,temp=0;

while(n!=0)
{
 
 temp= n%10;
 

   n/=10;
  break;
}                          


if(temp==7)
  {  
   System.out.println("the number is busy");

  } 
  else if(n%7==0)
  { 
  System.out.println("the number is a busy number");

   } 
   else
   {  

    System.out.println("number is not a busy number");
   }
    
*/



//4===== technology number


/*
int num = 2025,count=0,sum=0;

   //find digits
  while(num !=0)

   { 

    count++;  //4 digits
  
   num/=10;
   }


  //how to extract the laste two digit
   if (count==2)
     {  

     int num1=count2; 

     }
System.out.println(num1);
     
*/

/*
//==========3 automatic number==================
int n =76,count=0,sq=0;
int copy=n;

 while (n!=0)
{
 count++;
 n/=10;
}

 

sq = n * n ;

if(count==1 && count==2)
{
  
   temp = temp%10
   rem = rem*10+temp
 }

System.out.println(sq);
 
*/




///=======invav number=======
/*
int n =13,temp=0,sum=0,count=0,sum1=0,temp1=0;

while(n!=0)

{

 temp = n%10;
 sum= sum+temp;//6
  
 n/=10;
}
// System.out.println(count);
 System.out.println(sum);

while(sum!=0)  //6

{

 temp1 = sum%10; 
 sum1 = temp1+sum1;//6
  count ++;     //1

 sum/=10;
}
if(count ==1)
{
System.out.println("not inav number");
}
else {

  
      
   

System.out.println("");
}


 

*/





}


}