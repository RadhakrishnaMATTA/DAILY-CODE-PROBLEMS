class Main

{

public static void main(String args[])
{

int n = 12345,temp=0;
double sum=0;

while(n!=0)
{

temp=n%10;
sum=temp*temp;
System.out.println(sum);
n/=10;
}




}


}
