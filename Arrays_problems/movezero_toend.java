// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
       
       int arr[] ={1,2,3,0,0,4,6,6,0};
       int j=1;
       
       for(int i=0;i<arr.length;i++)
       {
           
            if(arr[i]==0)
            {
                
                j=i;
                break;
            }
            
       }
       
       
       for(int i=j+1;i<arr.length;i++)
       {
           
           
           if(arr[i]!=0)
           {
               // do swap
               
               int temp = arr[i];
               arr[i]= arr[j];
               arr[j]= temp;
               j++;
               
               
           }
       }
       
       
       for(int a:arr)
       {
           
           System.out.println(a);
       }
       
       
    }
}
