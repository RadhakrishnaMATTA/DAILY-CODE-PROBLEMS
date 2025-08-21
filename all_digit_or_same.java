
class Main {
    public static void main(String[] args) {
        
        
         int n =111,rev=0;
         boolean b = false;
         
         int temp = n%10;//extract 
         
         while(n!=0)
         {
             
          rev = n%10;
          
          if( rev!=temp)
          {
              b = true;
              
          }
             
             
            n/=10; 
         }
         if(b == false)
         {
             System.out.println("elent same");
             
         }
         else
         System.out.println("elemen not found");
        
         
         
         
         
         
            
        }
    
}
