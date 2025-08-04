

class Main {
    public static void main(String[] args) {
     
     int  n = 1234565;
     boolean b = false;
     
     while(n!=0)
     {
         int rem = n%10;
         
         
         if(rem==6)
         {
             
             System.out.println("digit found");
             b = true;
             
         }
         
         
         n/=10;
         
     }
     
    if( !b)
    {
        
    
    System.out.println("element not found");
    }
     
    }
}
