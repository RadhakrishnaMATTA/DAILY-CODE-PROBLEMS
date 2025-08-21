class Main

{

public static void main(String args[])
{

int n = 12345,temp=0,rev=0;

while(n!=0)               //t       //t     //t   //t   //t  //0
{

temp = n%10;             //5       //4    //3   //2    //1

rev = rev*10 +temp;       //5     //54    //543  //5432 //54321

n/=10;                  //1234     //123   //12  //1    //0  
}

System.out.println(rev);
}


}
