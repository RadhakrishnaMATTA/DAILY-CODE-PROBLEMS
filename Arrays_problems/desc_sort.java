public static void descending_sort(int arr[])
     {
         
        for(int i=0;i<arr.length;i++)
        {
            int max =i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]>arr[max])
                {
                   max=j; 
                    
                }
                
            }
            int temp = arr[i];
            arr[i]= arr[max];
            arr[max]= temp;
            
            
        }
        
        for(int a : arr)
        {
            
            System.out.print(a);
        }
         
         
         
     }