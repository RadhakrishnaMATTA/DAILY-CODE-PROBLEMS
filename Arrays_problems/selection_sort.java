// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int arr[] = {1,23,5,7,8,0};
        
        for(int i=0; i<arr.length; i++)
        {
            
            int min = i; //0
            
            for(int j=i+1; j<arr.length; j++)
            {
                
                if( arr[j] < arr[min])
                 {
                     
                     min=j;
                     
                 }
                
                
            }
            int temp = arr[min];
            arr[min]= arr[i];
            arr[i]= temp;
            
        }
        for(int temp: arr)
        {
            
            
            System.out.println(temp);
        }
    }
}
