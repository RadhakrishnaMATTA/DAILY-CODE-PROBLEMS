
class Main {
    public static void main(String[] args) {
        
        int n = 12345,rev=0,temp=0;
        
        while(n!=0)
        {
           
            rev = rev*10+(n%10); 
            
            n/=10;
            
        }
       
       
       
       while(rev!=0)
       {
          
        temp = rev%10;
        switch( temp )
        {
        
        case 1:
            System.out.print("one");
            break;
            
        case 2:
            System.out.print("two");
            break;
        
        case 3:
            System.out.print("three");
            break;
            
        case 4:
            System.out.print("four");
            break;
            
        case 5:
            System.out.print("five");
            break;
        case 6:
            System.out.print("six");
            break;
            
        case 7:
            System.out.print("seven");
            break;
        case 8:
            System.out.print("eight");
            break;
        case 9:
            System.out.print("nine");
            break;
        case 0:
            System.out.print("zero");
            break;
            
            
        }
        
        rev/=10;
       }
            
        }
        
        
    
}
