class Main

{

public static void main(String args[])


{

//find the  number of digits 

int n = 123445,temp=0,count=0;
while(n!=0) //t       //t    //t  //t  //t    //t   //f
{

temp= n%10;  //5      //4    //4   //3   //2   //1

count++;      //1     //2    //3   //4   //5   //6
 n/=10;       //12344  //1234 //123 //12  //1  //0

}
System.out.println(count);



}


}
