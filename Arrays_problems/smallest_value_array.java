// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
       
       int arr[] ={1,2,3,4,5,5};
       int min=arr[0];
       for(int i=1 ; i<arr.length; i++)
        {
            
            
            if( arr[i] < min) //2<1,3<1,4<1,0<1 0<1
              {
                  
                  min=arr[i];
                  
              }
            
        }
       
            System.out.println(min);
      
        
       
       
    }
}
