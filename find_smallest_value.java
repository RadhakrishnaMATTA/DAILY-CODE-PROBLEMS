class Main
{

public static void main(String args[])

{

//find the smallest value in the digit

int n = 3453635;
int smallest = 9;
while(n!=0)
{
int digit = n%10;
// digit value is smalllr chage it
if(digit<smallest)
{

smallest=digit;

}

n/=10;
}
System.out.println(smallest);

}

}
