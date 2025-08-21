class Main

{

public static void main(String args[])
{

// pallindrom are not
int n = 121,temp=0,rev=0,copy=n;

while(n!=0)                    //t      //t              //t     //f
{

temp = n%10;                   //1        //2            //3   
rev= rev*10+temp;              //0*0+1=1  //10*1+2=12   //120+1=121

n/=10;                         //12         //1         //0


}
System.out.println(copy==rev?"palindrom":"not palidrom");


}


}
