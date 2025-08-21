// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,3,5,1};
        boolean b []= new boolean[arr.length];
        
        
        for(int x=0 ;x<arr.length;x++)//fix firs variable
        {
            if(b[x]==true)
            {
                continue;
            }
            
            int count=1;
            for(int y=x+1;y<arr.length;y++)
            {
                
                if(arr[x]==arr[y])
                {
                   count++;
                   b[y]=true;
                    
                }
                
            }
            //if(count>1)
           // {
                
                System.out.println(arr[x] + " count==> "+ count);
            //}
            
            
            
        }
        
    }
}
