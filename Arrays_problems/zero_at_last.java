

class Main {
    public static void main(String[] args) {
       
       int arr[] ={1,3,0,5,6,0,6,0,8,0,0,0};
       
       //to find the first zero occurance 
       int j=-1;
       for(int i=0; i<arr.length;i++)
       {
           
           if(arr[i]==0)
           {
               
               j=i;
               break;
               
           }
           
           
       }
       //
       
       for(int i=j+1;i<arr.length;i++)
       {
           
           if(arr[i]!=0)
           {
               //do swap
               
             int temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;
             j++;
               
           }
           
           
       }
       
       
       
       for(int t : arr)
       System.out.println(t);
       
       
    }
}
