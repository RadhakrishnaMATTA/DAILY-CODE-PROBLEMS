// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,3,5,1};
        boolean b []= new boolean[arr.length];
        
        for(int i=0;i<arr.length;i++)//fix the variable
        {
            if(b[i]==true)
            {
                
                continue;
            }
            
               int count =1; //
            for(int j=i+1; j<arr.length; j++)//iteration
            {
              
                if(arr[i]==arr[j])
                {
                    count++;
                    
                 b[j] = true;
                 
                }
            
                
            }
            
            if(count==1)
            {
                System.out.println(arr[i]);
            }
            
            
            
        }
    }
}
