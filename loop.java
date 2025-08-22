class Main{

 public static void main(String args[])
{

/*

int  num= 12,count=0;

for(int i=1;i<=num;i++)
{
   if(num%i==0)
     {
      //System.out.println("dovisisnle"+i);
         
      count++;
      }
  
 
}
System.out.println(count==2?"prime":"not prime");
 

*/


//check multiple leap years 1543 to 1143

/*

int n = 1543,count=0;
for(int i=1543;i>=1150;i--)
{
   if(i%4==0 && i%100!=0 ||i%400==0)
{
      System.out.println(i);
  count++;
}
}
System.out.println(count);

*/

//56 72 

/*
int x= 56;
 
for(int i =1; i<=x;i++)
{
 if(x%i==0)
  {

    System.out.println(x);
  }
}


*/

//break

/*
int n = 100,count=0;

for(int i=1;i<=n;++i)
{
System.out.println(i);
if(i==10)
{
System.out.println("loop");
break;
 //continue;

}

}


*/
//break;

/*
int a =50; 

for(int i=1;i<=100;i++) //t  //t  //t  //
{
  if(a%i==0)             //t  //t  //f
{


System.out.println(i);  //1   //2

}


}

*/

/*
int year = 2024;


if(year%4==0 &&  year%100!=0  || year %400==0)
{

  System.out.println("this is leap "+year);

}else
 System.out.println("not a leap year");


*/



/*
char ch = 'A';// char alwys return alphabet values...

System.out.println(ch+32);

char n = 65;

System.out.println(n);

int d = (int)(n);
System.out.println(d);

*/



/*
for(int i=1;i<=200; i++)//
{

if(i>= 'A' && i<='Z')  //1>
{

System.out.println((char)i);
}

else if   ( i >='a' && i <='z')
     System.out.println((char)i);

}

*/

/*
// to reverse the alphabet values


char a = 'Z';


System.out.println();




//comman factore 


int num = 10;

int num1 = 100;


for(int i=1; i<=num; i++)
{

 if(num%i==0)
{

   System.out.println(i);
}


}

for(int j=1;j<=num1;j++)
{

if(num1%j==0)


{
System.out.println(j);

}

}
 
*/




//reverse common factor , reverse the factor



int a = 10;

int b = 100;
int sum=0;

int small = a<b?a:b; 
for(int i =1; i<=small  ; i++) //find smallest values here

{

   if(a%i==0 && b%i==0)
   {
     sum= i;
    System.out.println(sum);
         
   }

}
System.out.println(sum);























}

}