//method -1
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
 
// method -2

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

