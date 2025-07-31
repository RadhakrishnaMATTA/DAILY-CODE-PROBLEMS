class Main
{

public static void main(String args[])

{


int n = 123456,temp,count=0;

while(n!=0)
{
 temp = n%10;

if(temp%2==0)
{
count++;
System.out.println(temp);
}

 n/=10;
}

System.out.println("this is the even count"+count);


}

}
