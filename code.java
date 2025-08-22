class Main

{

public static void main(String args[])
{

/*
// amstrong number  153 == 1*1*1 + 5*5*5 + 3*3*3 == 153

 int n = 153,copy=n,count=0,temp=0;

while(n!=0)
{

 count++;
 n/=10;
}
while(copy !=0)

{

 temp = copy%10;

double d = Math.pow(temp,count);


   

}
*/




/*
// prime --> a number divsble 1 by it self.

//so to start the strt =2 and end at = last digit.

  int n =7,count=0;

for(int i =2; i<=n/2; i++) //2<=4
{

 if(n%i==0)

  {

   count++;
  }

}
System.out.println(count==0?"prime":"not prime");


 */






//fidnociseris
/*

int f =0;
int s =1;
int t = 0;
int n =3;

for(int i=0;i<=n;i++)

{

t= f+s;

f=s;
s = t;


}
System.out.println(f);

*/



/*
  // prime are not

 int n = 7,count=0;

for(int i=0;i<n;i++)
{

   if(n%i==0)
   {

    count++;

   }

    
}
if(count==2)
{
 System.out.println("prime number");
}
 


*/

/*
int n = 123,count=0;

 for (int i = 2 ; i<=n/2 ; i++)
{

 if(n%i==0)
{
 count++;
}   

if(count==0)
{
System.out.println("pprime");

}
}

*/

/*
int  n = 100; 
int first = 0;
int second = 1;

System.out.println("fibonacci series till "+ n +"terms");

for(int i=1;i<=n;i++)   //1<=10  //2  //3 
{

System.out.println(first+ ", ");  //0 //1 //

//computer the terms

int nextterm = first+second; //1  //2
first = second;              //1  //1
second = nextterm;           //1  //2


  

}


*/

/*

int n =234567;

while(n!=0)

{
 
 int rem = n%10;
 
   int count=0;
   for(int i=1;i<=rem/2;i++) 
    { 
      
    if(rem%i==0)
         count++;
    }
   if(count ==1)
    System.out.println(rem);
 

n/=10;
}


*/

/* 
//rala e problem

int n = 124564,rem=0;


while(n!=0)
{

rem = rem%10;

 int sum=1;
for(int i=1 ; i<=rem ; i++)      //factorial 5 = 5*4*3*2*1 
{

     sum= sum *i;
  
} 
 System.out.println(sum);




n/=10;

}

*/

//=============================================================

//plaindrom are prime problem

/*
int n = 131,rev=0,copy=n;

while(n!=0)
{

rev= rev*10+(n%10);


n/=10;
}

if(copy == rev)
{


  //copy 
  int count=0;
  for(int i=2;i<=copy/2;i++)
  {
   
   if(copy%i==0)

      {
        count++;

      }

  }
 
if(count==0)
{

System.out.println("palindrom prime");

}
  

}

*/
//==================================================================

 //==================factorial ===========================

/*
int n = 5,sum=1;



for(int i =1; i<=n;i++)
//for(int i=n; i>=1; i--)
{


  sum=sum*i;



}
System.out.println(sum);    
  
*/


//========extract digit find each digit factroial=========
/*

int n = 12356,temp=0;

while(n!=0)
{

 temp= n%10;

int sum=1; 
 for(int i =1 ; i<=temp ; i++)
{

 sum =sum*i;

}
System.out.println(temp +" the factoreial"+sum);

 n/=10;
}


*/

//=====1 t0 1000 palinderom  or panlidrom ===


/*
int n = 121;

    while(n!=0)
    {
     
    temp=n%10;
    
 
     n/=10;
     }

*/

//=====print 1 to 100 amstrong


int n = 153,temp=0;

while(n!=0)
{

temp = temp%10;



n/=10;

}














     




}


}