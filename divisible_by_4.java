

class Main {
    public static void main(String[] args) {

  int n = 12345645,count=0;
  
  while(n!=0)
  {
      count++;
      
      n/=10;
      
  }
  System.out.println(count);
 
  if( count%4==0)
  {
      
      System.out.println( "0divisible");
      
  }

    }
}
