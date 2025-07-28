
class Main {
    public static void main(String[] args) {
       
      
    for(int i=1; i<=200; i++)
    {
      
      if(i>='A' && i<='Z')
      {
         System.out.println(i+"     ---->"+(char)(i+32));
         
      }
      else if( i>='a' && i<='z')
      {
          
          System.out.println(i+"    ---> "+(char)(i-32));
      }
     
    }
    
}
    
}
