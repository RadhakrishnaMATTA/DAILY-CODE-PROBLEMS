class Main

{

public static void main(String args[])


{



//write a program sum of digits

int n = 1234,temp=0,sum=0;

while(n!=0)
{

temp=n%10;
sum+=temp;//sum=sum+temp;
  
 n/=10;

}
System.out.println(sum);



}


}
