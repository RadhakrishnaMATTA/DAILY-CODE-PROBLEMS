class Main
{

public static void main(String args[])

{

int n =3345785;
int smallest = 9;
int biggest = 0;

while(n!=0)
{

int digit = n%10;

 if(digit <smallest)
 {
  
 smallest=digit;
 }

 if(digit>biggest)
 {

 biggest = digit;
 }


n/=10;
}

System.out.println(smallest+" "+biggest);





}

}
