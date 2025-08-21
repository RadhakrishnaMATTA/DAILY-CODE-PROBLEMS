// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        
        
         int  n = 1111,count=0;
         int copy = n,sum=0,sum1=0;
         
         while(n!=0)
         {
             count++;
             
            n/=10; 
             
         }
          n = copy;
         int laste = n%(int)Math.pow(10,count/2);
         int first = n/(int)Math.pow(10,count/2);
         //System.out.println(laste);
         //System.out.println(first);
         
         while(laste!=0)
         {
             sum += laste%10;
             
             laste/=10;
             
         }
         System.out.println(sum);
         
         while(first!=0)
         {
             sum1 += first%10;
             
             first/=10;
             
         }
         System.out.println(sum1);
         
         System.out.println(sum == sum1? "lucky number":"not luckey" );
         
         
         
         
         
         
         
            
        }
    
}
