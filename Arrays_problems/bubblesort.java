// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
       
       int arr[] = {4,3,6,7,0};
       
       
       
     
          for(int i=0;i<arr.length-1; i++)
          {
          
          for(int j=0;j<arr.length-1;j++)
          {
              
              if(arr[j]>arr[j+1])
              {
                  //doswap
                  
                 int temp = arr[j];
                 
                 arr[j]= arr[j+1];
                 
                 arr[j+1]= temp;
                  
                  
              }
              
              
          }
          
          }
       
       for(int temp: arr)
       System.out.println(temp);
       
    }
}